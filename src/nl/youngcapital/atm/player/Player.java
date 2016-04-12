package nl.youngcapital.atm.player;

import java.util.ArrayList;
import java.util.Random;

import nl.youngcapital.atm.combatsystem.FightableCharacter;
import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.elements.Element;
import nl.youngcapital.atm.items.Item;
import nl.youngcapital.atm.magiceffects.MagicEffect;
import nl.youngcapital.atm.world.World;

public class Player implements FightableCharacter{

	private ArrayList<Item> inventory = new ArrayList<>();

	private int x;
	private int y;
	private int z;
	private CharacterSheet cs;
	
	private ArrayList<Effect> effects;	
	private ArrayList<MagicEffect> magicEffects;
	private ArrayList<Element> elements;
	private int healthPoints = 100;
	
	private static final int MAX_DAMAGE = 3;
	private static final int MIN_DAMAGE = 2;
	private static final int BASE_ARMOR = 2;

	private static final Random RAN = new Random();

	public Player() {
		Random ran = new Random();
		this.x = Math.abs((ran.nextInt() % World.MAX_X_SIZE_WORLD));
		this.y = Math.abs((ran.nextInt() % World.MAX_Y_SIZE_WORLD));
		this.z = Math.abs((ran.nextInt() % World.MAX_Z_SIZE_WORLD));
		cs = CharacterSheet.getInstance();
		effects = new ArrayList<>();
		magicEffects = new ArrayList<>();
		elements = new ArrayList<>();
	}

	public Player(int x, int Y, int Z) {

	}
	
	public int getBaseDamage(){
		Random ran = new Random();
		return ran.nextInt(MAX_DAMAGE - MIN_DAMAGE) + MIN_DAMAGE;
	}

	public void useItem() {
		// TODO implement
	}

	public String showInventory() {
		// TODO implement
		return null;
	}

	public void pickUpItem(Item item) {
		inventory.add(item);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public ArrayList<Item> getInventory() {
		return inventory;
	}


	public ArrayList<MagicEffect> getMagicEffects() {
		return magicEffects;
	}	

	@Override
	public int getDamage() {
		int dmg = RAN.nextInt(1+(MAX_DAMAGE - MIN_DAMAGE)) + MIN_DAMAGE;
		System.out.println("player dmg: "+dmg);
		
		return dmg;
	}

	@Override
	public void dealDamage(int damage) {
		this.healthPoints = healthPoints - damage;
	}

	@Override
	public ArrayList<Element> getElements() {		
		return this.elements;
	}

	@Override
	public ArrayList<Effect> getEffects() {
		return this.effects;
	}

	@Override
	public int getHealth() {
		return this.healthPoints;
	}

	@Override
	public int getArmor() {
		return cs.getTotalArmor() + BASE_ARMOR;
	}
	
	@Override
	public void setEffect(Effect effect) {
		this.effects.add(effect);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("location (X, Y, Z): ");

		sb.append(x);
		sb.append(", ");
		sb.append(y);
		sb.append(", ");
		sb.append(z);

		for (Item it : inventory) {
			sb.append(it + "\n");
		}

		return sb.toString();
	}
	
}
