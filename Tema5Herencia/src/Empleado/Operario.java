package Empleado;

public abstract class Operario extends Empleado {

	//ATRIBUTOS
	protected boolean horasExtra;

	
	//CONSTRUCTORES
	public Operario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operario(String nombre, int edad, int sueldo) {
		super(nombre, edad, sueldo);
		// TODO Auto-generated constructor stub
		this.horasExtra = false;
	}
	
	public Operario(String nombre, int edad, int sueldo, boolean horasExtra) {
		super(nombre, edad, sueldo);
		// TODO Auto-generated constructor stub
		this.horasExtra = horasExtra;
	}

	
	//GETTERS Y SETTERS
	/**
	 * @return the horasExtra
	 */
	public boolean isHorasExtra() {
		return horasExtra;
	}

	/**
	 * @param horasExtra the horasExtra to set
	 */
	public void setHorasExtra(boolean horasExtra) {
		this.horasExtra = horasExtra;
	}

	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operario [horasExtra=");
		builder.append(horasExtra);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
