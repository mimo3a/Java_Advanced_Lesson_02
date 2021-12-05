package ua.lviv.lgs.HomeWork_02;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TablesOfBase {
	
	Connection connection;
	
	public static void createNewTables(Connection connection) {
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("DROP TABLE IF EXISTS kitchens");
			statement.executeUpdate("CREATE TABLE kitchens ("
					+ "KITCHEN_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"
					+ "KITCHEN_NAME VARCHAR(32) NOT NULL,"
					+ "KITCHEN_MATERIAL VARCHAR(32) NOT NULL,"
					+ "KITCHEN_PRICE FLOAT NOT NULL)");
			
			
			statement.executeUpdate("CREATE TABLE tables ("
					+ "TABLE_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"
					+ "TABLE_NAME VARCHAR(32) NOT NULL ,"
					+ "TABLE_COLOR VARCHAR(32) NOT NULL,"
					+ "TABLE_PRICE FLOAT NOT NULL)"
					);
					
			
			statement.executeUpdate("CREATE TABLE wardrobes("
					+ "WARDROBE_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"
					+ "WARDROBE_NAME VARCHAR(32) NOT NULL,"
					+ "WARDROBE_COLOR VARCHAR(32) NOT NULL,"
					+ "WARDROBE_DOORS INT NOT NULL)"
					);
			
			
			statement.executeUpdate("CREATE TABLE beds("
					+ "BED_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"
					+ "BED_NAME VARCHAR(32) NOT NULL,"
					+ "BED_MATERIAL VARCHAR(32) NOT NULL,"
					+ "BED_LENGTH INT NOT NULL,"
					+ "BED_WIDTH INT NOT NULL)"
					);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
