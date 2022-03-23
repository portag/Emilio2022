/**
 * 
 */
package estructurasseleccion;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota, correcto, respuesta, cont;
		nota=0;
		System.out.println("COMIENZA EL MINI-TEST");
		System.out.println("");
		System.out.println("PREGUNTA 1 :QUE USAMOS CUANDO ESCRIBIMOS POR TECLADO");
		System.out.println("1- SCANNER     2- ARRAY    3- STREAM");
		correcto = 1;
		System.out.print("respuesta");
		respuesta = teclado.nextInt();
		
		if(respuesta==correcto) {
			nota = nota+1;
		}
		
		System.out.println("");
		System.out.println("PREGUNTA 2 :LO USAMOS PARA ASIGNAR UNA VARIABLE COMO UN CONJUNTO DE CARACTERES");
		System.out.println("1- INT     2- STRING    3- BOOLEAN");
		correcto = 2;
		System.out.print("respuesta");
		respuesta = teclado.nextInt();
		
		if(respuesta==correcto) {
			nota = nota+1;
		}
		
		System.out.println("");
		System.out.println("PREGUNTA 3 :ESTRUCTURA EN BUCLE");
		System.out.println("1- SWITCH     2- IF    3- WHILE");
		correcto = 3;
		System.out.print("respuesta");
		respuesta = teclado.nextInt();
		
		if(respuesta==correcto) {
			nota = nota+1;
		}
		
		System.out.println(nota);
		
	}

}
