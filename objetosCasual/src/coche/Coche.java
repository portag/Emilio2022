package coche;

public class Coche {

	private String modelo;
	private String marca;
	private String color;
	private double largo;
	private double ancho;
	private double alto;
	
	
	
	public Coche() {
		super();
		this.modelo = "fiesta";
		this.marca = "ford";
		this.color = "blanco";
		this.largo = 2.5;
		this.ancho = 1.5;
		this.alto = 1.75;
	}
	
	public Coche(String modelo, String marca, String color, double largo, double ancho, double alto) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", largo=" + largo + ", ancho="
				+ ancho + ", alto=" + alto + "]";
	}
	
	
	
	
	
	
	
}
