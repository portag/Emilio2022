/**
 * 
 */
package estructurasseleccion;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class saludo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int hora;
		
		System.out.println("DIME LA HORA");
		
		hora = teclado.nextInt();
		
		if (hora>=6 && hora <=12) {
			System.out.println("buenos dias");
		}
		
		if (hora>=13 && hora <=20) {
			System.out.println("buenas tardes");
		}
		
		if (hora>=21 && hora <=23 || hora>=0 && hora<=5) {
			System.out.println("buenas noches");
		}
		
		if (hora>=24 || hora <=(-1)) {
			System.out.println("DATO INCORRECTO");
		}
		
		
		
		

	}

}
