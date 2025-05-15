package object;

public class Owner {
	
	private String name;
	private String cellPhone;
	
	
	public Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null | this.getClass() != o.getClass()) return false;
		if(o instanceof Owner) {
			Owner ow = (Owner) o;
			if(this.getName().equals(ow.getName())) {
				return true;
			} 
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return "이름은 " + this.getName() + "이고, 핸드폰 번호는 " + this.getCellPhone() + "입니다.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	
	
	
	
	

}
