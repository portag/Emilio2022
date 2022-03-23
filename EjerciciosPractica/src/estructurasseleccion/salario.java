/**
 * 
 */
package estructurasseleccion;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class salario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce las horas trabajadas");
		
		int horas;
		int extra;
		int salario;
		salario=0;
		horas = teclado.nextInt();
		
		if (horas<=40 && horas>=0) {
			salario = horas*12;
		}
		
		if (horas>40) {
			extra = horas - 40;
			salario = (40*12) + (extra*16);
		}
		
		System.out.println("tu salario es de "+salario);
		
		
		
	}

}
