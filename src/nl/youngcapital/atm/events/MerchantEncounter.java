package nl.youngcapital.atm.events;

import java.util.ArrayList;
import java.util.Random;

import nl.youngcapital.atm.items.BroadSword;
import nl.youngcapital.atm.items.DragonFlameSword;
import nl.youngcapital.atm.items.Hamburger;
import nl.youngcapital.atm.items.Item;

public class MerchantEncounter implements Encounter, Merchant{
	private String description;
	private ArrayList<Item> inventory;
	private static final int MAXVALUE = 50;
	private static final int MINVALUE = 30 ; 
	private int value;
	
	public MerchantEncounter(){
		Random ran = new Random();
		if(this.value == 0){
			this.value = ran.nextInt(MAXVALUE) + MINVALUE;
		}
		if(inventory.isEmpty()){
			fillInventory();
		}
		
	}
	/**
	 * fills inventory arraylist with random items
	 */
	private void fillInventory() {

		int value = 0;
		
		while (this.value >= value){
			Item item;
			Random ran = new Random();
			int randomInt = ran.nextInt(20) % 4;

			switch (randomInt) {
			case 1:
				item = new BroadSword();
				break;
			case 2:
				item = new DragonFlameSword();
				break;
			default:
				item = new Hamburger();
			}

			inventory.add(item);
			value = value + item.getPrice();
		}
	}

	@Override
	public boolean isFriendly() {
		return true;
	}

	@Override
	public String getDescription() {
		
		return description;
	}

	@Override
	public ArrayList<Item> getInventory() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
