package test;

public class TVFactory extends Factory implements IWorkingTogether {

	public TVFactory( String name, int openHour, int closeHour) {
		super(openHour, closeHour, name);
	}
	
	public int makeProducts(char skill) {
		int i = 0;
		switch(skill) {
			case 'A':
				i = 8;
				break;
			case 'B':
				i = 5;
				break;
			case 'C':
				i = 3;
				break;
			default:
				i = 1;
				break;
		}
		
		return i * super.getWorkingTime();
	}
	
	public int workTogether(IWorkingTogether partner) {
		return 3 * super.getWorkingTime();
	}
	
	

}
