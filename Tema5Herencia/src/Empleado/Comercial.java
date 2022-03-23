package Empleado;

public class Comercial extends Empleado {

	
	//ATRIBUTOS
	protected double comision;

	
	
	//CONSTRUCTORES
	public Comercial() {
		super();
		// TODO Auto-generated constructor stub
		plus();
	}

	
	public Comercial(String nombre, int edad, int sueldo) {
		super(nombre, edad, sueldo);
		// TODO Auto-generated constructor stub
		this.comision = 0;
		plus();
	}
	
	
	public Comercial(String nombre, int edad, int sueldo, double comision) {
		super(nombre, edad, sueldo);
		// TODO Auto-generated constructor stub
		this.comision = comision;
		plus();
	}
	
	
	
	//METODO
	public void plus() {
		if(this.edad>30 && this.comision>200) {
			this.sueldo+=plus;
		}
	}


	
	//GETTERS Y SETTERS
	/**
	 * @return the comision
	 */
	public double getComision() {
		return comision;
	}


	/**
	 * @param comision the comision to set
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}


	
	//TO STRING
	@Override
	public String toString() {
		return "Comercial [comision=" + comision + ", nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	
	
}
