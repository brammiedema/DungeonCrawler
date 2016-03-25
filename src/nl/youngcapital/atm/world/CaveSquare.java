package nl.youngcapital.atm.world;

public class CaveSquare extends Square{
	
	final private static String DEFAULT_DESCRIPTION = "You are in a creepy cave. You hear an all too familiar sound.";
	private String description;
	
	public CaveSquare() {
		
	}
	
	public CaveSquare(String description){
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
