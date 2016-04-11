package nl.youngcapital.atm.nonplayercharactersimpl;

import java.util.ArrayList;
import java.util.Random;

import nl.youngcapital.atm.combatsystem.FightableCharacter;
import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.elements.Element;
import nl.youngcapital.atm.magiceffects.MagicEffect;
import nl.youngcapital.atm.nonplayercharacters.NonPlayableCharacter;

public class Troll implements NonPlayableCharacter, FightableCharacter {
	private int healthPoints;
	private ArrayList<Element> elements;
	private ArrayList<Effect> effects;
	private ArrayList<MagicEffect> magicEffects;
	private String description;
	
	private final static String DEFAULT_DESCRIPTION="IT IS A CUTE TROLL!"; 
	private static final int MAX_HEALTH_POINTS = 41;
	private static final int MIN_HEALTH_POINTS = 20;
	private static final int MAX_DAMAGE = 41;
	private static final int MIN_DAMAGE = 20;
	private static final Random RAN = new Random();

	public Troll() {
		this.description = DEFAULT_DESCRIPTION;
		healthPoints = RAN.nextInt(MAX_HEALTH_POINTS - MIN_HEALTH_POINTS) + MIN_HEALTH_POINTS;
		effects = new ArrayList<>();
		magicEffects = new ArrayList<>();
		elements = new ArrayList<>();
	}
	
	public Troll(String description) {
		this();
		this.description = description; 
		
	}

	@Override
	public int getDamage() {
		

		return RAN.nextInt(MAX_DAMAGE - MIN_DAMAGE) + MIN_DAMAGE;
	}
	
	@Override
	public void dealDamage(int damage) {
		
		this.healthPoints = healthPoints - damage;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public ArrayList<Element> getElements() {
		
		return elements;
	}

	@Override
	public ArrayList<MagicEffect> getMagicEffect() {
		
		return magicEffects;
	}

	@Override
	public ArrayList<Effect> getEffects() {
		
		return effects;
	}

	@Override
	public boolean isFriendly() {
		return false;
	}

	@Override
	public int getHealth() {
		return this.healthPoints;
	}

	@Override
	public ArrayList<Effect> getEffect() {
		// TODO Auto-generated method stub
		return null;
	}

}
