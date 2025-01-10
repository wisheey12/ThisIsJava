package ch6;

// 19번 문제

public class Account_2 {
	// 필드 선언
	private int balance;
	
	// 상수 선언
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	// Getter
	public int getBalance() {
		return balance;
	}
	
	// Setter
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}

}
