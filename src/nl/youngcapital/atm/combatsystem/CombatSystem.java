package nl.youngcapital.atm.combatsystem;

public class CombatSystem {
	
	/**
	 * {@link FightableCharacter} attacker fights {@link FightableCharacter} defender
	 *  
	 * @param attacker
	 * @param defender
	 */
	public void fight(FightableCharacter attacker, FightableCharacter defender){
		
		// most basic form more elaborate would involve countering and reactive battle
		defender.dealDamage(attacker.getDamage());
		
	}
}
