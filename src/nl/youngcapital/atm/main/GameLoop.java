package nl.youngcapital.atm.main;

import java.util.Scanner;

import nl.youngcapital.atm.player.Player;
import nl.youngcapital.atm.world.World;

public class GameLoop {
	
	

	public void run() {
		World gw = new World(); 
		System.out.println("got a world");
		Player p = new Player();
		Scanner s = new Scanner(System.in);
		System.out.println("You wake up and remember nothing!");
		while(true){
			
			System.out.println( "You see these accessible directions: " );
			System.out.println(gw.getPossibleDirections(p.getX(), p.getY(), p.getZ()));
			String direction = s.next();
			if(!direction.equals("q") || !direction.equals("quit")){
				
				switch(direction.toLowerCase()){
				case "north":
					p.setY(p.getY()+1);
					break;
				case "south":
					p.setY(p.getY()-1);
					break;
				case "east":
					p.setX(p.getX()+1);
					break;
				case "west":
					p.setX(p.getX()-1);
					break;
				default:
					continue;
				}
				
			}else{
				break;
			}
			handleTurn(p);
		}
		
	}
	
	private void handleTurn(Player p){
		System.out.println("hoi");
		System.out.println(p);
	}
	
}
