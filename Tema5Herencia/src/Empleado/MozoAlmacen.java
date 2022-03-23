package Empleado;

public class MozoAlmacen extends Operario {

	
	//ATRIBUTO
	protected int peligrosidad;
	
	
	//CONSTRUCTORES
	public MozoAlmacen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MozoAlmacen(String nombre, int edad, int sueldo, boolean horasExtra) {
		super(nombre, edad, sueldo, horasExtra);
		// TODO Auto-generated constructor stub
		this.peligrosidad = 0;
		plus();
	}

	public MozoAlmacen(String nombre, int edad, int sueldo, int peligrosidad, boolean horasExtra) {
		super(nombre, edad, sueldo, horasExtra);
		// TODO Auto-generated constructor stub
		this.peligrosidad = peligrosidad;
		plus();
	}
	
	
	//METODO
	public void plus() {
		if (this.peligrosidad>=3 && this.horasExtra == false) {
			this.sueldo+=plus;
		}else if(this.peligrosidad==2 && this.edad > 30 && this.horasExtra == false) {
			this.sueldo+=plus;
		}else if(this.peligrosidad==1 && this.edad < 30 && this.horasExtra == false) {
			this.sueldo+=plus;
		}else if(this.peligrosidad>=3 && this.horasExtra == true) {
			this.sueldo=this.sueldo+(plus*2);
		}else if(this.peligrosidad==2 && this.edad > 30 && this.horasExtra == true) {
			this.sueldo=this.sueldo+(plus*2);
		}else if(this.peligrosidad==1 && this.edad < 30 && this.horasExtra == true) {
			this.sueldo=this.sueldo+(plus*2);
		}
	}

	
	
	//GETTERS Y SETTERS
	/**
	 * @return the peligrosidad
	 */
	public int getPeligrosidad() {
		return peligrosidad;
	}

	/**
	 * @param peligrosidad the peligrosidad to set
	 */
	public void setPeligrosidad(int peligrosidad) {
		this.peligrosidad = peligrosidad;
	}

	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MozoAlmacen [peligrosidad=");
		builder.append(peligrosidad);
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
