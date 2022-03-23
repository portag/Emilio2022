/**

 * 
 */

package estructurasseleccion;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class asignaturasemana {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia;
		System.out.println("PRIMERA HORA");
		System.out.println("Escribe un día de la semana");
		
		dia = teclado.next();
		
		
		switch (dia){
		case "lunes":
			System.out.print("a primera hora toca programación");
			break;
		case "martes":
			System.out.print("a primera hora toca empresa");
			break;
		case "miercoles":
			System.out.print("a primera hora toca despliegue");
			break;
		case "jueves":
			System.out.print("a primera hora toca base de datos");
			break;
		case "viernes":
			System.out.print("a primera hora toca interfaces");
			break;
		case "sabado":
			System.out.print("dia libre");
			break;
		case "domingo":
			System.out.print("otro dia libre");
			break;
			
		default:
			System.out.print("DATO INCORRECTO");
		
		}
		

	}

}
