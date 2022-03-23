package Electrodomestico;

public class Lavadora extends Electrodomestico {
	
	
	protected double carga;

	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
		this.carga=5;
	}

	public Lavadora(String marca, String modelo, double precioBase, double peso, Eficiencia consumoEnergetico,
			Color color) {
		super(marca, modelo, precioBase, peso, consumoEnergetico, color);
		// TODO Auto-generated constructor stub
	}
	
	public Lavadora(String marca, String modelo, double precioBase, double peso, Eficiencia consumoEnergetico,
			Color color,int carga) {
		super(marca, modelo, precioBase, peso, consumoEnergetico, color);
		this.carga = carga;
		this.consumoEnergetico = consumoEnergetico;
		this.color = color;
	}

	/**
	 * @return the carga
	 */
	public double getCarga() {
		return carga;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lavadora [carga=");
		builder.append(carga);
		builder.append(", marca=");
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

	

	public double precioFinal() {
		double precio=super.precioFinal();
		if(this.carga>8) {
			return precio+50;
		}else {
			return precio;
		}
	}
	
	
	

}
