package nl.youngcapital.atm.magiceffects;

public abstract class MagicEffect {
	private int duration; 
	private String name;
	private int effectProcChance;
	public MagicEffect(){
		
	}
	
	public MagicEffect(int duration, String name, int effectProcChance){
		this.duration= duration;
		this.name = name;
		this.effectProcChance = effectProcChance;
	}
	
	abstract int getDuration();
	
	abstract int effectProcChance();
	
	abstract String getName();
}
