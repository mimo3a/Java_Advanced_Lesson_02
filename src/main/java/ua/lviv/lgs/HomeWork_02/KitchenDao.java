package ua.lviv.lgs.HomeWork_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KitchenDao {
	private static String READ_ALL = "SELECT * FROM kitchens";
	private static String CREATE = "INSERT INTO kitchens (KITCHEN_NAME, KITCHEN_MATERIAL, KITCHEN_PRICE) VALUES (?,?,?)";
	private static String READ_BY_ID = "SELECT * FROM kitchens WHERE KITCHEN_ID = ?";
	private static String UPDATE_BY_ID = "UPDATE kitchens SET KITCHEN_NAME = ?, KITCHEN_MATERIAL = ?, KITCHEN_PRICE = ? WHERE KITCHEN_ID = ?";
	private static String DELETE_BY_ID = "DELETE FROM kitchens WHERE KITCHEN_ID = ?";

	private PreparedStatement preparedStatement;
	private Connection connection;

	public KitchenDao(Connection connection) {
		this.connection = connection;
	}

	public void insert(Kitchen kitchen) throws SQLException {
		preparedStatement = connection.prepareStatement(CREATE);
		preparedStatement.setString(1, kitchen.getKitchenName());
		preparedStatement.setString(2, kitchen.getKitchenMeterial());
		preparedStatement.setFloat(3, kitchen.getKitchenPreice());
		preparedStatement.executeUpdate();

	}

	public void readAll() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet executeQuery = statement.executeQuery(READ_ALL);
		while (executeQuery.next()) {
			System.out.println(executeQuery.getInt("KITCHEN_ID"));
			System.out.println(executeQuery.getString("KITCHEN_NAME"));
			System.out.println(executeQuery.getString("KITCHEN_MATERIAL"));
			System.out.println(executeQuery.getFloat("KITCHEN_PRICE"));

		}

	}

	public void readById(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(READ_BY_ID);
		preparedStatement.setInt(1, id);
		ResultSet executeQuery = preparedStatement.executeQuery();
		while (executeQuery.next()) {
			System.out.println(executeQuery.getInt("KITCHEN_ID"));
			System.out.println(executeQuery.getString("KITCHEN_NAME"));
			System.out.println(executeQuery.getString("KITCHEN_MATERIAL"));
			System.out.println(executeQuery.getFloat("KITCHEN_PRICE"));

		}

	}
	public void update(Kitchen kitchen) throws SQLException {
		preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
		preparedStatement.setString(1, kitchen.getKitchenName());
		preparedStatement.setString(2, kitchen.getKitchenMeterial());
		preparedStatement.setFloat(3, kitchen.getKitchenPreice());
		preparedStatement.setInt(4, kitchen.getKitchenId());
		preparedStatement.executeUpdate();
	}
	public void delele(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(DELETE_BY_ID);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
	}

}
