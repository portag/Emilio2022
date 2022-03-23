package Profesor;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {

	private boolean catedratico;
	
	
	public ProfesorTitular() {
		super();
		// TODO Auto-generated constructor stub
		this.catedratico = false;
	}


	public ProfesorTitular(ProfesorTitular otro) {
		super(otro);
		// TODO Auto-generated constructor stub
		this.catedratico = otro.catedratico;
	}







	public ProfesorTitular(String numRegistro, String nombre, String apellidos, LocalDate fechaNac, double nomina, boolean catedratico) {
		super(numRegistro, nombre, apellidos, fechaNac, nomina);
		// TODO Auto-generated constructor stub
		this.catedratico = catedratico;
	}



	



	/**
	 * @return the catedratico
	 */
	public boolean isCatedratico() {
		return catedratico;
	}


	/**
	 * @param catedratico the catedratico to set
	 */
	public void setCatedratico(boolean catedratico) {
		this.catedratico = catedratico;
	}


	@Override
	public double importeNomina() {
		// TODO Auto-generated method stub
		return this.nomina + (this.nomina*0.3);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProfesorTitular [catedratico=");
		builder.append(catedratico);
		builder.append(", numRegistro=");
		builder.append(numRegistro);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNac=");
		builder.append(fechaNac);
		builder.append(", nomina=");
		builder.append(nomina);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
