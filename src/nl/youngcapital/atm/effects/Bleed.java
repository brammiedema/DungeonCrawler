package nl.youngcapital.atm.effects;

public class Bleed extends Effect{
	private int duration;
	private String name;
	private int effectProc;
	
	private static final int DEFAULT_DURATION = 3;
	private final static String NAME = "bleed";
	private static final int EFFECT_PROC_CHANCE = 11;
	
	public Bleed(){
		super(DEFAULT_DURATION, NAME, EFFECT_PROC_CHANCE);
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
		return name;
	}

	@Override
	int effectProcChance() {
		// TODO Auto-generated method stub
		return effectProc;
	}
	
}
