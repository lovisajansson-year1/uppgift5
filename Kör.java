package uppgift5;
public class Kör{

	public static void main(String[] args) {

		//nytt PersonRegister som skapar en array
		PersonRegister register = new PersonRegister();
		
		//ny person som skapar en array, tilldela attribut genom åtkomstmetoder
		Person p = new Person(); 
		p.setName("Person1");
		p.setpNbr("10");
		
		//nytt konto
		Account a = new Account();
		a.setNbr("1");
		a.setBalance(32);
		
		//lägg till konto i den array som skapades när man skapade personen p
		p.addAccount(a);
		
		a = new Account();
		a.setNbr("2");
		a.setBalance(22);		
		
		p.addAccount(a);
		
		register.addPerson(p);//lägg till person i register
		
		p = new Person();
		p.setName("Person2");
		p.setpNbr("20");
		
		a = new Account();
		a.setNbr("3");
		a.setBalance(199);
		
		p.addAccount(a);
		
		a = new Account();
		a.setNbr("4");
		a.setBalance(200);
		
		p.addAccount(a);
		
		register.addPerson(p);
		
		for(Person tmp: register.getPersoner()) { //kontrollerar så att personer och konton är inlagda
			System.out.print("\n" + "I registret finns " + tmp.getName() + " & hen har konton: ");
			double balance=0;
			for (Account x: tmp.getAccounts()) {
				System.out.print(x.getNbr() + " ");
				balance += x.getBalance();
			}
		System.out.print(" med totala saldot " +balance);		
		}
		
		//kontrollera find och remove metoder
		System.out.println("\nPersoner i register:");
		for(Person tmp: register.getPersoner()) {
			System.out.println(tmp.getName()+" "); 
		}
		register.removePerson("10"); //tar bort person 
		System.out.println("Personer i register:");
		for(Person tmp: register.getPersoner()) {
			System.out.println(tmp.getName()); //skriver ut alla personers namn i arrayen, man ser att det är en kvar
		}
		
		
		
	}
}
					

	


