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
	
	
	public void useItem(){
		//TODO implement
	}
	public String showInventory(){
		//TODO implement
		return null;
	}
	
	public void pickUpItem(Item item){
		inventory.add(item);
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
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("location (X, Y, Z): ");
		
		sb.append(x);
		sb.append(", ");
		sb.append(y);
		sb.append(", ");
		sb.append(z);
		
		for(Item it : inventory){
			sb.append(it + "\n");
		}
		
		
		return sb.toString();
	}

}
