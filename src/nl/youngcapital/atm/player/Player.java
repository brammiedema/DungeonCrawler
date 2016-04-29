package nl.youngcapital.atm.player;

import java.util.ArrayList;
import java.util.Random;

import nl.youngcapital.atm.armor.Armor;
import nl.youngcapital.atm.combatsystem.FightableCharacter;
import nl.youngcapital.atm.consumables.Consumable;
import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.elements.Element;
import nl.youngcapital.atm.inventory.Inventory;
import nl.youngcapital.atm.inventory.InventoryManager;
import nl.youngcapital.atm.weapon.Weapon;
import nl.youngcapital.atm.world.World;

public class Player implements FightableCharacter {

	private PlayerData playerData = new PlayerData();

	private static final Random RAN = new Random();

	public Player() {
		this.playerData.setX(Math.abs(RAN.nextInt() % World.MAX_X_SIZE_WORLD));
		this.playerData.setY(Math.abs(RAN.nextInt() % World.MAX_Y_SIZE_WORLD));
		this.playerData.setZ(Math.abs(RAN.nextInt() % World.MAX_Z_SIZE_WORLD));
		this.playerData.setCs(new CharacterSheet());
		ArrayList<String> elements = new ArrayList<String>();
		elements.add("fire");
		InventoryManager.getInstance().setWeapon(this.playerData.getCs().getInventory(),
				new Weapon("Wooden stick", "Blunt", 7, 4, 6, elements, new ArrayList<>(), true));

	}

	public Player(PlayerData playerData, CharacterSheet cs) {
		this.playerData = playerData;
		this.playerData.setCs(cs);
	}

	public int getBaseDamage() {
		Random ran = new Random();
		return ran.nextInt(PlayerData.MAX_DAMAGE - PlayerData.MIN_DAMAGE) + PlayerData.MIN_DAMAGE;
	}

	public void useItem() {
		// TODO implement
	}

	public Inventory showInventory() {
		// TODO implement
		return null;
	}

	public void pickUpWeapon(Weapon item) {
		// this.playerData.getInventory().add(item);
	}

	public void pickUpArmor(Armor armor) {
		// this.playerData.getInventory().add(item);
	}

	public void pickUpConsumable(Consumable consumable) {

		// this.playerData.getInventory().add(item);
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
	public int getHealth() {
		return this.playerData.getHealthPoints();
	}

	public void setWeapon(Weapon weapon) {

	}

	@Override
	public int getArmor() {

		return InventoryManager.getInstance().getAllArmor(this.playerData.getCs().getInventory()).stream()
				.filter(a -> a.isEquiped()).mapToInt(Armor::getArmor).sum();
	}

	@Override
	public void setEffect(Effect effect) {
		// this.playerData.getEffects().add(effect);

	}

	public PlayerData getPlayerData() {
		return playerData;
	}

	public void setPlayerData(PlayerData playerData) {
		this.playerData = playerData;
	}

	@Override
	public ArrayList<Element> getElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Effect> getEffects() {
		// TODO Auto-generated method stub
		return null;
	}

}
