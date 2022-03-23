package Electrodomestico;

public class Television extends Electrodomestico {

	public enum Tecnologia{oled,qled,microled};
	public enum Resolucion{FHD,CUATROK,OCHOK};
	
	protected int pulgadas;
	protected Tecnologia tecnologia;
	protected Resolucion resolucion;
	
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(String marca, String modelo, double precioBase, double peso, Eficiencia consumoEnergetico,
			Color color) {
		super(marca, modelo, precioBase, peso, consumoEnergetico, color);
		// TODO Auto-generated constructor stub
		this.pulgadas = 50;
		this.tecnologia = Tecnologia.microled;
		this.resolucion = Resolucion.OCHOK;
	}
	
	public Television(String marca, String modelo, double precioBase, double peso, Eficiencia consumoEnergetico,
			Color color, int pulgadas, Tecnologia tecnologia, Resolucion resolucion) {
		super(marca, modelo, precioBase, peso, consumoEnergetico, color);
		// TODO Auto-generated constructor stub
		this.pulgadas = pulgadas;
		this.tecnologia = tecnologia;
		this.resolucion = resolucion;
		
	}

	/**
	 * @return the pulgadas
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * @param pulgadas the pulgadas to set
	 */
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	/**
	 * @return the tecnologia
	 */
	public Tecnologia getTecnologia() {
		return tecnologia;
	}

	/**
	 * @param tecnologia the tecnologia to set
	 */
	public void setTecnologia(Tecnologia tecnologia) {
		this.tecnologia = tecnologia;
	}

	/**
	 * @return the resolucion
	 */
	public Resolucion getResolucion() {
		return resolucion;
	}

	/**
	 * @param resolucion the resolucion to set
	 */
	public void setResolucion(Resolucion resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Television [pulgadas=");
		builder.append(pulgadas);
		builder.append(", tecnologia=");
		builder.append(tecnologia);
		builder.append(", resolucion=");
		builder.append(resolucion);
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
	
	
	
	
	
}
