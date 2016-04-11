package nl.youngcapital.atm.events;

import nl.youngcapital.atm.nonplayercharacters.NonPlayableCharacter;
import nl.youngcapital.atm.nonplayercharactersimpl.Troll;

public class TrollEncounter extends Event implements Encounter{
	private Troll troll;
	
	public TrollEncounter() {
		troll = new Troll();
	}

	@Override
	public boolean isFriendly() {
		return false;
	}

	@Override
	public NonPlayableCharacter getNonPlayableCharacter() {
		return troll;
	}

}
