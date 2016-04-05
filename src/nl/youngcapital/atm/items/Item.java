package nl.youngcapital.atm.items;
/**
 * 

Maak een class Item. Dit zijn objecten in je wereld.

Items hebben een description

    Description is een korte beschrijving die wordt getoond in de tekst bij de locatie waar het item ligt. Bijvoorbeeld: "Er ligt een Java-boek op tafel"
    Zorg voor toepasselijke getters, setters en constructors.


 * @author Student
 *
 */
public abstract class Item {
	private String description;
	private String name;
	
	public Item(){		
		
	}
	
	public Item(String description){
		this.description = description;
	}
	
	public abstract String getDescription();

	public abstract String getName();
}
