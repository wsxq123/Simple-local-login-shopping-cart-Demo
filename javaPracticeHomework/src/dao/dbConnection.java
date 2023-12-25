package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

	public static void main(String[] args) {
		System.out.println(dbConnection.getDB());
	}

	private static Connection getDB() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
		String password = "12345";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}
}
