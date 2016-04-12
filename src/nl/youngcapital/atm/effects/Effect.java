package nl.youngcapital.atm.effects;

import nl.youngcapital.atm.elements.Element;

public abstract class Effect {
	private int duration; 
	private String name;
	private int effectProc;
	
	public Effect(){
		
	}
	
	public Effect(int duration, String name, int effectProcChance){
		this.duration= duration;
		this.name = name;
		this.effectProc = effectProcChance;
	}
	
	public abstract Element getElement();
	
	public abstract int getDuration();
	
	public abstract String getName();
		
	public abstract int effectProcChance();
	
	public abstract void substractDuration();
	
	public abstract void addDuration();
}
