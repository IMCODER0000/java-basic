package test;

public class CarFactory extends Factory implements IWorkingTogether {

	public CarFactory(String name, int openHour, int closeHour) {
		super(openHour, closeHour, name);
	}
	
	public int makeProducts(char skill) {
		int i = 0;
		switch(skill) {
			case 'A':
				i = 3;
				break;
			case 'B':
				i = 2;
				break;
			case 'C':
				i = 1;
				break;
			default:
				i = 0;
				break;
		}
		
		return i * super.getWorkingTime();
	}
	
	public int workTogether(IWorkingTogether partner) {
		return 2 * super.getWorkingTime();
	}

}
