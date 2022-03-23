package Sorteo;

public class Moneda extends Sorteo {

	
	@Override
	public void lanzar() {
		int dado = (int)(Math.random()*2);
		if(dado==0) {
			System.out.println("cara");
		}else {
			System.out.println("cruz");
		}
	}

	
	
}
