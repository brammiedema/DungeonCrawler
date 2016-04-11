package nl.youngcapital.atm.combatsystem;

import java.util.ArrayList;

import nl.youngcapital.atm.elements.Element;

public class CombatSystem {
	
	private static CombatSystem cb;
	
	private CombatSystem(){
		
	}
	
	public static CombatSystem getInstance(){
		if(cb ==  null){
			cb = new CombatSystem();
		}
		return cb;
	}

	/**
	 * {@link FightableCharacter} attacker fights {@link FightableCharacter}
	 * defender
	 * 
	 * @param attacker
	 * @param defender
	 */
	public boolean fight(FightableCharacter attacker, FightableCharacter defender) {

		int dmg = (int) (attacker.getDamage() * getModifier(attacker.getElements(), defender.getElements())); // most basic form more elaborate would involve countering and reactive
		defender.dealDamage(dmg);
				
		return (attacker.getHealth() > 0) && (defender.getHealth() > 0);

	}

	private double getModifier(ArrayList<Element> attackerElements, ArrayList<Element> defenderElements) {
		double mod = 1;

		for (Element ae : attackerElements) {
			for (Element de : defenderElements) {
				if (ae.getName().equals(de.getWeaknessElement().getName())) {
					mod = mod * 2;
				} else if (ae.getName().equals(de.getStrengthElement().getName())) {
					mod = mod / 2;
				}
			}

		}

		return mod;
	}
}
