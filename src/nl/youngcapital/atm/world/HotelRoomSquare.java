package nl.youngcapital.atm.world;

public class HotelRoomSquare extends Square{
	final private static String DEFAULT_DESCRIPTION = "You are in Harry the turtle's hotel room, he looks at you with beady eyes.";
	
	private String description;
	
	public HotelRoomSquare(){
		this.description =  DEFAULT_DESCRIPTION;
	}
	public HotelRoomSquare(String description ){
		this.description=description;
		
	}
	
	public String getDescription(){
		return this.description;
		
	}
}
