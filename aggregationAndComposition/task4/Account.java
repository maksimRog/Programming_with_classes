package task4;

public class Account implements Comparable<Account>{
	private int number;
	private int balance;
	private boolean isBlocked;
	public int getNumber() {
		return number;
	}
	
	
	@Override
	public String toString() {
		String s=", Не блокирован.";
		if(isBlocked){
			s=", Блокирован";
		}
		return "Счет номер: "+number+", Баланс: "+balance+s ;
	}


	public Account(int number, int balance, boolean isBlocked) {
		super();
		this.number = number;
		this.balance = balance;
		this.isBlocked = isBlocked;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean isBlocked() {
		return isBlocked;
	}
	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}


	@Override
	public int compareTo(Account o) {
		if(this.getNumber()>o.getNumber()){
			return 1;
		}else if(this.getNumber()<o.getNumber()){
			return -1;
		}else {
			return 0;
		}
		
	}

}
