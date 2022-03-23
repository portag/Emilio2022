package Ahorcado;

import java.util.Arrays;
 
public class Ahorcado {
 
	private static String[]diccionario ={"hola","programar","teclado","aplicaciones"};
	private String adivinar;
	private char[] intentado;
	private int fallos;
	
	
	
	public Ahorcado() {
		super();
		//asignar a adivinar las posiciones de las letras de la palabra a adivinar
		int posicion=(int)(Math.random()*Ahorcado.diccionario.length);
		this.adivinar = Ahorcado.diccionario[posicion];
		
		
		//asignar el array con la longitud de la letra a adivinar y asignamos a la variable '_'
		this.intentado = new char[this.adivinar.length()];
		for(int i=0;i<this.adivinar.length();i++) {
			intentado[i]='_';
		}
		
		
		//asignamos los fallos a 0
		this.fallos = 0;
	}



	/**
	 * @return the diccionario
	 */
	public static String[] getDiccionario() {
		return diccionario;
	}



	/**
	 * @return the adivinar
	 */
	public String getAdivinar() {
		return adivinar;
	}



	/**
	 * @return the intentado
	 */
	public char[] getIntentado() {
		return intentado;
	}



	/**
	 * @return the fallos
	 */
	public int getFallos() {
		return fallos;
	}


	//si encuentra devuelve verdadero, cambia intentado, en caso contrario suma 1 fallo
	public boolean intentar(char letra) {
		
		boolean encontrado=false;
		
		for(int i=0;i<this.adivinar.length();i++) {
			if(this.adivinar.charAt(i)==letra) {
				this.intentado[i]=letra;
				encontrado=true;
			}
		}
		if (encontrado==false) {
			this.fallos++;
		}
		return encontrado;
	}
	
	public boolean resolver(String palabra) {
		boolean resuelto=false;
		if(palabra.equals(this.adivinar)) {
			resuelto=true;
		}else {
			this.fallos=7;
		}
		return resuelto;
	}
	
	//comprueba que la palabra a adivinar y palabra intentada son iguales
	public boolean solucion() {
		boolean solucionado = true;
		for(int i=0;i<this.adivinar.length();i++) {
			if(this.adivinar.charAt(i)!=this.intentado[i]) {
				solucionado=false;
			}
		}
		return solucionado;
	}	
	
	
	//pintamos el muñeco
	public void muneco() {
		switch(this.fallos) {
		case 1:
			System.out.println(" O ");
			break;
		case 2:
			System.out.println(" O ");
			System.out.println(" |");
			break;
		case 3:
			System.out.println(" O ");
			System.out.println("-|");
			break;
		case 4:
			System.out.println(" O ");
			System.out.println("-|-");
			break;		
		case 5:
			System.out.println(" O ");
			System.out.println("-|-");
			System.out.println("/");
			break;	
		case 6:
			System.out.println(" O ");
			System.out.println("-|-");
			System.out.println("/ L ");
			break;
		case 7:
			System.out.println("(;-;)");
			System.out.println(" -|-");
			System.out.println(" / L ");
		}
	}
	
}
