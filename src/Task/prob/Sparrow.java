package Task.prob;

public class Sparrow {
	
	private String name;
	private int legs;
	private int length;
		
	public void fly() {
		System.out.println("참새(" + getName()  +")가 날아다닙니다.");
	}
	public void sing() {
		System.out.println("참새(" + getName()  + ")가 소리내어 웁니다.");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return ("참새의 이름은 " + getName() + " 입니다.");
	}

	
	
}
