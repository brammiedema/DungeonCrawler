package nl.youngcapital.atm.inventory;

import nl.youngcapital.atm.armor.Armor;
import nl.youngcapital.atm.consumables.Consumable;
import nl.youngcapital.atm.weapon.Weapon;

public class InventoryManager {

	private InventoryManager im;
	
	private InventoryManager(){
		super();
		
	}
	
	public InventoryManager getInstance(){
		
		if (im ==  null){
			im = new InventoryManager();
			
		}
		
		return im;
	}
	
	public Weapon getWeapon(Inventory inventory, String name) {
		for (Weapon weap : inventory.getWeapons()) {
			if (weap.getName().equals(name)) {
				return weap;
				
			}
		}

		return null;
	}

	public Armor getArmor(Inventory inventory, String name) {
		for (Armor arm : inventory.getArmors()) {
			if (arm.getName().equals(name)) {
				return arm;
				
			}
		}

		return null;
	}

	public Consumable getConsumable(Inventory inventory, String name) {
		for (Consumable cons : inventory.getConsumables()) {
			if (cons.getName().equals(name)) {
				return cons;
				
			}
		}

		return null;
	}

	public void setWeapon(Inventory inventory, Weapon weapon) {
		inventory.getWeapons().add(weapon);
	}

	public void setArmor(Inventory inventory, Armor armor) {
		inventory.getArmors().add(armor);
	}

	static public void setConsumable(Inventory inventory, Consumable consumable) {
		inventory.getConsumables().add(consumable);
	}
}
