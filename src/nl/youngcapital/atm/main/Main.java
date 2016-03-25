package nl.youngcapital.atm.main;

import nl.youngcapital.atm.player.Player;
import nl.youngcapital.atm.world.World;

public class Main implements Runnable{
	
	
	public static void main(String[] args){
		
		Main m = new Main();
		m.run();
	}

	@Override
	public void run() {
		World gw = new World(); 
		System.out.println("got a world");
		Player p = new Player();
		System.out.println(gw.getPossibleDirections(p.getX(), p.getY(), p.getZ()));
		System.out.println(gw);
	}
	
}
