package Task.prob;

public class Duck {
	
	private String name;
	private int legs;
	private int length;
		
	public void fly() {
		System.out.println("오리(" +  getName()  + ")는 날지 않습니다.");
	}
	public void sing() {
		System.out.println( "오리(" +  getName()  + ")가 소리내어 웁니다.");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return ("오리의 이름은 " + getName() + " 입니다.");
	}

	
	
}
