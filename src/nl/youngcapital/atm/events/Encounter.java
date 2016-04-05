package nl.youngcapital.atm.events;

public interface Encounter {
	static String description = "An event occured!";
	
	public boolean isFriendly();
	
	public String getDescription();	
}
