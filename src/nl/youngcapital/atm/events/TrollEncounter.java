package nl.youngcapital.atm.events;

import java.util.ArrayList;

import nl.youngcapital.atm.items.Item;

public class TrollEncounter extends Event implements Encounter{


	@Override
	public boolean isFriendly() {
		return false;
	}

}
