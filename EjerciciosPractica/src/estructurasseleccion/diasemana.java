/**
 * 
 */
package estructurasseleccion;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class diasemana {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		numero = teclado.nextInt();
		
		switch (numero){
		case 1:
			System.out.print("lunes");
			break;
		case 2:
			System.out.print("martes");
			break;
		case 3:
			System.out.print("miercoles");
			break;
		case 4:
			System.out.print("jueves");
			break;
		case 5:
			System.out.print("viernes");
			break;
		case 6:
			System.out.print("sabado");
			break;
		case 7:
			System.out.print("domingo");
			break;
			
		default:
			System.out.print("DATO INCORRECTO");
		
		}

	}

}
