package nl.youngcapital.atm.nonplayercharacters;

import java.util.Random;

public class Troll implements Enemy {
	private int healthPoints;

	private static final int MAX_HEALTH_POINTS = 41;
	private static final int MIN_HEALTH_POINTS = 20;
	private static final int MAX_DAMAGE = 41;
	private static final int MIN_DAMAGE = 20;
	private static final Random RAN = new Random();

	public Troll() {

		healthPoints = RAN.nextInt(MAX_HEALTH_POINTS - MIN_HEALTH_POINTS) + MIN_HEALTH_POINTS;
	}

	@Override
	public int getAttackDamage() {
		// TODO Auto-generated method stub

		return RAN.nextInt(MAX_DAMAGE - MIN_DAMAGE) + MIN_DAMAGE;
	}

	@Override
	public int getHealthPoints() {
		// TODO Auto-generated method stub
		return healthPoints;
	}

	@Override
	public void dealDamage(int damage) {
		// TODO Auto-generated method stub
		this.healthPoints = healthPoints - damage;
	}

}
