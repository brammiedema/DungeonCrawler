package nl.youngcapital.atm.itemsimpl;

import java.util.Random;

import nl.youngcapital.atm.effects.Bleed;
import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.items.Item;
import nl.youngcapital.atm.items.MagicItem;
import nl.youngcapital.atm.items.MainHand;
import nl.youngcapital.atm.magiceffects.MagicEffect;

@Deprecated
public class DragonFlameSword extends Item implements MagicItem, Weapon, MainHand {
	
	private static final String NAME = "Dragon flame sword";
	private static final String DEFAULT_DESCRIPTION = "This sword is stolen from a dragon, let's hope it doesn't catch up.";
	private static final int MAX_DAMAGE = 12;
	private static final int MIN_DAMAGE = 7;
	
	private int minDmg;
	private int maxDmg;
	private Effect effect;
	private MagicEffect magicEffect;
	private boolean equiped = false;
	private final int PRICE = 25;
	private final static Random RAN = new Random();
	
	public DragonFlameSword(){
		Random ran = new Random();
		
		this.maxDmg = RAN.nextInt(MAX_DAMAGE - MIN_DAMAGE) + MIN_DAMAGE;
		
		this.minDmg = RAN.nextInt(MIN_DAMAGE) + MIN_DAMAGE;
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
