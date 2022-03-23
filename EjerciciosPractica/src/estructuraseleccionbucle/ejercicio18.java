/**
 * 
 */
package estructuraseleccionbucle;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class ejercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int altura,anchura;
		String caracter;
		
		System.out.println("altura de la piramide");
		altura=teclado.nextInt();
		System.out.println("anchura de la piramide");
		anchura=teclado.nextInt();
		System.out.println("caracter de relleno");
		caracter=teclado.next();
		
		int[][] array = new int [anchura][altura];
		
		for(int i=0; i<altura;i++) {
			for(int j=0; j<anchura;j++) {
				if(i==j) {
					System.out.print(caracter+" ");
				}
				
			}
			System.out.println(" ");
			System.out.println(" ");
		}

	}

}
