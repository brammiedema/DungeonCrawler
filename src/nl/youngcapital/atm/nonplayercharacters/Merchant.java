package nl.youngcapital.atm.nonplayercharacters;

import java.util.ArrayList;
import java.util.Random;

import nl.youngcapital.atm.items.BroadSword;
import nl.youngcapital.atm.items.DragonFlameSword;
import nl.youngcapital.atm.items.Hamburger;
import nl.youngcapital.atm.items.Item;

public class Merchant {
	private ArrayList<Item> inventory;
	private int value; 
	private static final int MAXVALUE = 50;
	private static final int MINVALUE = 30; 

	public Merchant(){
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
	
}
