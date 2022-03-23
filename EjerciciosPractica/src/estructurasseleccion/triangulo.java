/**
 * 
 */
package estructurasseleccion;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class triangulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double l1,l2,l3;
		
		System.out.println("introduce el dado 1");
		l1= teclado.nextInt();
		
		System.out.println("introduce el dado 2");
		l2= teclado.nextInt();

		System.out.println("introduce el dado 3");
		l3= teclado.nextInt();
		
		if (l3==Math.sqrt(Math.pow(l1, 2)+Math.pow(l2, 2)) || l2==Math.sqrt(Math.pow(l1, 2)+Math.pow(l3, 2)) || (l1==Math.sqrt(Math.pow(l3, 2)+Math.pow(l2, 2)))) {
			System.out.println("triangulo rectangulo");
		}else if(l1!=l2 && l1!=l3){
			System.out.println("triangulo escaleno");
		}else if(l1==l2 && l1==l3) {
			System.out.println("triangulo equilatero");
		}else{
			System.out.println("triangulo isosceles");
		}
		
		
	}

}
