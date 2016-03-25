package nl.youngcapital.atm.items;

import java.util.Random;

import nl.youngcaptital.atm.effects.Bleed;
import nl.youngcaptital.atm.effects.Effect;
import nl.youngcapital.atm.magiceffects.MagicEffect;

public class DragonFlameSword extends Item implements MagicItem, Weapon {
	private int minDmg;
	private int maxDmg;
	private Effect effect;
	private MagicEffect magicEffect;
	private static final String NAME = "Dragon flame sword";
	private static final String DEFAULT_DESCRIPTION = "This sword is stolen from a dragon, let's hope it doesn't catch up.";
	
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
		// TODO Auto-generated method stub
		return DEFAULT_DESCRIPTION;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}

	@Override
	public MagicEffect getMagicEffect() {
		// TODO Auto-generated method stub
		return magicEffect;
	}





}
