package String;
import java.util.Scanner;
public class ejercicio4 {

	public static String reemplazar(String cadena,String buscar) {
		return cadena.replace(buscar, buscar.toUpperCase());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("dame una cadena");
		String cadena=teclado.nextLine();
		System.out.println();
		System.out.println("cadena a sustituir");
		String cadena2=teclado.nextLine();

		cadena=cadena.toLowerCase();
		
		cadena2=cadena2.toLowerCase();
		
		
		System.out.println(reemplazar(cadena, cadena2));
	}

}
