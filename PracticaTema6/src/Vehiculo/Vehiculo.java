package Vehiculo;

public abstract class Vehiculo {

	
	private int peso; 
	
	public final void setPeso(int p) { 
		peso = p; 
	} 
	
	public abstract int getVelocidadActual();
	
	/*
	 * ¿Podrá tener descendencia esta clase?
	 * 
	 * Al ser una clase abstracta la clase
	 * debera tener descendencia, puesto que no 
	 * se podran crear objetos de ella
	 * 
	 * Las clases hijas implementaran el metodo
	 * getVelecidadActual()
	 * 
	 * 
	 * ¿Se pueden sobreescribir todos sus métodos?
	 * 
	 * Solo se puede cambiar el metodo getVelocidadActual(),
	 * el metodo setPeso no podra sobreescribirse porque 
	 * es final
	 */
}
