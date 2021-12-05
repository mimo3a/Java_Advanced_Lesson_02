package ua.lviv.lgs.HomeWork_02;

public class Beds {
	private int badId;
	private String badName;
	private String badMeterial;
	private int badLength;
	private int badWidth;
	
	public Beds(int badId, String badName, String badMeterial, int badLength, int badWidth) {
		
		this.badId = badId;
		this.badName = badName;
		this.badMeterial = badMeterial;
		this.badLength = badLength;
		this.badWidth = badWidth;
	}
	
	public Beds(String badName, String badMeterial, int badLength, int badWidth) {
				
		this.badName = badName;
		this.badMeterial = badMeterial;
		this.badLength = badLength;
		this.badWidth = badWidth;
	}

	public int getBadId() {
		return badId;
	}

	public void setBadId(int badId) {
		this.badId = badId;
	}

	public String getBadName() {
		return badName;
	}

	public void setBadName(String badName) {
		this.badName = badName;
	}

	public String getBadMeterial() {
		return badMeterial;
	}

	public void setBadMeterial(String badMeterial) {
		this.badMeterial = badMeterial;
	}

	public int getBadLength() {
		return badLength;
	}

	public void setBadLength(int badLength) {
		this.badLength = badLength;
	}

	public int getBadWidth() {
		return badWidth;
	}

	public void setBadWidth(int badWidth) {
		this.badWidth = badWidth;
	}

	@Override
	public String toString() {
		return "Bads [badId=" + badId + ", badName=" + badName + ", badMeterial=" + badMeterial + ", badLength="
				+ badLength + ", badWidth=" + badWidth + "]";
	}
	
	
	
	
	

}
