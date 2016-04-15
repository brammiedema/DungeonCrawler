package nl.youngcapital.atm.player;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import nl.youngcapital.atm.armor.Armor;
import nl.youngcapital.atm.weapon.Weapon;

@Entity
public class CharacterSheet {
	private PlayerData playerData;
	private Armor helm;
	private Weapon weapon;
	private long id;
	
	@OneToOne(mappedBy="cs") // mappedBy is property op PlayerData
	public PlayerData getPlayerData() {
		return playerData;
	}
	
	public void setPlayerData(PlayerData playerData) {
		this.playerData = playerData;
	}
	
	@OneToOne(cascade = {CascadeType.ALL})
	public Armor getHelm() {
		return helm;
	}
	
	public void setHelm(Armor helm) {
		this.helm = helm;
	}
	
	@OneToOne(cascade = {CascadeType.ALL})
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
