package AlquilerPeliculas;

import java.util.ArrayList;

public class Serie extends Multimedia{

	//ATRIBUTOS
	ArrayList<Temporada> temporadas;

	
	
	//CONSTRUCTORES
	public Serie() {
		super();
		// TODO Auto-generated constructor stub
		this.temporadas = new ArrayList<>();
		this.precio = 10;
	}

	public Serie(String titulo, boolean plus, double precio) {
		super(titulo, plus, precio);
		// TODO Auto-generated constructor stub
		this.temporadas = new ArrayList<>();
	}

	
	
	//GETTERS Y SETTERS
	/**
	 * @return the temporadas
	 */
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	/**
	 * @param temporadas the temporadas to set
	 */
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

	
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [temporadas=");
		builder.append(temporadas);
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
	
	
	//METODOS
	public void addTemporada(Temporada e) {
		e.setSerie(this);
		this.temporadas.add(e);
	}
	
	public void delTemporada(Temporada e) {
		for(Temporada t : temporadas) {
			if(e.equals(t)) {
				temporadas.remove(e);
			}
		}
	}
	
	public int getNumeroTemporadas() {
		return temporadas.size();
	}
	
}
