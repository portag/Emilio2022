package AlquilerPeliculas;

import java.util.ArrayList;

public class Temporada {

	
	
	//ATRIBUTOS
	private int numero;
	ArrayList<Episodio> episodios;
	Serie serie;
	public static int numT = 1;
	
	
	
	//CONSTRUCTORES
	public Temporada() {
		super();
		this.numero = numT;
		this.episodios = new ArrayList<>();
		Temporada.numT++;
	}
	
	public Temporada(int numero) {
		super();
		this.numero = numero;
		this.episodios = new ArrayList<>();
	}



	//GETTERS Y SETTERS
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}



	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	/**
	 * 
	 * @return episodios.size
	 */
	public int getNumeroEpisodos() {
		return this.episodios.size();
	}



	/**
	 * @return the episodios
	 */
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}



	/**
	 * @param episodios the episodios to set
	 */
	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}



	/**
	 * @return the serie
	 */
	public Serie getSerie() {
		return serie;
	}



	/**
	 * @param serie the serie to set
	 */
	public void setSerie(Serie serie) {
		this.serie = serie;
	}



	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temporada [numero=");
		builder.append(numero);
		builder.append(", episodios=");
		builder.append(episodios);
		builder.append(", serie=");
		builder.append(serie.getTitulo());
		builder.append("]");
		return builder.toString();
	}
	
	
	//METODOS
	public void addEpisodio(Episodio e) {
		e.setTemporada(this);
		episodios.add(e);
	}
	
	public void delEpisodio(Episodio e) {
		for(Episodio ep : episodios) {
			if(e.equals(ep)) {
				episodios.remove(e);
			}
		}
	}
	
	
	
	
	
}
