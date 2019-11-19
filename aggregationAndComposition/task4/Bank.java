package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bank {
	private String name;
	private Client[] clients;
	
	public Bank(String name, Client[] clients) {
		super();
		this.name = name;
		this.clients = clients;
	}
	
	
	public Client[] getClients() {
		return clients;
	}


	public void setClients(Client[] clients) {
		this.clients = clients;
	}


	public static int countTotalAmount(Client client){
		Account[]accounts=client.getAccounts();
		int result=0;
		for (int i = 0; i < accounts.length; i++) {
			result=result+accounts[i].getBalance();
		}
		return result;
		
	}
	public static int countNegativeAmount(Client client){
		Account[]accounts=client.getAccounts();
		int result=0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()<0){
				result=result+accounts[i].getBalance();
			}
			
		}
		return result;
		
	}
	public  List<Account>	getAllAccounts(Bank bank){
		List <Account> accounts=new ArrayList<>();
		Client[] clients=bank.getClients();
		for (int i = 0; i < clients.length; i++) {
			accounts.addAll(Arrays.asList(clients[i].getAccounts()));
		}
		Collections.sort(accounts);
		return accounts;
		
	}
	public static int countPositiveAmount(Client client){
		Account[]accounts=client.getAccounts();
		int result=0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>0){
				result=result+accounts[i].getBalance();
			}
			
		}
		return result;
		
	}
	public Account findAccount(int accountNumber){
		Account account=null;
		boolean isStop=false;
		for (int i = 0; i < clients.length&&!isStop; i++) {
			Account[] accounts=clients[i].getAccounts();
			for (int j = 0; j < accounts.length; j++) {
				if(accounts[j].getNumber()==accountNumber){
					account=accounts[j];
					isStop=true;
					break;
				}
			}
		}
		return account;
	}

}
