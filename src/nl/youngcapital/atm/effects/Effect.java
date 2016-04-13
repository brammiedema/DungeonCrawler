package nl.youngcapital.atm.effects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import nl.youngcapital.atm.elements.Element;

public abstract class Effect {
	private int duration; 
	private String name;
	private int effectProc;
	private Long id;
	
	
	public Effect(){
		
	}
	
	public Effect(int duration, String name, int effectProcChance){
		this.duration= duration;
		this.name = name;
		this.effectProc = effectProcChance;
	}
	
	public abstract Element getElement();
	
	public abstract int getDuration();
	
	public abstract String getName();
	
	public abstract int getEffectProc();
	
	public abstract void substractDuration();
	
	public abstract void addDuration();
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setDuration(int duration){
		this.duration = duration;
	}
	
	public void setEffectProc(int effectProc){
		this.effectProc = effectProc;
	}
	
//	@Id
//	@GeneratedValue(generator="increment")
//	@GenericGenerator(name="increment", strategy = "increment")
	public Long getId() {
	    return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
}
