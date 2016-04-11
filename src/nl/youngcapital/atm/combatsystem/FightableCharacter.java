package nl.youngcapital.atm.combatsystem;

public interface FightableCharacter {
	
	/**
	 * Gets damage dealt by this character.
	 * 
	 * @return
	 */
	public int getDamage();
	
	/**
	 * Gets damage dealt to this character.
	 * 
	 * @return
	 */
	public void dealDamage(int damage);
	
}
