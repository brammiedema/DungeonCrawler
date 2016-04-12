package nl.youngcapital.atm.itemsimpl;

import java.util.Random;

import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.items.Item;
import nl.youngcapital.atm.items.TwoHanded;

public class StoneMace extends Item implements Weapon, TwoHanded  {

	static final private String DESCRIPTION = "It's a wooden stick!";
	static final private String NAME = "Wooden stick";
	private static final int MAX_DAMAGE = 10;
	private static final int MIN_DAMAGE = 15;
	private int minDmg;
	private int maxDmg;
	private Effect effect;
	private Boolean equiped = false;
	private final int PRICE = 20;
	private final static Random RAN = new Random();
	
	
	public StoneMace() {
		
		this.maxDmg = RAN.nextInt(MAX_DAMAGE - MIN_DAMAGE) + MIN_DAMAGE;
		this.minDmg = RAN.nextInt(maxDmg) - 1;
		
	}
	
	@Override
	public Effect getEffect() {
		return effect;
	}

	@Override
	public int attack() {
		
		int hitDmg = RAN.nextInt(maxDmg - minDmg) + minDmg;	
		return hitDmg;
		
	}

	@Override
	public String getDescription() {
		
		return DESCRIPTION;
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public boolean isEquipped() {
		return equiped;
	}

	@Override
	public void equip() {
		equiped =  true;
		
	}

	@Override
	public void unEquip() {
		equiped = false;
	}

	@Override
	public int getPrice() {

		return this.PRICE;
	}


}
