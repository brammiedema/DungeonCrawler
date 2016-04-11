package nl.youngcapital.atm.magiceffects;

public abstract class MagicEffect {
	private String name;
	private int effectProcChance;
	
	public MagicEffect(){
		
	}
	
	public MagicEffect(String name, int effectProcChance){
		this.name = name;
		this.effectProcChance = effectProcChance;
	}
		
	abstract int effectProcChance();
	
	abstract String getName();
}
