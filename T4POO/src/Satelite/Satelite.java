package Satelite;

public class Satelite {

	private double meridiano; 
	private double paralelo; 
	private double distancia_tierra; 
	
	Satelite (double m, double p, double d) {
		meridiano = m; paralelo = p; distancia_tierra = d;
	} 
	
	Satelite () {
		meridiano=paralelo=distancia_tierra=0; 
	} 
	
	public void setPosicion(double m, double p, double d) {
		meridiano = m; paralelo = p; distancia_tierra = d; 
	} 
	
	public void variaAltura(double desplazamiento) {
		this.distancia_tierra+=desplazamiento;
	}
	
	public boolean enOrbita() {
		boolean orbita=false;
		
		//tenemos en cuenta la altura que debe tener hasta que salga de la atmosfera, 700 kms
		if (!(this.distancia_tierra<=700)) {
			return true;
		}
		
		return orbita;
	}
	
	public void variaPosicion(double variap, double variam) {
		this.paralelo+=variap;
		this.meridiano+=variam;
	}
	
	public void printPosicion() { 
		System.out.println("El satélite se encuentra en ");
		System.out.println("el paralelo "+paralelo+" meridiano "+meridiano); 
		System.out.println(" a una distancia de la Tierra de "+distancia_tierra+" kms."); 
		System.out.println(enOrbita());
	}
	
	
}
