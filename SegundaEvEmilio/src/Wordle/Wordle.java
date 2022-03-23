package Wordle;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Wordle {

	
	/**
	 * @emilio
	 * 
	 * ATRIBUTOS
	 */
	public static ArrayList<String> diccionario = new ArrayList<>();
	private String palabraAcertar;
	private String palabraActual;
	public ArrayList<String> letrasNoEstan;
	private ArrayList<Character> intento; 
	
	
	/**
	 * CONSTRUCTORES
	 */
	public Wordle() {
		super();
		
		this.letrasNoEstan = new ArrayList<>();
		diccionario.add("playa");
		diccionario.add("animo");
		diccionario.add("oscar");
		diccionario.add("anula");
		diccionario.add("anona");
		diccionario.add("anion");
		diccionario.add("apite");
		diccionario.add("aneen");
		diccionario.add("aneto");
		diccionario.add("anida");
		diccionario.add("apipo");
		diccionario.add("apiri");
		diccionario.add("aseos");
		diccionario.add("acezo");
		diccionario.add("acope");
		diccionario.add("acame");
		diccionario.add("abuza");
		diccionario.add("acera");
		diccionario.add("acere");
		diccionario.add("acaro");
		diccionario.add("mesas");
		diccionario.add("arias");
		diccionario.add("argot");
		diccionario.add("arpon");
		diccionario.add("acata");
		diccionario.add("katar");
		diccionario.add("arpia");
		diccionario.add("viejo");
		diccionario.add("abril");
		diccionario.add("manos");
		diccionario.add("arfad");
		this.intento = new ArrayList<>();
		
		
		
		this.palabraAcertar = diccionario.get(LocalDate.now().getDayOfMonth()-1);
	}
	
	public Wordle(String palabraActual) {
		super();
		this.palabraActual = palabraActual;
		this.letrasNoEstan = new ArrayList<>();
		diccionario.add("playa");
		diccionario.add("animo");
		diccionario.add("oscar");
		diccionario.add("anula");
		diccionario.add("anona");
		diccionario.add("anion");
		diccionario.add("apite");
		diccionario.add("aneen");
		diccionario.add("aneto");
		diccionario.add("anida");
		diccionario.add("apipo");
		diccionario.add("apiri");
		diccionario.add("aseos");
		diccionario.add("acezo");
		diccionario.add("acope");
		diccionario.add("acame");
		diccionario.add("abuza");
		diccionario.add("acera");
		diccionario.add("acere");
		diccionario.add("acaro");
		diccionario.add("mesas");
		diccionario.add("arias");
		diccionario.add("argot");
		diccionario.add("arpon");
		diccionario.add("acata");
		diccionario.add("katar");
		diccionario.add("arpia");
		diccionario.add("viejo");
		diccionario.add("abril");
		diccionario.add("manos");
		diccionario.add("arfad");
		this.palabraAcertar = diccionario.get(LocalDate.now().getDayOfMonth()-1);
		this.intento = new ArrayList<>();
		
		
	}

	
	//GETTERS Y SETTERS
	/**
	 * @return the palabraAcertar
	 */
	public String getPalabraAcertar() {
		return palabraAcertar;
	}

	/**
	 * @param palabraAcertar the palabraAcertar to set
	 */
	public void setPalabraAcertar(String palabraAcertar) {
		this.palabraAcertar = palabraAcertar;
	}

	/**
	 * @return the palabraActual
	 */
	public String getPalabraActual() {
		return palabraActual;
	}

	/**
	 * @param palabraActual the palabraActual to set
	 */
	public void setPalabraActual(String palabraActual) {
		this.palabraActual = palabraActual;
	}
	
	/**
	 * @return the intento
	 */
	public ArrayList<Character> getIntento() {
		return intento;
	}
	
	
	

	/**
	 * @return the diccionario
	 */
	public static ArrayList<String> getDiccionario() {
		return diccionario;
	}

	/**
	 * @return the letrasNoEstan
	 */
	public ArrayList<String> getLetrasNoEstan() {
		return letrasNoEstan;
	}

	
	//METODOS
	public boolean comprobar(String palabra) {
		boolean encontrado=false;
		
		if(palabra.length()<6) {
			

			for(int i = 0; i< this.palabraAcertar.length(); i++) {
				
				if(palabra.charAt(i)==this.palabraAcertar.charAt(i)) {
					palabra = palabra.toUpperCase();
					this.palabraAcertar = this.palabraAcertar.toUpperCase();
					this.intento.add(palabra.charAt(i));
					
				}else {
					palabra = palabra.toLowerCase();
					this.palabraAcertar = this.palabraAcertar.toLowerCase();
					
					if(this.palabraAcertar.contains(palabra.substring(i,i))) {
						
						this.intento.add(palabra.charAt(i));
						
					}else{
						this.intento.add('_');
						this.letrasNoEstan.add(palabra.charAt(i), palabra);
					}
					
				}
				
			}

		}
		
		if(palabra.equals(this.palabraAcertar)) {
			encontrado = true;
		}
		
		return encontrado;
	}

	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wordle [intento=");
		builder.append(intento);
		builder.append("]");
		return builder.toString();
	}
	
}
