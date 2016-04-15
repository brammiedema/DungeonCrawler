package nl.youngcapital.atm.weapon;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import nl.youngcapital.atm.player.CharacterSheet;

@Entity
public class Weapon {

	private String name;
	private String type;
	private int maxDmg;
	private int minDmg;
	private int price;
	private long id;

	private CharacterSheet cs;

	private List<String> effects;
	private List<String> elements;

	/**
	 * Generates a weapon with the stats given
	 * 
	 * @param name
	 * @param type
	 * @param maxDmg
	 * @param minDmg
	 * @param price
	 * @param elements
	 * @param effects
	 */
	public Weapon(String name, String type, int maxDmg, int minDmg, int price, List<String> elements,
			List<String> effects) {
		super();
		this.name = name;
		this.type = type;
		this.maxDmg = maxDmg;
		this.minDmg = minDmg;
		this.price = price;
		this.elements = elements;
		this.effects = effects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaxDmg() {
		return maxDmg;
	}

	public void setMaxDmg(int maxDmg) {
		this.maxDmg = maxDmg;
	}

	public int getMinDmg() {
		return minDmg;
	}

	public void setMinDmg(int minDmg) {
		this.minDmg = minDmg;
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

	@OneToOne(mappedBy = "weapon")
	public CharacterSheet getCs() {
		return cs;
	}

	public void setCs(CharacterSheet cs) {
		this.cs = cs;
	}

	@ElementCollection
	@CollectionTable(name = "Effects", joinColumns = @JoinColumn(name = "id"))
	@Column(name = "effects")
	public List<String> getEffects() {
		return effects;
	}

	public void setEffects(List<String> effects) {
		this.effects = effects;
	}

	@ElementCollection
	@CollectionTable(name = "Elements", joinColumns = @JoinColumn(name = "id"))
	@Column(name = "elements")
	public List<String> getElements() {
		return elements;
	}

	public void setElements(List<String> elements) {
		this.elements = elements;
	}

}
