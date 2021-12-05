package ua.lviv.lgs.HomeWork_02;

public class Wardrobes {
	private int wardrobeId;
	private String wardrobeName;
	private String wardrobeColor;
	private int wardrobeDoors;
	
	public Wardrobes(int wardrobeId, String wardrobeName, String wardrobeColor, int wardrobeDoors) {
		
		this.wardrobeId = wardrobeId;
		this.wardrobeName = wardrobeName;
		this.wardrobeColor = wardrobeColor;
		this.wardrobeDoors = wardrobeDoors;
	}
	
	public Wardrobes(String wardrobeName, String wardrobeColor, int wardrobeDoors) {
				
		this.wardrobeName = wardrobeName;
		this.wardrobeColor = wardrobeColor;
		this.wardrobeDoors = wardrobeDoors;
	}

	public int getWardrobeId() {
		return wardrobeId;
	}

	public void setWardrobeId(int wardrobeId) {
		this.wardrobeId = wardrobeId;
	}

	public String getWardrobeName() {
		return wardrobeName;
	}

	public void setWardrobeName(String wardrobeName) {
		this.wardrobeName = wardrobeName;
	}

	public String getWardrobeColor() {
		return wardrobeColor;
	}

	public void setWardrobeColor(String wardrobeColor) {
		this.wardrobeColor = wardrobeColor;
	}

	public int getWardrobeDoors() {
		return wardrobeDoors;
	}

	public void setWardrobeDoors(int wardrobeDoors) {
		this.wardrobeDoors = wardrobeDoors;
	}

	@Override
	public String toString() {
		return "Wardrobes [wardrobeId=" + wardrobeId + ", wardrobeName=" + wardrobeName + ", wardrobeColor="
				+ wardrobeColor + ", wardrobeDoors=" + wardrobeDoors + "]";
	}
	
	
	
	

}
