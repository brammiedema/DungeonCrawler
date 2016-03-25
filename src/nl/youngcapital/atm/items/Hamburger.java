package nl.youngcapital.atm.items;

public class Hamburger extends Item implements Eatable{
	private static final String DEFAULT_DESCRIPTION = "It looks kind of good I supose.";
	private static final String DEFAULT_NAME = "Hamburger";
	private String description;
	private String name;
	
	@Override
	public void eat() {
		System.out.println("nom nom good food");
		
	}

	@Override
	public String getDescription() {
		if(description.equals(null)){
			return DEFAULT_DESCRIPTION;
		} else{
			return description;
		}
	}
	
	@Override
	public String getName(){
		if(name.equals(null)){
			return DEFAULT_NAME;
		} else{
			return name;
		}
		
	}

}
