package nl.youngcapital.atm.world;

public class LemonSquare extends Square{
	final private static String DEFAULT_DESCRIPTION = "You see a giant lemon blocking your way, the way is blocked return to where you came from.";
	private String description;
	
	public LemonSquare() {
		this.description=DEFAULT_DESCRIPTION;
	}
	
	public LemonSquare(String description){
		this.description = description;
	}
	
	public String getDescription(){
		
		return this.description;
	}

}
