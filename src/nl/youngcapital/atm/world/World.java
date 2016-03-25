package nl.youngcapital.atm.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
	private Square[][][] world;
	final static public int MAX_X_SIZE_WORLD= 25;
	final static public int MAX_Y_SIZE_WORLD= 25;
	final static public int MAX_Z_SIZE_WORLD= 6;
	
	public String getPossibleDirections(int x, int y, int z){
		
		StringBuilder sb = new StringBuilder();
		sb.append("The way");
		
		List<String> directions = new ArrayList<String>();
		
		
		int southOffset = (y-1 < 0 )? 0 : 1;
		int northOffset = (y+1 > MAX_Y_SIZE_WORLD )? 0 : 1;
		int westOffset = (y-1 < 0 )? 0 : 1;
		int eastOffset = (y+1 > MAX_X_SIZE_WORLD )? 0 : 1;
		
		if(!(this.world[z][southOffset][z] instanceof LemonSquare) ){
			directions.add(" south");
			
		} 
		if(!(this.world[z][northOffset][z] instanceof LemonSquare) ){
			directions.add(" north");
			
		} 
		if(!(this.world[z][y][westOffset] instanceof LemonSquare) ){
			directions.add(" west");
			
		} 
		if(!(this.world[z][y][eastOffset] instanceof LemonSquare) ){
			directions.add(" east");
		}
		
		sb.append(replaceLastComma(directions));
		sb.append("are possible directions");
		return sb.toString();
	}
	
	private String replaceLastComma(List<String> strings){
		String s ="";

		for(int i = 0; i <= strings.size()-3 ; i++){
			s = s + strings.get(i) + ", ";
			
		}
		
		s = s + strings.get(strings.size()-2) + " and " + strings.get(strings.size()-1) + " ";
		
		return s;
	}
	
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
						world[z][y][x] =   new PlainsSquare();
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
						sb.append("-");
						
					} else if(square instanceof LemonSquare){
						sb.append("0");
						
					} else if(square instanceof PlainsSquare){
						sb.append("P");
						
					} else if(square instanceof HotelRoomSquare){
						sb.append("H");
						
					} else if(square instanceof CaveSquare){
						sb.append("C");
						
					} else if(square instanceof RoadSquare){
						sb.append("|");
					}
					
				}
				sb.append("\n");
			}
			
			sb.append("\n\n----------------------------------\n\n");

		}
		
		return sb.toString();
	}
	
	
	
	public Square getSquare(int x, int y, int z){
		return null;
		
	}
}
