package nl.youngcapital.atm.effects;

public class Burn extends Effect{
	private int duration;
	private String name;
	private int effectProc;
	
	private static final int DEFAULT_DURATION = 5;
	private final static String NAME = "bleed";
	private static final int EFFECT_PROC_CHANCE = 5;
	
	public Burn(){
		super(DEFAULT_DURATION, NAME, EFFECT_PROC_CHANCE);
	}
	

	
	
	public Burn(int duration, String name, int effectProc) {
		super(duration, name, effectProc);
	}




	@Override
	int getDuration() {
		return duration;
	}

	@Override
	String getName() {
		return name;
	}

	@Override
	int effectProcChance() {
		return effectProc;
	}

}
