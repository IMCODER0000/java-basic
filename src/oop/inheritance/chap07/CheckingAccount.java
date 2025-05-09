package oop.inheritance.chap07;

public class CheckingAccount extends Account {
	
	private String cardNo;
	
	public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}
	
	
	
	
	
	public String getCardNo() {
		return cardNo;
	}





	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}





	public void pay(long amount, String cardNo) {
		if(this.cardNo.equals(cardNo) && amount < this.getBalance()) {
			this.withdraw(amount);
		} else {
			System.out.println("지불이 불가능 합니다.");
		}
	}
	
	

}
