package nl.youngcapital.atm.world;

public class RoadSquare extends Square{
	final private static String DEFAULT_DESCRIPTION = "You are on a road.";
	private String description;
	
	public RoadSquare() {
		this.description=DEFAULT_DESCRIPTION;
	}
	
	public RoadSquare(String description){
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
