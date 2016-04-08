package nl.youngcapital.atm.world;

import nl.youngcapital.atm.events.Event;

public abstract class Square {
	
	private String description;
	private Event event;
	public Square(){
		super();
	}
	
	public Square(String description){
		this.description = description;
	}
	
	abstract String getDescription();
	
	abstract boolean hasEvent();
	
	abstract Event getEvent();
}
