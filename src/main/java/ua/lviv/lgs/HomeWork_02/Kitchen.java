package ua.lviv.lgs.HomeWork_02;

public class Kitchen {
	private int kitchenId;
	private String kitchenName;
	private String kitchenMeterial;
	private float kitchenPreice;
	
	
	
	public Kitchen(int kitchenId, String kitchenName, String kitchenMeterial, float kitchenPreice) {
		
		this.kitchenId = kitchenId;
		this.kitchenName = kitchenName;
		this.kitchenMeterial = kitchenMeterial;
		this.kitchenPreice = kitchenPreice;
	}
	public Kitchen(String kitchenName, String kitchenMeterial, float kitchenPreice) {
		
		this.kitchenName = kitchenName;
		this.kitchenMeterial = kitchenMeterial;
		this.kitchenPreice = kitchenPreice;
	}
	
	public String getKitchenName() {
		return kitchenName;
	}
	public void setKitchenName(String kitchenName) {
		this.kitchenName = kitchenName;
	}
	public String getKitchenMeterial() {
		return kitchenMeterial;
	}
	public void setKitchenMeterial(String kitchenMeterial) {
		this.kitchenMeterial = kitchenMeterial;
	}
	public float getKitchenPreice() {
		return kitchenPreice;
	}
	public void setKitchenPreice(float kitchenPreice) {
		this.kitchenPreice = kitchenPreice;
	}
	public int getKitchenId() {
		return kitchenId;
	}
	public void setKitchenId(int kitchenId) {
		this.kitchenId = kitchenId;
	}
	@Override
	public String toString() {
		return "Kitchen [kitchenId=" + kitchenId + ", kitchenName=" + kitchenName + ", kitchenMeterial="
				+ kitchenMeterial + ", kitchenPreice=" + kitchenPreice + "]";
	}
	
	
	
	

}
