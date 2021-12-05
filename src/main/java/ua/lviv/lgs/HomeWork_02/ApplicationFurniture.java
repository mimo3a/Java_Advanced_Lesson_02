package ua.lviv.lgs.HomeWork_02;

import java.sql.Connection;
import java.sql.SQLException;



public class ApplicationFurniture {
	public static void main(String[] args) {
		Connection connection = ConnectionUtilite.getConnection();
		DataBase.createNewBase(connection);
		TablesOfBase.createNewTables(connection);
		KitchenDao kitchenDao = new KitchenDao(connection);
		try {
			kitchenDao.insert(new Kitchen("Lila", "Wood", 12345));
			kitchenDao.insert(new Kitchen("Nona", "MDF", 1234));
			kitchenDao.insert(new Kitchen("Marta", "SP", 234));
			
			kitchenDao.readAll();
			kitchenDao.readById(2);
			kitchenDao.update(new Kitchen(1,"Sonya", "RedWood", 5433));
			kitchenDao.readAll();
			kitchenDao.delele(2);
			kitchenDao.readAll();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		BedsDao bedsDao = new BedsDao(connection);
		try {
			bedsDao.insert(new Beds("Paris", "Wood", 2000, 1600));
			bedsDao.insert(new Beds("London", "SP", 2000, 1800));
			bedsDao.insert(new Beds("Madrid", "MDF", 2000, 1400));
			bedsDao.insert(new Beds("Berlin", "Wood", 2200, 2000));
			
			bedsDao.readAll();
			bedsDao.readById(2);
			bedsDao.update(new Beds(3,"Kyiv", "Eiche", 2000, 1800));
			bedsDao.readAll();
			bedsDao.delete(2);
			bedsDao.readAll();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		TablesDao tableDao = new TablesDao(connection);
		try {
			tableDao.insert(new Tables("Richard", "Oak", 546));
			tableDao.insert(new Tables("Hartwig", "Nuss", 1054));
			tableDao.insert(new Tables("Rudolf", "Fichte", 354));
			tableDao.insert(new Tables("Wilfrid", "Klen", 865));
			tableDao.readAll();
			tableDao.readById(3);
			tableDao.updateById(new Tables(1,"Jonas", "Eiche", 874));
			tableDao.deleteById(2);
			tableDao.readAll();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		WardrobesDao wardrobeDao = new WardrobesDao(connection);
		try {
			wardrobeDao.insert(new Wardrobes("China", "Yellow", 3));
			wardrobeDao.insert(new Wardrobes("Germany", "Black", 5));
			wardrobeDao.insert(new Wardrobes("France", "Green", 2));
			wardrobeDao.insert(new Wardrobes("America", "Blue", 4));
			wardrobeDao.readAll();
			wardrobeDao.readById(3);
			wardrobeDao.updateById(new Wardrobes(2,"England", "Red", 3));
			wardrobeDao.readById(2);
			wardrobeDao.deleteById(1);
			wardrobeDao.readAll();
			
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		
	}

}
