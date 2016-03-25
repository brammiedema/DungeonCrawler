package nl.youngcapital.atm.world;

public class DarkRoomSquare extends Square{
	
	final private static String DEFAULT_DESCRIPTION = "You are in a darkroom, yeah hear heavy breathing.";
	private String description;
	
	public DarkRoomSquare() {
	
		this.description=DEFAULT_DESCRIPTION;
	}
	
	public DarkRoomSquare(String description){
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
