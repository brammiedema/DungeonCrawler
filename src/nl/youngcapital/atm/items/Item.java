package nl.youngcapital.atm.items;

public abstract class Item {
	private String description;

	public Item() {

	}

	public Item(String description) {
		this.description = description;
	}

	public abstract int getPrice();

	public abstract String getDescription();

	public abstract String getName();
	
	@Override
	public String toString() {
	
		return "Item[ name: " + getName() +"\t description: "+ getDescription()+ " \tprice: "+ getPrice() + " ] ";
	}
}
