/**
 * 
 */
package funciones;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class signo {

	/**
	 * @param args
	 */
	static Scanner teclado=new Scanner(System.in);
	

	public static int signo(int num) {
		int resultado;
		
		if (num>0) {
			resultado= 1;
		}else if(num==0) {
			resultado= 0;
		}else {
			resultado= -1;
		}
		
		return resultado;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("introduce un numero");
		int num=teclado.nextInt();
		
		System.out.println(signo(num));
		
	}

}
