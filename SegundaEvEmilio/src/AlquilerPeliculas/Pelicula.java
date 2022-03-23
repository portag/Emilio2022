package AlquilerPeliculas;

public class Pelicula extends Multimedia{

	//ATRIBUTOS
	private int duracion;

	
	
	//CONSTRUCTORES
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(String titulo, boolean plus, double precio, int duracion) {
		super(titulo, plus, precio);
		// TODO Auto-generated constructor stub
		this.duracion = duracion;
	}
	
	
	//GETTERS Y SETTERS
	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [duracion=");
		builder.append(duracion);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
