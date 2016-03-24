package nl.youngcapital.atm.world;

public abstract class Square {
	
	private String description;
	
	public Square(){
		super();
	}
	
	public Square(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return this.description;
	}
	
}
