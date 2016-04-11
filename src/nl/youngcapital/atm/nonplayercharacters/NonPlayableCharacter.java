package nl.youngcapital.atm.nonplayercharacters;

import java.util.ArrayList;

import nl.youngcapital.atm.magiceffects.MagicEffect;
import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.elements.Element;

public interface NonPlayableCharacter {
	
	public boolean isFriendly();
	
	public int getHealthPoints();
	
	public String getDescription();
	
	public ArrayList<Element> getElements();
	
	public ArrayList<MagicEffect> getMagicEffect();
	
	public ArrayList<Effect> getEffects();
}
