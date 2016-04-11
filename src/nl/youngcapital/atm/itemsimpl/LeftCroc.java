package nl.youngcapital.atm.itemsimpl;

import java.util.Random;

import nl.youngcapital.atm.items.Armor;
import nl.youngcapital.atm.items.Item;

public class LeftCroc extends Item implements Armor {

	static final public String DESCRIPTION = "It's a left croc";
	static final public String NAME = "Left Croc";
	private static final int MAX_ARMOR = 10;
	private static final int MIN_ARMOR = 15;

	private int armor;
	private Boolean equiped = false;
	private final int PRICE = 22;
	private final static Random RAN = new Random();
	private String description;

	public LeftCroc() {
		armor = RAN.nextInt(MAX_ARMOR - MIN_ARMOR) + MIN_ARMOR;
		
	}

	@Override
	public boolean isEquipped() {
		return equiped;
		
	}

	@Override
	public void equip() {
		equiped = true;
		
	}

	@Override
	public void unEquip() {
		equiped = false;

	}

	@Override
	public int getPrice() {
		return PRICE;
		
	}

	@Override
	public String getDescription() {
		return description;
		
	}

	@Override
	public String getName() {
		return NAME;
		
	}

	@Override
	public int getArmorValue() {
		return armor;
		
	}

}
