/**
 * 
 */
package estructurasseleccion;

/**
 * @author emili
 *
 */
import java.util.Scanner;
public class holamundo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int cont,precio;
		System.out.println("precio");
		cont=1;
		
		for (cont=1;cont<=3;cont++) {
			precio=teclado.nextInt();
			
				System.out.println("ta caro");
			
			precio=teclado.nextInt();
		
				System.out.println("ta caro");
			
			precio=teclado.nextInt();
		
				System.out.println("ta bien");
			
			break;
		}
	}

}
