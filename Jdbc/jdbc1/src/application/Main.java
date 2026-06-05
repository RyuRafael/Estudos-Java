package application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Main {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		// Preparar um comando sql
		PreparedStatement st = null;
		// Contém os dados armazenados em forma de tabela
		ResultSet rs = null;

		try {
			// Conectar com o banco
			conn = DB.getConnection();
			// Inserir dados
			st = conn.prepareStatement(
					"INSERT INTO seller" + "(Name, Email, BirthDate, BaseSalary, DepartmentId)" + "Values (?,?,?,?,?)");

			st.setString(1, "Rafael Ribeiro");
			st.setString(2, "rafaelribeirorodrigues82@gmail.com");
			st.setDate(3, new Date(sdf.parse("03/09/2003").getTime()));
			st.setDouble(4, 4800);
			st.setInt(5, 1);
			st.executeUpdate();

			// Fazer pesquisa
			st = conn.prepareStatement("select * from department");
			rs = st.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt("id") + ", " + rs.getString("Name"));
			}

		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeConnection();
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}

	}
}
