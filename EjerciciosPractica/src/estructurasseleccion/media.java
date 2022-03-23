/**
 * 
 */
package estructurasseleccion;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class media {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float n1;
		float n2;
		float n3;
		float media;
		String evaluar;
		evaluar="";
		System.out.println("Introduce tus 3 ultimas notas");
		System.out.println("nota 1");
		n1 = teclado.nextInt();
		System.out.println("nota 2");
		n2 = teclado.nextInt();
		System.out.println("nota 3");
		n3 = teclado.nextInt();
		
		media = (n1+n2+n3)/(3);
		
		
		
		if(media>=0 && media <=4) {
			evaluar = "insuficiente";
		}
		
		if(media>=5 && media <6) {
			evaluar = "suficiente";
		}

		if(media>=6 && media <7) {
			evaluar = "bien";
		}
		
		if(media>=7 && media <=8) {
			evaluar = "notable";
		}
		
		if(media>=9 && media <=10) {
			evaluar = "sobresaliente";
		}
		
		
		System.out.println("la media de tus 3 notas es "+media+", tu evaluación es "+evaluar);
	}

}
