package nl.youngcapital.atm.magiceffects;

import nl.youngcapital.atm.elements.Element;
import nl.youngcapital.atm.elements.Fire;

public class DragonFireBurn extends MagicEffect implements DamageOverTime {
	
	private int duration;
	private String name;
	private int effectProcChance;
	final private Element element = new Fire();
	
	public DragonFireBurn(){
		super("Dragonfire burn", 4);
	}
	
	@Override
	String getName() {
		return name;
		
	}

	@Override
	public Element getElement() {
		return element;
		
	}

	@Override
	int effectProcChance() {
		return effectProcChance;
		
	}
	
	@Override
	public int getDotDuration() {
		return duration;
		
	}
	
}
