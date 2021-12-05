package ua.lviv.lgs.HomeWork_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BedsDao {
	private static String READ_ALL = "SELECT * FROM beds";
	private static String CREATE = "INSERT INTO beds (BED_NAME, BED_MATERIAL, BED_LENGTH, BED_WIDTH) VALUES (?,?,?,?)";
	private static String READ_BY_ID = "SELECT * FROM beds WHERE BED_ID = ?";
	private static String UPDATE_BY_ID = "UPDATE beds SET BED_NAME = ?, BED_MATERIAL = ?, BED_LENGTH = ?, BED_WIDTH = ?" +
	" WHERE BED_ID = ?";
	private static String DELETE_BY_ID = "DELETE FROM beds WHERE BED_ID = ?";
	
	
	private PreparedStatement preparedStatement;
	private Connection connection;
	
	public BedsDao( Connection connection) {
		
		this.connection = connection;
	}
	
	public void readAll() throws SQLException {
		preparedStatement = connection.prepareStatement(READ_ALL);
		ResultSet executeQuery = preparedStatement.executeQuery();
		while(executeQuery.next()) {
			System.out.println(executeQuery.getInt("BED_ID"));
			System.out.println(executeQuery.getString("BED_NAME"));
			System.out.println(executeQuery.getString("BED_MATERIAL"));
			System.out.println(executeQuery.getString("BED_LENGTH"));
			System.out.println(executeQuery.getString("BED_WIDTH"));
			
		}
	}
	
	public void insert(Beds bed) throws SQLException {
		preparedStatement = connection.prepareStatement(CREATE);
		preparedStatement.setString(1, bed.getBadName());
		preparedStatement.setString(2, bed.getBadMeterial());
		preparedStatement.setInt(3, bed.getBadLength());
		preparedStatement.setInt(4, bed.getBadWidth());
		preparedStatement.executeUpdate();
		
	}
	public void readById(int id) throws SQLException {
		preparedStatement= connection.prepareStatement(READ_BY_ID);
		preparedStatement.setInt(1, id);
		ResultSet executeQuery = preparedStatement.executeQuery();
		while(executeQuery.next()) {
			System.out.println(executeQuery.getInt("BED_ID"));
			System.out.println(executeQuery.getString("BED_NAME"));
			System.out.println(executeQuery.getString("BED_MATERIAL"));
			System.out.println(executeQuery.getInt("BED_LENGTH"));
			System.out.println(executeQuery.getInt("BED_WIDTH"));
			
		}
	}
	public void update(Beds bed) throws SQLException {
		preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
		preparedStatement.setString(1, bed.getBadName());
		preparedStatement.setString(2, bed.getBadMeterial());
		preparedStatement.setInt(3, bed.getBadLength());
		preparedStatement.setInt(4, bed.getBadWidth());
		preparedStatement.setInt(5, bed.getBadId());
		preparedStatement.executeUpdate();		
	}
	public void delete(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(DELETE_BY_ID);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
			
		
	}
	
	
			 
	

}
