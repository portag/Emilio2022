package Profesor;

import java.time.LocalDate;

public abstract class Profesor {

	protected String numRegistro;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNac;
	protected double nomina;
	
	
	public Profesor() {
		super();
	}
	
	public Profesor(String numRegistro, String nombre, String apellidos, LocalDate fechaNac, double nomina) {
		super();
		this.numRegistro = numRegistro;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.nomina = nomina;
	}
	
	public Profesor(Profesor otro) {
		super();
		this.numRegistro = otro.numRegistro;
		this.nombre = otro.nombre;
		this.apellidos = otro.apellidos;
		this.fechaNac = otro.fechaNac;
		this.nomina = otro.nomina;
	}
	
	
	
	
	/**
	 * @return the numRegistro
	 */
	public String getNumRegistro() {
		return numRegistro;
	}

	/**
	 * @param numRegistro the numRegistro to set
	 */
	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the fechaNac
	 */
	public LocalDate getFechaNac() {
		return fechaNac;
	}

	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	/**
	 * @return the nomina
	 */
	public double getNomina() {
		return nomina;
	}

	/**
	 * @param nomina the nomina to set
	 */
	public void setNomina(double nomina) {
		this.nomina = nomina;
	}

	public abstract double importeNomina();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesor [numRegistro=");
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
