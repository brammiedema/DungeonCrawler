package nl.youngcapital.atm.world;

import java.util.Random;

public class World {
	Square[][][] world;
	final static private int MAX_X_SIZE_WORLD= 25;
	final static private int MAX_Y_SIZE_WORLD= 25;
	final static private int MAX_Z_SIZE_WORLD= 6;
	
	public World(){
		world = new Square[MAX_Z_SIZE_WORLD][MAX_Y_SIZE_WORLD][MAX_X_SIZE_WORLD];
		
		Random ran = new Random();

		for(int z = 0;  z < world.length; z++){
			
			for(int y = 0;  y < world[z].length; y++){
				
				for(int x = 0;  x < world[z][y].length; x++){
					
					int randomInt = ran.nextInt(125) % 5;
					
					switch (randomInt) {
					
					case 0:
						
						world[z][y][x] =  new CaveSquare();
						
						break;
					case 1:
						world[z][y][x] =   new DarkRoomSquare();
						break;
					case 2:
						world[z][y][x] =   new HotelRoomSquare();
						break;
					case 3:
						world[z][y][x] =   new PlainesSquare();
						break;
					default:
						world[z][y][x] =  new RoadSquare();
						break;
					}
				}
			}
		}	
	}
	
	public String toString(){
		StringBuilder sb =  new StringBuilder();
		
		
		for( Square[][] worldSide : world){
			for( Square[] worldSideRow : worldSide){
				for( Square square : worldSideRow){
					
					if (square instanceof DarkRoomSquare){
						System.out.println(square.getDescription());
						sb.append("-");
						
					} else if(square instanceof LemonSquare){
						sb.append("0");
						
					} else if(square instanceof PlainesSquare){
						sb.append("i");
						
					} else if(square instanceof HotelRoomSquare){
						sb.append("H");
						
					} else if(square instanceof CaveSquare){
						sb.append("C");
						
					}
					
				}
				sb.append("\n");
			}
			
			sb.append("\n\n----------------------------------\n");

		}
		
		return sb.toString();
	}
	
	
	
	public Square getSquare(int x, int y, int z){
		return null;
		
	}
}
