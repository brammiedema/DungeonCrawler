package nl.youngcapital.atm.elements;

public class Earth extends Element {
	private Element strengthElement;
	private Element weaknessElement;
	static final private String NAME = "Earth";

	public Earth() {

	}

	public Earth(String name, Element weaknessElement, Element strengthElement) {
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
