/**
 * 
 */
package Pez;

/**
 * @author emili
 *
 */
public class Pez implements Cloneable {

	
	//atributos
	protected String nombre;
	public static int numPeces=0;
	
	
	
	
	//constructores
	public Pez() {
		super();
		this.nombre = "pez comun";
		Pez.numPeces++;
	}
	
	public Pez(String nombre) {
		super();
		this.nombre = nombre;
		Pez.numPeces++;
	}
	
	public Pez(Pez otro) {
		super();
		this.nombre = otro.nombre;
		Pez.numPeces++;
	}

	
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	//clone y equals
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Pez.numPeces++;
		return super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pez other = (Pez) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pez [nombre=" + nombre + "]";
	}

}
