package nl.youngcapital.atm.inventory;

import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import nl.youngcapital.atm.armor.Armor;
import nl.youngcapital.atm.consumables.Consumable;
import nl.youngcapital.atm.weapon.Weapon;

public class Inventory {
	
	private ArrayList<Weapon> weapons = new ArrayList<>();
	private ArrayList<Armor> armors = new ArrayList<>();
	private ArrayList<Consumable> consumables = new ArrayList<>();

	private long id;

	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(ArrayList<Weapon> weapons) {
		this.weapons = weapons;
	}

	public ArrayList<Armor> getArmors() {
		return armors;
	}

	public void setArmors(ArrayList<Armor> armors) {
		this.armors = armors;
	}

	public ArrayList<Consumable> getConsumables() {
		return consumables;
	}

	public void setConsumables(ArrayList<Consumable> consumables) {
		this.consumables = consumables;
	}

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
