package nl.youngcapital.atm.items;

import nl.youngcaptital.atm.effects.Effect;

public interface Weapon extends Equipable{
	
	
	public Effect getEffect();
	
	public int attack();
}
