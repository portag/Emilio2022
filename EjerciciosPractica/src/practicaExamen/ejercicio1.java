package practicaExamen;

import java.util.Scanner;

public class ejercicio1 {

	public static String reemplazar(String cadena,String buscar,String cad) {
		return cadena.replace(buscar, cad);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		System.out.println("dame una cadena");
		String cadena=teclado.nextLine();
		System.out.println();
		System.out.println("cadena a sustituir");
		String cadena2=teclado.nextLine();
		System.out.println("cadena de sustitucion");
		String cadena3=teclado.nextLine();
		cadena=cadena.toLowerCase();
		
		cadena2=cadena2.toLowerCase();
		
		
		System.out.println(reemplazar(cadena, cadena2,cadena3));
		
	}

}
