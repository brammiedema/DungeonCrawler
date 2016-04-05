package nl.youngcapital.atm.items;

import java.util.Random;

import nl.youngcaptital.atm.effects.Bleed;
import nl.youngcaptital.atm.effects.Effect;
import nl.youngcapital.atm.magiceffects.MagicEffect;

public class DragonFlameSword extends Item implements MagicItem, Weapon {
	
	private static final String NAME = "Dragon flame sword";
	private static final String DEFAULT_DESCRIPTION = "This sword is stolen from a dragon, let's hope it doesn't catch up.";
	
	private int minDmg;
	private int maxDmg;
	private Effect effect;
	private MagicEffect magicEffect;
	private boolean equiped = false;
	private final int PRICE = 25;
	
	public DragonFlameSword(){
		Random ran = new Random();
		
		this.minDmg = ran.nextInt(4) + 1;
		this.maxDmg = ran.nextInt(3) + this.minDmg;
		this.effect = new Bleed();
	}
	
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
		return DEFAULT_DESCRIPTION;
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public MagicEffect getMagicEffect() {
		return magicEffect;
	}
	
	@Override
	public int getPrice() {

		return this.PRICE;
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




}
