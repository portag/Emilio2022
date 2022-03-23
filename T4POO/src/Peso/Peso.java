package Peso;

public class Peso {
	
	
	private double pesoKilos;
	private String medida;

	//pasaremos un peso en kilos por defecto
	//cuando introduzcamos la medida el peso por defecto en kilos cambiará al peso de la medida introducida
	public Peso(double pesoKilos, String medida) {
		super();
		this.medida = medida;
		switch(medida){
		case "K":
			this.pesoKilos = pesoKilos;
			break;
		case "Lb":
			this.pesoKilos = pesoKilos*0.453;
			break;
		case "Li":
			this.pesoKilos = pesoKilos/14.59;
			break;
		case "Oz":
			this.pesoKilos = pesoKilos*0.02835;
			break;
		case "P":
			this.pesoKilos = pesoKilos*0.00155;
			break;
		case "G":
			this.pesoKilos = pesoKilos*1000;
		default:
			System.out.println("ERROR");
		}
	}
	
	public double getPesoKilos() {
		return pesoKilos;
	}
	
	public double getLibras() {
		return pesoKilos/0.453;
	}
	
	public double getLingotes() {
		return pesoKilos/14.59;
	}
	
	public double getPeso(String medida) {
		switch (medida) {
			case "Lb": {
				return this.getLibras();
			}
			case "Li": {
				return this.getLingotes();
			}
			case "Oz": {
				return this.pesoKilos * 1000 / 28.35;
			}
			case "P": {
				return this.pesoKilos * 1000 / 1.55;
			}
			case "K": {
				return this.pesoKilos;
			}
			case "G": {
				return this.pesoKilos * 1000;
			}
		}
		return pesoKilos;

	}


}
