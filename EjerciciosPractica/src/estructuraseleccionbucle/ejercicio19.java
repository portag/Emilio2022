/**
 * 
 */
package estructuraseleccionbucle;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num,incremento;
		int suma = 0;
		
		System.out.println("introduce un numero");
		num = teclado.nextInt();
		
		System.out.println("introduce un incremento");
		incremento = teclado.nextInt();
	
		while (num<=0 || incremento<=0) {
			System.out.println("el numero y el incremento han de ser mayor de 0");
			incremento = teclado.nextInt();

		}
		
		for(int i=1;i<=5;i++) {
			System.out.println(num);
			suma=suma+num;
			num=num*incremento;
			
		}
		
		System.out.println("");
		System.out.println("la suma es: "+suma);
		
		
	}

}
