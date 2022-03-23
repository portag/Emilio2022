package Empleado;

public abstract class Empleado {

	
	//ATRIBUTOS
	protected String nombre;
	protected int edad;
	protected int sueldo;
	public static int plus = 300;
	
	
	
	//CONSTRUCTORES
	public Empleado() {
		super();
		this.nombre = "juan";
		this.edad = 30;
		this.sueldo = 1000;
	}
	
	public Empleado(String nombre, int edad, int sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	
	
	//GETTERS Y SETTERS
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the sueldo
	 */
	public int getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @return the plus
	 */
	public static int getPlus() {
		return plus;
	}


	/**
	 * @param plus the plus to set
	 */
	public static void setPlus(int plus) {
		Empleado.plus = plus;
	}
	
	
	//METODO
	public abstract void plus();
		
	

	//TO STRING
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	
	
}
