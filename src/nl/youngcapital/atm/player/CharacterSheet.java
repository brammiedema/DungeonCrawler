package nl.youngcapital.atm.player;

import nl.youngcapital.atm.items.Item;
import nl.youngcapital.atm.itemsimpl.WoodenStick;

public class CharacterSheet {
	
	private static CharacterSheet cs;
	private Item helm;
	private Item mainHand = new WoodenStick();
	private Item offHand;
	private Item leftShoe;
	private Item rightShoe;	
	
	private CharacterSheet(){
		
	}
	
	public static CharacterSheet getInstance(){
		
		if(cs == null){
			cs = new CharacterSheet();
		}
		
		return cs;
	}
	
	public Item getHelm() {
		return helm;
	}
	
	public void setHelm(Item helm) {
		this.helm = helm;
	}
	
	public Item getMainHand() {
		return mainHand;
	}
	
	public void setMainHand(Item mainHand) {
		this.mainHand = mainHand;
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

	public int getTotalArmor() {
		return 0;
	}

	
	
}
