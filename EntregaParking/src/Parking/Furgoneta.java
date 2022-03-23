package Parking;

public class Furgoneta extends Vehiculo{

	
	private float longitud;

	public Furgoneta() {
		super();
		// TODO Auto-generated constructor stub
		this.longitud = 2;
	}

	public Furgoneta(String matricula, String marca) {
		super(matricula, marca);
		// TODO Auto-generated constructor stub
		this.longitud = 2;
	}

	public Furgoneta(Furgoneta otro) {
		super(otro);
		// TODO Auto-generated constructor stub
		this.longitud = otro.longitud;
	}

	/**
	 * @return the longitud
	 */
	public float getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Furgoneta [longitud=" + longitud + ", teclado=" + teclado + ", matricula=" + matricula + ", marca="
				+ marca + ", fechaEntrada=" + fechaEntrada + ", minutos=" + minutos + ", plaza=" + plaza + "]";
	}
	
	
	public double descuento() {
		// TODO Auto-generated method stub
		double descuento = 1;
		if (this.calcularMinutos() < 120)
			descuento -= 0.03;
		if (this.calcularMinutos() > 3600)
			descuento -= 0.2;
		
		if ( !(this.fechaEntrada.getDayOfWeek().toString().toLowerCase().equals("saturday")) &&
		   !(this.fechaEntrada.getDayOfWeek().toString().toLowerCase().equals("sunday")) ) {
			descuento -= 0.1;
		}
		
		return descuento;
	}

	

	public double calcularImporte() {
		return ((Parking.preciomin*this.calcularMinutos())+(this.longitud*Parking.preciometro))*this.descuento();
	}
	
}
