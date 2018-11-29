package uppgift5;

import java.util.ArrayList;

public class PersonRegister{

	private ArrayList<Person> personer= new ArrayList<Person>(); 
	
	public ArrayList<Person> getPersoner() {
		return personer;
	}
	
	public void setPersoner(ArrayList<Person> nyaPersoner) {
		this.personer = nyaPersoner;
	}
	public void addPerson(Person p) {
			personer.add(p);
	}
	public Person findPerson(String pNbr) {
		for(Person p:personer) { //går igenom personer i array 
			if(p.getpNbr().equals(pNbr)) { //när ett pNbr matchar pNbr i parameters returneras den personen
			return p;
			}
		}	
		return null;
	}
	
	public Person removePerson(String pNbr) {
		for(Person p:personer) { //går igenom personer i array
			if (p.getpNbr().equals(pNbr)) {
			personer.remove(p); //tar bort person vars pNr är samma som dne i parametern
			}
		}
		return null;
	
				
	}
}
				
	


