package ua.lviv.lgs.HomeWork_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionUtilite {
	
	private static String DRIVER = "com.mysql.cj.jdbc.Driver";
//	private static String URL = "jdbc:mysql://localhost/furnituredatabase";
	private static String URL = "jdbc:mysql://localhost";
	private static String userName = "root";
	private static String userPassword = "mimoza";
	private static Connection connection;
	
	
	public static Connection getConnection() {
		
		try {
			Class.forName(DRIVER).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			
			connection = DriverManager.getConnection(URL, userName, userPassword);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connection;
		
	}
	
}
