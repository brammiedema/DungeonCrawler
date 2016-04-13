package nl.youngcapital.atm.player;

import java.util.ArrayList;
import java.util.Random;

import nl.youngcapital.atm.combatsystem.FightableCharacter;
import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.elements.Element;
import nl.youngcapital.atm.items.Item;
import nl.youngcapital.atm.itemsimpl.WoodenStick;
import nl.youngcapital.atm.magiceffects.MagicEffect;
import nl.youngcapital.atm.world.World;

public class Player implements FightableCharacter {

	private PlayerData playerData = new PlayerData();

	private CharacterSheet cs;

	private static final Random RAN = new Random();

	public Player() {
		this.playerData.setX(Math.abs(RAN.nextInt() % World.MAX_X_SIZE_WORLD));
		this.playerData.setY(Math.abs(RAN.nextInt() % World.MAX_Y_SIZE_WORLD));
		this.playerData.setZ(Math.abs(RAN.nextInt() % World.MAX_Z_SIZE_WORLD));
		this.playerData.setEffects(new ArrayList<>());
		this.playerData.setMagicEffects(new ArrayList<>());
		this.playerData.setElements(new ArrayList<>());
		this.playerData.setInventory(new ArrayList<>());
		this.cs = new CharacterSheet();
		this.cs.setWeapon(new WoodenStick());
	}

	public Player(int x, int y, int z, ArrayList<Effect> effects, ArrayList<MagicEffect> magicEffects,
			ArrayList<Element> elements, int healthPoints, ArrayList<Item> inventory, CharacterSheet cs) {
		this.playerData.setX(x);
		this.playerData.setY(y);
		this.playerData.setZ(z);
		this.playerData.setHealthPoints(healthPoints);
		this.playerData.setEffects(effects);
		this.playerData.setInventory(inventory);
		this.playerData.setElements(elements);
		this.playerData.setMagicEffects(magicEffects);
		this.cs = cs;
	}

	public int getBaseDamage() {
		Random ran = new Random();
		return ran.nextInt(PlayerData.MAX_DAMAGE - PlayerData.MIN_DAMAGE) + PlayerData.MIN_DAMAGE;
	}

	public void useItem() {
		// TODO implement
	}

	public String showInventory() {
		// TODO implement
		return null;
	}

	public void pickUpItem(Item item) {
		this.playerData.getInventory().add(item);
	}

	public void setX(int x) {
		this.playerData.setX(x);

	}

	public void setY(int y) {
		this.playerData.setY(y);

	}

	public void setZ(int z) {
		this.playerData.setZ(z);
	}

	public ArrayList<Item> getInventory() {
		return this.playerData.getInventory();
	}

	public ArrayList<MagicEffect> getMagicEffects() {
		return this.playerData.getMagicEffects();
	}

	@Override
	public int getDamage() {
		int dmg = RAN.nextInt(1 + (PlayerData.MAX_DAMAGE - PlayerData.MIN_DAMAGE)) + PlayerData.MIN_DAMAGE;

		return dmg;
	}

	@Override
	public void dealDamage(int damage) {
		this.playerData.setHealthPoints(this.playerData.getHealthPoints() - damage);
	}

	@Override
	public ArrayList<Element> getElements() {
		return this.playerData.getElements();
	}

	@Override
	public ArrayList<Effect> getEffects() {
		return this.playerData.getEffects();
	}

	@Override
	public int getHealth() {
		return this.playerData.getHealthPoints();
	}

	@Override
	public int getArmor() {
		// return this.cs.getTotalArmor() + BASE_ARMOR;
		return 0;
	}

	@Override
	public void setEffect(Effect effect) {
		this.playerData.getEffects().add(effect);

	}

	public PlayerData getPlayerData() {
		return playerData;
	}

	public void setPlayerData(PlayerData playerData) {
		this.playerData = playerData;
	}

}
