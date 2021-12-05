package ua.lviv.lgs.HomeWork_02;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	Connection connection;
	public static void createNewBase(Connection connection) {
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeUpdate("DROP DATABASE IF EXISTS furnituredatabase ");
			statement.executeUpdate("CREATE DATABASE furnituredatabase CHAR SET UTF8");
			statement.executeUpdate("USE furnituredatabase");	
			System.out.println("Database is created");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}
