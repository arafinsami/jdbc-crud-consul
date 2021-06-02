package com.crud.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dabaseutils {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	private static final String HOST = "localhost";

	private static final String PORT = "3306";

	private static final String DATABASE = "crud";

	private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

	private static final String USER = "root";

	private static final String PASSWORD = "";

	public static Connection connect() {

		Connection connection = null;

		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connected");
		} catch (Exception e) {
			System.out.println("Not Connected " + e);
		}
		return connection;
	}

	public static void main(String[] args) {
		connect();
	}
}
