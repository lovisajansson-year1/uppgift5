package uppgift5;
import java.util.ArrayList;

public class Person{
	
	private String pNbr;
	private String name;
	private ArrayList<Account> accounts = new ArrayList<Account>();	
	
	public String getpNbr() {
		return this.pNbr;
	}

	public void setpNbr(String pNbr) {
		this.pNbr = pNbr;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> newAccounts) {
		this.accounts = newAccounts;
	}

	public void addAccount(Account a) {
		this.getAccounts().add(a);
	}
}
