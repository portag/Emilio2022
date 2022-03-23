package Empleado;

public class Repartidor extends Operario{

	//ATRIBUTOS
	protected String zona;
	
	
	//CONSTRUCTORES
	public Repartidor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Repartidor(String nombre, int edad, int sueldo, boolean horasExtra) {
		super(nombre, edad, sueldo, horasExtra);
		// TODO Auto-generated constructor stub
		this.zona = "zona";
		plus();
	}



	public Repartidor(String nombre, int edad, int sueldo, String zona, boolean horasExtra) {
		super(nombre, edad, sueldo,horasExtra);
		// TODO Auto-generated constructor stub
		this.zona = zona;
		plus();
	}
	
	
	//METODO
	public void plus() {
		if(this.edad<25 && this.zona.equals("zona 3") && this.horasExtra == false) {
			this.sueldo+=plus;
		}else if(this.edad<25 && this.zona.equals("zona 3") && this.horasExtra == true) {
			this.sueldo = this.sueldo + (plus*2);
		}
	}

	

	//GETTERS Y SETTERS
	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Repartidor [zona=");
		builder.append(zona);
		builder.append(", horasExtra=");
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
