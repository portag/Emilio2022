package AlquilerPeliculas;

import java.util.Objects;

public class Episodio {

	
	
	
	/**
	 * ATRIBUTOS
	 */
	private String titulo;
	private int duracion;
	Temporada temporada;
	
	
	
	/**
	 * CONSRTUCTORES
	 */
	public Episodio() {
		super();
	}
	
	public Episodio(String titulo, int duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
	}

	
	
	//GETTERS Y SETTERS
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

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

	
	/**
	 * @return the temporada
	 */
	public Temporada getTemporada() {
		return temporada;
	}

	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}
	
	
	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Episodio [titulo=");
		builder.append(titulo);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", temporada=");
		builder.append(temporada);
		builder.append("]");
		return builder.toString();
	}

	
	/**
	 * EQUALS CON TITULO
	 */
	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Episodio other = (Episodio) obj;
		return Objects.equals(titulo, other.titulo);
	}

	
	
	
	
	
}
