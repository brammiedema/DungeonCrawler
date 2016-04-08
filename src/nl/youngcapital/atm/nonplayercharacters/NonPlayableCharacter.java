package nl.youngcapital.atm.nonplayercharacters;

import java.util.ArrayList;

import nl.youngcapital.atm.magiceffects.MagicEffect;
import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.elements.Element;

public interface NonPlayableCharacter {
	
	
	public int getAttackDamage();
	
	public int getHealthPoints();
	
	public String getDescription();
	
	public void dealDamage(int damage);
	
	public ArrayList<Element> getElements();
	
	public ArrayList<MagicEffect> getMagicEffect();
	
	public ArrayList<Effect> getEffects();
}
