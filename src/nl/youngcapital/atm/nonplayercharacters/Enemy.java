package nl.youngcapital.atm.nonplayercharacters;

public interface Enemy {
	public int getAttackDamage();
	
	public int getHealthPoints();
	
	public void dealDamage(int damage);
}
