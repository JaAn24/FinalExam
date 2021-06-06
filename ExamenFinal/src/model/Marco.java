package model;
import processing.core.PApplet;


public class Marco extends Thread {
	private int col;
	private int tam;
	private int velo;
	private boolean eliminar;

	public Marco() {
		col = 13;
		tam = 40;
		velo = 15;
		eliminar = false;
		
	
		
	}
	
	public void cargarThread() {
		
		for(int i = 0; j< marco.lenght; j ++) {
			
			for(int j = 0; 0; j<polo[0].lenght; j ++) {
				polo = new Polo[i][j];
				if(!Polo.get()&& j % 2 !=0) {
					Thread t = new Thread(Polo);
					t.start;
				}
			}
		}
		
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getVelo() {
		return velo;
	}

	public void setVelo(int velo) {
		this.velo = velo;
	}

	public boolean getEliminar() {
		return eliminar;
	}

	public void setEliminar(int eliminar) {
		this.eliminar = eliminar;
	}

}
