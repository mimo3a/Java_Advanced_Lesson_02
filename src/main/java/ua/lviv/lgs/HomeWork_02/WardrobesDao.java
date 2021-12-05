package ua.lviv.lgs.HomeWork_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WardrobesDao {
	private static String READ_ALL = "SELECT * FROM wardrobes";
	private static String CREATE = "INSERT INTO wardrobes (WARDROBE_NAME, WARDROBE_COLOR, WARDROBE_DOORS) VALUES(?,?,?)";
	private static String READ_BY_ID = "SELECT * FROM wardrobes WHERE WARDROBE_ID = ?";
	private static String UPDATE_BY_ID = "UPDATE wardrobes SET WARDROBE_NAME = ?, WARDROBE_COLOR = ?, WARDROBE_DOORS = ? WHERE WARDROBE_ID = ?";
	private static String  DELETE_BY_ID = "DELETE FROM wardrobes WHERE WARDROBE_ID = ?";
	
	PreparedStatement preparedStatement;
	Connection connection;
	
	public WardrobesDao(Connection connection) {
		this.connection = connection;
	}
	public void readAll() throws SQLException {
		preparedStatement = connection.prepareStatement(READ_ALL);
		ResultSet executeQuery = preparedStatement.executeQuery();
		while(executeQuery.next()) {
			System.out.println(executeQuery.getInt("WARDROBE_ID"));
			System.out.println(executeQuery.getString("WARDROBE_NAME"));
			System.out.println(executeQuery.getString("WARDROBE_COLOR"));
			System.out.println(executeQuery.getInt("WARDROBE_DOORS"));			
		}
	}
	
	public void insert(Wardrobes wardrobe) throws SQLException {
		preparedStatement = connection.prepareStatement(CREATE);
		preparedStatement.setString(1, wardrobe.getWardrobeName());
		preparedStatement.setString(2, wardrobe.getWardrobeColor());
		preparedStatement.setInt(3, wardrobe.getWardrobeDoors());
		preparedStatement.execute();
				
	}
	
	public void readById(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(READ_BY_ID);
		preparedStatement.setInt(1, id);
		ResultSet executeQuery = preparedStatement.executeQuery();
		while(executeQuery.next()) {
			System.out.println(executeQuery.getInt("WARDROBE_ID"));
			System.out.println(executeQuery.getString("WARDROBE_NAME"));
			System.out.println(executeQuery.getString("WARDROBE_COLOR"));
			System.out.println(executeQuery.getInt("WARDROBE_DOORS"));			
		}
		
	}
	
	public void updateById(Wardrobes wardrobe) throws SQLException {
		preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
		preparedStatement.setString(1, wardrobe.getWardrobeName());
		preparedStatement.setString(2, wardrobe.getWardrobeColor());
		preparedStatement.setInt(3, wardrobe.getWardrobeDoors());
		preparedStatement.setInt(4, wardrobe.getWardrobeId());
		preparedStatement.execute();
	}
	
	public void deleteById(int id) throws SQLException {
		preparedStatement = connection.prepareStatement( DELETE_BY_ID);
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
	}

}
