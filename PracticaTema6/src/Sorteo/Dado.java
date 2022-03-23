package Sorteo;

public class Dado extends Sorteo {

	
	
	public void lanzar() {
		int dado = (int)(Math.random()*6)+1;
		System.out.println(dado);
	}

	
	
	
}
