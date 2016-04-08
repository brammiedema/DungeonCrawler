package nl.youngcapital.atm.nonplayercharacters;

import java.util.ArrayList;
import java.util.Random;

import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.elements.Element;
import nl.youngcapital.atm.magiceffects.MagicEffect;

public class Troll implements NonPlayableCharacter {
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
	}
	
	public Troll(String description) {
		this();
		this.description = description; 
		
	}

	@Override
	public int getAttackDamage() {
		

		return RAN.nextInt(MAX_DAMAGE - MIN_DAMAGE) + MIN_DAMAGE;
	}
	
	@Override
	public int getHealthPoints() {
		
		return healthPoints;
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

}
