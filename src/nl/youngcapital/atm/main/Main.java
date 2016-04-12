package nl.youngcapital.atm.main;

public class Main implements Runnable{
	
	
	public static void main(String[] args){
		
		Main m = new Main();
		m.run();
	}
	
	@Override
	public void run() {
		GameLoop gl = new GameLoop();
		gl.run();
	}

	
	
}
