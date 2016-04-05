package nl.youngcapital.atm.items;

import java.util.Random;

import nl.youngcaptital.atm.effects.Bleed;
import nl.youngcaptital.atm.effects.Effect;

public class BroadSword extends Item implements Weapon {
	static final public String DESCRIPTION = "This sword comaplains!";
	static final public String NAME = "Broadsword";
	private int minDmg;
	private int maxDmg;
	private Effect effect;
	private Boolean equiped = false;
	private final int PRICE = 15;
	
	public BroadSword() {
		Random ran = new Random();
		
		this.minDmg = ran.nextInt(4) + 1;
		this.maxDmg = ran.nextInt(3) + this.minDmg;
		this.effect = new Bleed();
		
	}
	
	@Override
	public Effect getEffect() {
		return effect;
	}

	@Override
	public int attack() {
		Random ran = new Random();
		int hitDmg = ran.nextInt(maxDmg) + minDmg;	
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
