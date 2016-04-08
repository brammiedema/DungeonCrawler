package nl.youngcapital.atm.combatsystem;

import nl.youngcapital.atm.nonplayercharacters.NonPlayableCharacter;
import nl.youngcapital.atm.player.Player;

public class CombatSystem {
	
	public void fight(Player player, NonPlayableCharacter target){
		
		// most basic form
		target.dealDamage(player.getBaseDamage());
	}
}
