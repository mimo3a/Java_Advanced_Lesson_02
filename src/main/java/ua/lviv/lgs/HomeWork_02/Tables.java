package ua.lviv.lgs.HomeWork_02;

public class Tables {
	private int tableId;
	private String tableName;
	private String tableColor;
	private float tablePrice;
	
	public Tables(int tableId, String tableName, String tableColor, float tablePrice) {
		
		this.tableId = tableId;
		this.tableName = tableName;
		this.tableColor = tableColor;
		this.tablePrice = tablePrice;
	}
	
	public Tables(String tableName, String tableColor, float tablePrice) {
		
		this.tableName = tableName;
		this.tableColor = tableColor;
		this.tablePrice = tablePrice;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableColor() {
		return tableColor;
	}

	public void setTableColor(String tableColor) {
		this.tableColor = tableColor;
	}

	public float getTablePrice() {
		return tablePrice;
	}

	public void setTablePrice(float tablePrice) {
		this.tablePrice = tablePrice;
	}

	@Override
	public String toString() {
		return "Tables [tableId=" + tableId + ", tableName=" + tableName + ", tableColor=" + tableColor
				+ ", tablePrice=" + tablePrice + "]";
	}
	
	
	

}
