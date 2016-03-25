package nl.youngcapital.atm.world;

public class PlainsSquare extends Square{
	final private static String DEFAULT_DESCRIPTION = "You find yourself in the middle of a stretch of plaines.";
	private String description;
	
	public PlainsSquare() {
		this.description=DEFAULT_DESCRIPTION;
	}
	
	public PlainsSquare(String description){
		this.description = description;
	}
	
	public String getDescription(){
		
		if(description.equals(null)){
			return DEFAULT_DESCRIPTION;
		}else{
			return this.description;
		}
	}

}
