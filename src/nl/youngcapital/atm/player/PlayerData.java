package nl.youngcapital.atm.player;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import nl.youngcapital.atm.effects.Effect;
import nl.youngcapital.atm.elements.Element;
import nl.youngcapital.atm.items.Item;
import nl.youngcapital.atm.magiceffects.MagicEffect;

@Entity
public class PlayerData {
	private String name;
	private int x;
	private int y;
	private int z;
	private int healthPoints = 100;

	@OneToMany
	private ArrayList<Item> inventory;
	@OneToMany
	private ArrayList<Effect> effects;
	@OneToMany
	private ArrayList<MagicEffect> magicEffects;
	@OneToMany
	private ArrayList<Element> elements;

	protected static final int MAX_DAMAGE = 3;
	protected static final int MIN_DAMAGE = 2;
	protected static final int BASE_ARMOR = 2;
	

	private Long id;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public ArrayList<Effect> getEffects() {
		return effects;
	}

	public void setEffects(ArrayList<Effect> effects) {
		this.effects = effects;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	public ArrayList<MagicEffect> getMagicEffects() {
		return magicEffects;
	}

	public void setMagicEffects(ArrayList<MagicEffect> magicEffects) {
		this.magicEffects = magicEffects;
	}

	public ArrayList<Element> getElements() {
		return elements;
	}

	public void setElements(ArrayList<Element> elements) {
		this.elements = elements;
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
