package String;
import java.util.Scanner;
public class ejercicio5 {
	
	public static int contarVocal(String cad) {
		int cont=0;
		for(int i=0;i<cad.length();i++) {
			if(cad.charAt(i)=='a' || cad.charAt(i)=='e' || cad.charAt(i)=='i' || cad.charAt(i)=='o' || cad.charAt(i)=='u') {
				cont++;
			}
		}
		return cont;
	}
	
	public static int contarConsonante(String cad) {
		int cont=0;
		for(int i=0;i<cad.length();i++) {
			switch(cad.charAt(i)) {
			case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z':
				cont++;
			}
		}
		return cont;
	}
	
	public static int contarEspacio(String cad) {
		int cont=0;
		for(int i=0;i<cad.length();i++) {
			if(cad.charAt(i)==' ') {
				cont++;
			}
		}
		return cont;
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("dame una cadena");
		String cadena=teclado.nextLine();
		
		System.out.println("vocales: "+contarVocal(cadena));
		System.out.println("consonantes: "+contarConsonante(cadena));
		System.out.println("espacios: "+contarEspacio(cadena));
	}
}
