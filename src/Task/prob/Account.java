package Task.prob;

public class Account {
	
	private String accNo;
	private int balance;
	
	public Account() {

	}
	
	public Account(String accNo, int balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	
	public void save(int money) {
		this.balance += money;
		System.out.println(getAccNo() + " 계좌" + money + "만원이 입금되었습니다.");
	}
	
	
	public void deposit(int money) {
		this.balance -= money;
		System.out.println(getAccNo() + " 계좌" + money + "만원이 출금되었습니다.");
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public String getAccNo() {
		return this.accNo;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println( getAccNo() + " 계좌가 개설되었습니다.");
	}
	
	
	

}
