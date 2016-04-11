package nl.youngcapital.atm.events;

import nl.youngcapital.atm.nonplayercharacters.NonPlayableCharacter;
import nl.youngcapital.atm.nonplayercharactersimpl.Merchant;

public class MerchantEncounter extends Event implements Encounter{
	private String description;
	private Merchant merchant;
	
	public MerchantEncounter(){
		merchant = new Merchant();
	}

	@Override
	public boolean isFriendly() {
		return true;
	}

	@Override
	public String getDescription() {
		
		return description;
	}
	
	@Override
	public NonPlayableCharacter getNonPlayableCharacter() {
		
		 return this.merchant;
	}

	
}
