package nl.youngcapital.atm.itemsimpl;

import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.items.Equipable;

public interface Weapon extends Equipable{
	
	public Effect getEffect();
	
	public int attack();
}
