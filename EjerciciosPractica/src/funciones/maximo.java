/**
 * 
 */
package funciones;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class maximo {

	/**
	 * @param args
	 */
	
	public static int maximo(int num1,int num2) {
		int resultado;
		if(num1>num2) {
			resultado=num1;
		}else {
			resultado=num2;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("escribe un numero");
		int n1=teclado.nextInt();
		System.out.println("escribe otro numero");
		int n2=teclado.nextInt();
		
		System.out.print("el numero "+maximo(n1,n2)+ " es mayor");

	}

}
