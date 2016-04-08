package nl.youngcapital.atm.events;

import nl.youngcapital.atm.nonplayercharacters.Merchant;

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
	
	public Merchant getMerchant(){
		return this.merchant;
	}

	
}
