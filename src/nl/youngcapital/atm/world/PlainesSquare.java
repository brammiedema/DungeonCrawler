package nl.youngcapital.atm.world;

public class PlainesSquare extends Square{
	final private static String DEFAULT_DESCRIPTION = "You find yourself in the middle of a stretch of plaines.";
	private String description;
	
	public PlainesSquare() {
		this.description=DEFAULT_DESCRIPTION;
	}
	
	public PlainesSquare(String description){
		this.description = description;
	}
	
	public String getDescription(){
		
		return this.description;
	}

}
