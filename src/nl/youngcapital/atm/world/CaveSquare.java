package nl.youngcapital.atm.world;

public class CaveSquare extends Square{
	
	final private static String DEFAULT_DESCRIPTION = "You are in a creepy cave. You hear an all too familiar sound.";
	private String description;
	
	public CaveSquare() {
		this.description=DEFAULT_DESCRIPTION;
	}
	
	public CaveSquare(String description){
		this.description = description;
	}
	
	public String getDescription(){
		
		return this.description;
	}


}
