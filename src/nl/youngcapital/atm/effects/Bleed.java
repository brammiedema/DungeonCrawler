package nl.youngcapital.atm.effects;

public class Bleed extends Effect{
	private int duration = 3;
	private static final int DEFAULT_DURATION = 3;
	private final static String NAME = "bleed";
	private static final int effectProcChance = 11;
	
	public Bleed(){
		super(DEFAULT_DURATION, NAME, effectProcChance);
	}
	
	public Bleed(int duration, String name, int effectProcChance) {
		super(duration, name, effectProcChance);

	}

	@Override
	int getDuration() {
		return duration;
	}

	@Override
	String getName() {
		return NAME;
	}

	@Override
	int effectProcChance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
