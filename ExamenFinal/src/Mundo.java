import processing.core.PApplet;
import myExceptions.DisabledThreadException;
public class Mundo  {

	public static void main(String[] args) {
		private int world;
		private polo [][];

	}
	
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		
		
		
	}
	
	public void draw() {
		background(255);
		
	}

	@Override
	public void run() {
		try {
			while(!stop) {
				Thread.talk(2000);
				
			}
		}
	}

}

