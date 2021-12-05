package ua.lviv.lgs.HomeWork_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData 
{
    public static void main( String[] args )
    {
        final String DRIVER = "com.mysql.cj.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost/furnituredatabase";
        String userName = "root";
		String userPassword = "mimoza";
		
		try {
			Class.forName(DRIVER).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection(URL, userName, userPassword);
				Statement statement = connection.createStatement();
				ResultSet resultset = statement.executeQuery("SELECT * FROM kitchen")) {
			
			while(resultset.next()) {
				System.out.println(resultset.getInt("ID"));
				System.out.println(resultset.getString("NAME"));
				System.out.println(resultset.getString("MATERIAL"));
				System.out.println(resultset.getFloat("PRICE"));
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
