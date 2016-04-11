package nl.youngcapital.atm.nonplayercharacters;

import java.util.ArrayList;

import nl.youngcapital.atm.items.Item;

public interface Shop {
	
	public ArrayList<Item> getInventory();
	
	public Item buyItem(String itemName);
	
	public int SellItem(Item item);
		
}
