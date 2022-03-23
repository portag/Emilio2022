package Parking;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Scanner;

public abstract class Vehiculo implements Descontable{
	
	Scanner teclado = new Scanner(System.in);
	
	protected String matricula;
	protected String marca;
	protected LocalDateTime fechaEntrada;
	protected int minutos;
	protected PlazaAparcamiento plaza;
	
	
	
	public Vehiculo() {
		super();
		this.fechaEntrada = LocalDateTime.now();

	}
	
	public Vehiculo(String matricula, String marca) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.fechaEntrada = LocalDateTime.now();

	}
	
	public Vehiculo(Vehiculo otro) {
		super();
		this.matricula = otro.matricula;
		this.marca = otro.marca;
		this.fechaEntrada = LocalDateTime.now();

	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the fechaEntada
	 */
	public LocalDateTime getFechaEntada() {
		return fechaEntrada;
	}

	/**
	 * @param fechaEntada the fechaEntada to set
	 */
	public void setFechaEntada(LocalDateTime fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * @return the plaza
	 */
	public PlazaAparcamiento getPlaza() {
		return plaza;
	}

	/**
	 * @param plaza the plaza to set
	 */
	public void setPlaza(PlazaAparcamiento plaza) {
		this.plaza = plaza;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
    public boolean equals(Object obj) {
        //if (this == obj)
            //return true;
        if (obj == null)
            return false;
        if (obj instanceof Vehiculo || obj instanceof Coche) {
            Vehiculo other = (Vehiculo) obj;
            String m1 = (String) other.matricula;
            String m2 = (String) matricula;
            return m1.equals(m2);
        }else {
            return false;
        }

    }


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", fechaEntada=" + fechaEntrada + ", minutos="
				+ minutos + ", plaza=" + plaza + "]";
	}
	
	
	public int calcularMinutos() {
		
		Duration d = Duration.between(this.fechaEntrada.withMinute(0).toLocalTime(), LocalDateTime.now().toLocalTime());
		return (int) d.toMinutes();
	}
	
	public abstract double calcularImporte(); 
	
	
}
