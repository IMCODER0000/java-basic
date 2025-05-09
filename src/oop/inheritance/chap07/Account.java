package oop.inheritance.chap07;

public class Account {
	
	private String accId;
	private long balance;
	private String ownerName;
	
	public Account() {
		
	}
	
	public Account(String accId, long balance, String ownerName) {
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	
	
	
	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void deposit(long amount) {
		this.setBalance(this.getBalance() + amount);
	}
	
	public void withdraw(long amount) {
		this.setBalance(this.getBalance() - amount);
	}
	
	
	
	
	

}
