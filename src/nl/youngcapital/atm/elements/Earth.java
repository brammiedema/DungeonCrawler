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
	public Element GetStrengthElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element GetWeaknessElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return NAME;
	}

}
