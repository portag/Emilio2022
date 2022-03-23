/**
 * 
 */
package estructuraseleccionbucle;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class ejercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int respuesta;
		int num = 36;
		int cont = 5;
		
		System.out.println("Escribe un numero: ");
		
		while(cont>0) {
			respuesta = teclado.nextInt();
		
		if (respuesta<0 || respuesta>50) {
			System.out.println("ERROR: El numero debe estar entre 0 y 50");
		}else {
			
				if(num!=respuesta){
					cont--;
					System.out.println("Numero incorrecto, su numero de intentos es de "+cont);
					if(respuesta<num) {
						System.out.println("Es mayor");
					}else{
						System.out.println("Es menor");
					}
				}else {
					System.out.println("Ha ganado");
					break;
				}
					
			}
		if(cont==0) {
			System.out.println("Ha perdido");
		}
		}
		
		
		
		
		

	}

}
