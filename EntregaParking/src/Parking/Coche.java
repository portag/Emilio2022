package Parking;


public class Coche extends Vehiculo{

	
	Combustible combustible;

	
	
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coche(String matricula, String marca, Combustible combustible) {
		super(matricula, marca);
		// TODO Auto-generated constructor stub
		this.combustible = combustible;
	}
	
	public Coche(String matricula, String marca) {
		super(matricula, marca);
		// TODO Auto-generated constructor stub
		this.combustible = Combustible.HIBRIDO;
	}

	public Coche(Coche otro) {
		super(otro);
		// TODO Auto-generated constructor stub
		this.combustible = otro.combustible;
	}

	
	
	/**
	 * @return the combustible
	 */
	public Combustible getCombustible() {
		return combustible;
	}

	/**
	 * @param combustible the combustible to set
	 */
	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}


	public double descuento() {
		// TODO Auto-generated method stub
		int descuento = 1;
		if(this.calcularMinutos()>=120) {
			descuento -= 0.05;
		}else if(this.calcularMinutos()>= 3600) {
			descuento -=0.3;
		}
		switch(fechaEntrada.getDayOfWeek()) {
		case SATURDAY,SUNDAY:
			descuento -=0.1;
			break;
		default:
			descuento += 0;
		}
		
		switch(combustible) {
		case DIESEL,GASOLINA:
			descuento += 0.1;
			break;
		case HIDROGENO,ELECTRICO:
			descuento -= 0.1;
		break;
		default:
			descuento += 0;
		}
		return descuento;
	}

	

	public double calcularImporte() {
		return Parking.preciomin*calcularMinutos()*descuento();
	}
	
	
	
	
}
