package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;

public class Main {

	public static void main(String[] args) {

		Connection conn = null;
		// Preparar um comando sql
		PreparedStatement st = null;
		// Contém os dados armazenados em forma de tabela
		ResultSet rs = null;

		try {
			// Conectar com o banco
			conn = DB.getConnection();
			// Fazer pesquisa
			st = conn.prepareStatement("select * from department");
			rs = st.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt("id") + ", " + rs.getString("Name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeConnection();
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}

	}
}
