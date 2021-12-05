package ua.lviv.lgs.HomeWork_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TablesDao {
	private static String READ_ALL = "SELECT * FROM tables";
	private static String CREATE = "INSERT INTO tables (TABLE_NAME, TABLE_COLOR, TABLE_PRICE) VALUES (?,?,?)";
	private static String READ_BY_ID = "SELECT * FROM tables WHERE TABLE_ID = ?";
	private static String UPDATE_BY_ID = "UPDATE tables SET TABLE_NAME = ?, TABLE_COLOR = ?, TABLE_PRICE = ? WHERE TABLE_ID = ?";
	private static String DELETE_BY_ID = "DELETE FROM tables WHERE TABLE_ID = ?";
	
	PreparedStatement preparedStatement;
	Connection connection;
	
	public TablesDao(Connection connection) {
		
		this.connection = connection;
	}
	
	public void readAll() throws SQLException {
		preparedStatement = connection.prepareStatement( READ_ALL);
		ResultSet executeQuery = preparedStatement.executeQuery();
		while(executeQuery.next()) {
			System.out.println(executeQuery.getInt("TABLE_ID"));
			System.out.println(executeQuery.getString("TABLE_NAME"));
			System.out.println(executeQuery.getString("TABLE_COLOR"));
			System.out.println(executeQuery.getFloat("TABLE_PRICE"));
					
		}	
	}
	public void insert(Tables table) throws SQLException {
		preparedStatement = connection.prepareStatement(CREATE);
		preparedStatement.setString(1, table.getTableName());
		preparedStatement.setString(2, table.getTableColor());
		preparedStatement.setFloat(3, table.getTablePrice());
		preparedStatement.executeUpdate();
	}
	
	public void readById(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(READ_BY_ID);
		preparedStatement.setInt(1, id);
		ResultSet executeQuery = preparedStatement.executeQuery();
		while(executeQuery.next()) {
			System.out.println(executeQuery.getInt("TABLE_ID"));
			System.out.println(executeQuery.getString("TABLE_NAME"));
			System.out.println(executeQuery.getString("TABLE_COLOR"));
			System.out.println(executeQuery.getFloat("TABLE_PRICE"));					
		}			
	}
	
	public void updateById(Tables table) throws SQLException {
		preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
		preparedStatement.setString(1,table.getTableName());
		preparedStatement.setString(2,table.getTableColor());
		preparedStatement.setFloat(3,table.getTablePrice());
		preparedStatement.setInt(4,table.getTableId());
		preparedStatement.execute();
		
	}
	
	public void deleteById(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(DELETE_BY_ID);
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
	}
	

}
