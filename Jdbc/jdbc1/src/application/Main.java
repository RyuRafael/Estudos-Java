package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import db.DB;
import db.DbException;

/*Propriedades do ACID de transações
Última atualização: 2024-01-04

No contexto do processamento de transações, a sigla ÁCIDO refere-se às quatro principais propriedades de uma transação: atomicidade, consistência, isolamento, e durabilidade.

Atomicidade
    Todas as alterações nos dados são realizadas como se fossem uma única operação. Que é, todas as mudanças são realizadas, ou nenhuma delas é.
    Por exemplo, em um aplicativo que transfere fundos de uma conta para outro, a propriedade de atomicidade garante que, se um débito for feito com sucesso de uma conta, o crédito correspondente é feito para a outra conta.
Consistência
    Os dados estão em um estado consistente quando uma transação é iniciada e quando termina.
    Por exemplo, em um aplicativo que transfere fundos de uma conta para outro, o imóvel de consistência garante que o valor total dos fundos em ambas as contas são as mesmas no início e no final de cada transação.
Isolamento
    O estado intermediário de uma transação é invisível para outras transações. Como resultado, as transações que são executadas simultaneamente parecem ser serializadas.
    Por exemplo, em um aplicativo que transfere fundos de uma conta para outro, a propriedade de isolamento garante que outra transação veja o fundos transferidos em uma conta ou na outra, mas não em ambas, nem em nenhuma.
Durabilidade
    Após uma transação concluída com sucesso, as alterações nos dados persistem e não são desfeitos, mesmo no caso de uma falha do sistema.
    Por exemplo, em um aplicativo que transfere fundos de uma conta para outro, o imóvel de durabilidade garante que as alterações efetuadas em cada conta não será revertido.

*/

public class Main {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		// Preparar um comando sql
		Statement st = null;
		// Contém os dados armazenados em forma de tabela
		ResultSet rs = null;
		
		

		try {
			// Conectar com o banco
			conn = DB.getConnection();

			st = conn.createStatement();
			
			// Não confirma as alterações automaticamente
			conn.setAutoCommit(false);

			int line1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2000 WHERE DepartmentId = 1");
			
			// Exeção falsa
			int x = 1;
			
			if(x < 2) {
				throw new SQLException("Fake error");
			}
			
			int line2 = st.executeUpdate("UPDATE seller SET BaseSalary = 7000 WHERE DepartmentId = 2");
			
			// salva as alterações apenas se toda a operação for concluida.
			conn.commit();

			System.out.println("rows1: " + line1);
			System.out.println("rows2: " + line2);

		} catch (SQLException e) {
			// voltar a transação caso aconteça algum erro
			try {
				conn.rollback();
				throw new DbException("Transation rolled back! caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! caused by: " + e1.getMessage());
			}
		} finally {
			DB.closeConnection();
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}

	}
}
