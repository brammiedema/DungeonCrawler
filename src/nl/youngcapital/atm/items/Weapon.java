package nl.youngcapital.atm.items;

import nl.youngcapital.atm.effects.Effect;

public interface Weapon extends Equipable{
	
	
	public Effect getEffect();
	
	public int attack();
}
