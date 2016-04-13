package nl.youngcapital.atm.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import nl.youngcapital.atm.items.Item;
import nl.youngcapital.atm.itemsimpl.Weapon;


public class CharacterSheet {
	
	private long id;
	private Item helm;
	private Weapon weapon;
	private Item offHand;
	private Item leftShoe;
	private Item rightShoe;	
		
	public Item getHelm() {
		return helm;
	}
	
	public void setHelm(Item helm) {
		this.helm = helm;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public Item getOffHand() {
		return offHand;
	}
	
	public void setOffHand(Item offHand) {
		this.offHand = offHand;
	}
	
	public Item getLeftShoe() {
		return leftShoe;
	}
	
	public void setLeftShoe(Item leftShoe) {
		this.leftShoe = leftShoe;
	}
	
	public Item getRightShoe() {
		return rightShoe;
	}
	
	public void setRightShoe(Item rightShoe) {
		this.rightShoe = rightShoe;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
