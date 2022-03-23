package Finanzas;

public class Finanzas {

	//propiedades
	private double cambio;

	
	//metodos
	public Finanzas() {
		super();
		this.cambio = 1.36;
	}
	
	public Finanzas(double cambio) {
		super();
		this.cambio = cambio;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}
	
	public double dolaresToEuro(double dolares) {
		return this.cambio*dolares;
	}
	
	public double eurosToDolares(double euros) {
		return euros/this.cambio;
	}
	
}
