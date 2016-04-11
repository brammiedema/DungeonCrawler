package nl.youngcapital.atm.nonplayercharacters;

import java.util.ArrayList;
import java.util.Random;

import nl.youngcapital.atm.combatsystem.FightableCharacter;
import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.elements.Element;
import nl.youngcapital.atm.items.BroadSword;
import nl.youngcapital.atm.items.DragonFlameSword;
import nl.youngcapital.atm.items.Hamburger;
import nl.youngcapital.atm.items.Item;
import nl.youngcapital.atm.magiceffects.MagicEffect;

public class Merchant implements NonPlayableCharacter, Shop, FightableCharacter{
	private ArrayList<Item> inventory;
	private int value; 
	private int healthPoints;
	private String description;
	private ArrayList<Element> elements;
	private ArrayList<Effect> effects;
	private ArrayList<MagicEffect> magicEffects;

	
	private static final int MAXVALUE = 50;
	private static final int MINVALUE = 30; 
	private final static String DEFAULT_DESCRIPTION="a merchant selling valuebles."; 
	private static final int MAX_HEALTH_POINTS = 20;
	private static final int MIN_HEALTH_POINTS = 16;
	private static final int MAX_DAMAGE = 10;
	private static final int MIN_DAMAGE = 5;
	private static final Random RAN = new Random();

	public Merchant(String description){
		this();
		this.description = description;

		
	}
	
	public Merchant(){
		this.description = DEFAULT_DESCRIPTION;
		healthPoints = RAN.nextInt(MAX_HEALTH_POINTS - MIN_HEALTH_POINTS) + MIN_HEALTH_POINTS;
		inventory = new ArrayList<>();
		effects = new ArrayList<>();
		magicEffects = new ArrayList<>();
		elements = new ArrayList<>();
		fillInventory();
	}
	
	/**
	 * fills inventory arraylist with random items
	 */
	private void fillInventory() {
		Random ran = new Random();
		
		this.value = ran.nextInt(MAXVALUE-MINVALUE) + MINVALUE;
		
		int value = 0;
		
		while (this.value >= value){
			Item item;
			int randomInt = ran.nextInt(5) % 3;

			switch (randomInt) {
			case 0:
				item = new DragonFlameSword();
				
				break;
				
			case 1:
				item = new BroadSword();
				break;
				
			default:
				item = new Hamburger();
			}

			inventory.add(item);
			value = value + item.getPrice();
		}
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public ArrayList<Item> getInventory(){
		return this.inventory;
	}
	
	@Override
	public void dealDamage(int damage) {

		this.healthPoints = healthPoints - damage;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public ArrayList<Element> getElements() {
		
		return this.elements;
	}

	@Override
	public ArrayList<MagicEffect> getMagicEffect() {
		
		return this.magicEffects;
	}

	@Override
	public ArrayList<Effect> getEffects() {
		
		return this.effects;
	}

	@Override
	public int getDamage() {
		
		// TODO Auto-generated method stub
		return RAN.nextInt(MAX_DAMAGE - MIN_DAMAGE) + MIN_DAMAGE;
	}
	
	@Override
	public boolean isFriendly() {
		return true;
	}


	@Override
	public ArrayList<Effect> getEffect() {
		return this.effects;
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return this.healthPoints;
	}
}
