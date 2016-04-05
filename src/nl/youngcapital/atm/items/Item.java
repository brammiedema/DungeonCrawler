package nl.youngcapital.atm.items;

import java.util.Random;

/**
 * 
 * 
 * Maak een class Item. Dit zijn objecten in je wereld.
 * 
 * Items hebben een description
 * 
 * Description is een korte beschrijving die wordt getoond in de tekst bij de
 * locatie waar het item ligt. Bijvoorbeeld: "Er ligt een Java-boek op tafel"
 * Zorg voor toepasselijke getters, setters en constructors.
 * 
 * 
 * @author Student
 *
 */
public abstract class Item {
	private String description;
	private String name;
	private int price;

	public Item() {

	}

	public Item(String description) {
		this.description = description;
	}

	public abstract int getPrice();

	public abstract String getDescription();

	public abstract String getName();
	

}
