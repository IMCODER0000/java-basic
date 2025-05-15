package test;

public abstract class Factory {
	
	private int openHour;
	private int closeHour;
	private String name;
	
	public Factory(int openHour, int closeHour, String name) {
		super();
		this.openHour = openHour;
		this.closeHour = closeHour;
		this.name = name;
	}



	public String getFactoryName() {
		return name;
	}



	public int getWorkingTime() {
		return  closeHour - openHour;
	}
	
	public abstract int makeProducts(char skill);
	
	
	

}
