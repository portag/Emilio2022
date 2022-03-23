package tienda;

import java.util.Objects;

public class Categoria {

	private String nombre;

	/**
	 * Constructor con parametros
	 * @param nombre
	 */
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
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


	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Categoria [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
