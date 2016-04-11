package nl.youngcapital.atm.effects;

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
	
	abstract int getDuration();
	
	abstract String getName();
	
	
	abstract int effectProcChance();
}
