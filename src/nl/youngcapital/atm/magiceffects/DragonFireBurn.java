package nl.youngcapital.atm.magiceffects;

import nl.youngcapital.atm.elements.Element;
import nl.youngcapital.atm.elements.Fire;

public class DragonFireBurn extends MagicEffect implements DamageOverTime {
	
	final static private int DURATION = 8;
	final static private String NAME = "Dragon fire burn";
	final static private int DEFAULT_EFFECT_PROC_CHANCE = 20;
	final static private Element ELEMENT = new Fire();
	final private static int DAMAGE = 5;
	
	public DragonFireBurn(){
		
	}
	
	@Override
	String getName() {
		return NAME;
	}


	public Element getElement() {
		return ELEMENT;
		
	}

	@Override
	int effectProcChance() {
		return DEFAULT_EFFECT_PROC_CHANCE;
		
	}
	
	
	public int getDuration() {
		return DURATION;
		
	}

	@Override
	public int getDotTickDamage() {
		// TODO Auto-generated method stub
		return DAMAGE;
	}
	
}
