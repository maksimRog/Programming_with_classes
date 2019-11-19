package task8;

import java.util.Arrays;

public class Customer {
	private static int counter=0;
	private int id;

	private String name;
	private String surName;
	private String thirdName;
	private int creditCardNumber;
	private int  bankAccountNumber;
	
	
	public Customer( String name, String surName, String thirdName, int creditCardNumber,
			int bankAccountNumber) {
		super();
		counter++;
		id=counter;
		this.name = name;
		this.surName = surName;
		this.thirdName = thirdName;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getThirdName() {
		return thirdName;
	}
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}
	public int getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public int getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return surName+" "+name+", Номер кредитной карты: "+creditCardNumber;
	}
	public static void showInInterval(Customer []customers,int a, int b){
		System.out.println("Номер кредитной карты в диапозоне от "+a+" до "+b);
		for (int i = 0; i < customers.length; i++) {
			if(customers[i].getCreditCardNumber()>=a&&customers[i].getCreditCardNumber()<=b){
				System.out.println(customers[i]);
			}
		}
		
	}
	public static void showInAlphabeticalOrder(Customer []customers){
		System.out.println("Фамилии в алфавитном порядке");
		for (int i = 0; i < customers.length; i++) {
			for (int j = 0; j < customers.length-1-i; j++) {
				String sur1=customers[j].getSurName();
				String sur2=customers[j+1].getSurName();
				if(sur1.trim().charAt(0)>sur2.trim().charAt(0)){
					Customer buffer=customers[j];
					customers[j]=customers[j+1];
					customers[j+1]=buffer;
					
				}
			}
		}
		System.out.println(Arrays.toString(customers));
	}

}
