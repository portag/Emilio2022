package Electrodomestico;

public class Electrodomestico {

	protected enum Color{blanco,negro,rojo,azul,gris};
	protected enum Eficiencia{A,B,C,D,E,F,G};
	
	//atributos
	protected String marca;
	protected String modelo;
	protected double precioBase;
	protected double peso;
	protected Eficiencia consumoEnergetico;
	protected Color color;
	
	
	
	//metodos
	
	public Electrodomestico() {
		super();
		this.precioBase = 100;
		this.peso = 5;
		this.consumoEnergetico = Eficiencia.F;
		this.color=Color.blanco;
	}



	public Electrodomestico(String marca, String modelo, double precioBase, double peso, Eficiencia consumoEnergetico,
			Color color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumoEnergetico = consumoEnergetico;
		this.color = color;
	}



	//getters y setters
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}



	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}



	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}



	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}



	/**
	 * @return the consumoEnergetico
	 */
	public Eficiencia getConsumoEnergetico() {
		return consumoEnergetico;
	}



	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	
	
	public double precioFinal() {
		
		double preciof=0;
		
		switch(this.consumoEnergetico) {
		
		case A:
			preciof=this.precioBase+100;
			break;
		case B:
			preciof=this.precioBase+80;
			break;
		case C:
			preciof=this.precioBase+60;
			break;
		case D:
			preciof=this.precioBase+50;
			break;
		case E:
			preciof=this.precioBase+30;
			break;
		case F:
			preciof=this.precioBase+10;
			break;
		case G:
			preciof=this.precioBase+10;
			break;
		}
		
		if (this.peso>=0 && this.peso<=19) {
			preciof+=10;
		}
		if (this.peso>=20 && this.peso<=49) {
			preciof+=50;
		}
		if (this.peso>=50 && this.peso<=79) {
			preciof+=80;
		}
		if (this.peso>=80) {
			preciof+=100;
		}
	
		
		
		return preciof;
	}
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Electrodomestico [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", precioBase=");
		builder.append(precioBase);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", consumoEnergetico=");
		builder.append(consumoEnergetico);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
}
