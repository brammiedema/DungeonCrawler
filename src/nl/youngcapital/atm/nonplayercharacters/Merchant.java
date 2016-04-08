package nl.youngcapital.atm.nonplayercharacters;

import java.util.ArrayList;
import java.util.Random;

import nl.youngcapital.atm.items.BroadSword;
import nl.youngcapital.atm.items.DragonFlameSword;
import nl.youngcapital.atm.items.Hamburger;
import nl.youngcapital.atm.items.Item;

public class Merchant implements NonPlayableCharacter{
	private ArrayList<Item> inventory;
	private int value; 
	private int healthPoints;
	private String description;
	
	private static final int MAXVALUE = 50;
	private static final int MINVALUE = 30; 
	private final static String DEFAULT_DESCRIPTION="IT IS A CUTE TROLL!"; 
	private static final int MAX_HEALTH_POINTS = 20;
	private static final int MIN_HEALTH_POINTS = 16;
	private static final int MAX_DAMAGE = 41;
	private static final int MIN_DAMAGE = 20;
	private static final Random RAN = new Random();

	public Merchant(String description){
		this();
		this.description = description;
	}
	
	public Merchant(){
		this.description = DEFAULT_DESCRIPTION;
		healthPoints = RAN.nextInt(MAX_HEALTH_POINTS - MIN_HEALTH_POINTS) + MIN_HEALTH_POINTS;
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
	
}
