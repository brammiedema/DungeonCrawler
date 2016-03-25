package nl.youngcapital.atm.player;

import java.util.ArrayList;
import java.util.Random;

import nl.youngcapital.atm.items.Item;
import nl.youngcapital.atm.world.World;

public class Player {
	
	private ArrayList<Item> inventory = new ArrayList<>();
	private int x;
	private int y;
	private int z;
	
	public Player(){
		Random ran = new Random();
		this.x = Math.abs((ran.nextInt() % World.MAX_X_SIZE_WORLD));
		this.y = Math.abs((ran.nextInt() % World.MAX_Y_SIZE_WORLD));
		this.z = Math.abs((ran.nextInt() % World.MAX_Z_SIZE_WORLD));
	}
	
	public Player(int x, int Y, int Z){
		
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	

}
