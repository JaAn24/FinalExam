package model;
import processing.core.PApplet;


public class Polo implements Runnable {
	private int color;
	private int tam;
	private int speed;
	private boolean choque;

	public Polo() {
		color = 255;
		tam = 30;
		speed = 10;
		choque = false;
		
		
		
		
	}
	
	public void cargarPolos() {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getChoque() {
		return choque;
	}

	public void setChoque(int choque) {
		this.choque = choque;
	}

}
