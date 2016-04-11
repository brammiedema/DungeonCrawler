package nl.youngcapital.atm.elements;

public class Fire extends Element{
	private Element strengthElement;
	private Element weaknessElement;
	final static private String NAME = "Fire";
	
	public Fire(){
		
	}
	
	public Fire(String name, Element weaknessElement, Element strengthElement){
		this.strengthElement = strengthElement;
		this.weaknessElement = weaknessElement;
	}
	
	@Override
	public Element getStrengthElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element getWeaknessElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}
	

}
