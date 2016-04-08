package nl.youngcapital.atm.nonplayercharacters;

public interface NonPlayableCharacter {
	public int getAttackDamage();
	
	public int getHealthPoints();
	
	public String getDescription();
	
	public void dealDamage(int damage);
}
