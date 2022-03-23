package Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
public class AhorcadoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ahorcado a1 = new Ahorcado();
		Scanner teclado = new Scanner(System.in);
		int op=0;
		

		
		boolean resuelto=false;
		do {
			System.out.println("----------MENU----------");
			System.out.println("1-pedir letra");
			System.out.println("2-resolver(si fallas la palabra pierdes)");
			
			System.out.println();
			System.out.println("escribe una opcion");
			op=Integer.parseInt(teclado.nextLine());
			switch(op) {
			case 1:
				System.out.println("escribe una letra");
				String letra=teclado.nextLine();
				a1.intentar(letra.charAt(0));
				System.out.println("tu palabra: "+Arrays.toString(a1.getIntentado()));
				System.out.println("fallos: "+a1.getFallos());
				a1.muneco();
				if(a1.solucion()) {
					System.out.println("ganas");
					resuelto=true;
				}
				break;
			case 2:
				System.out.println("escribe una solucion");
				String sol=teclado.nextLine();
				if(a1.resolver(sol)) {
					resuelto=true;
					System.out.println("ganas");
				}else {
					System.out.println("pierdes");
					a1.muneco();
				}
				
				break;
			default:
				System.out.println("opcion incorrecta");
			}
			
			
		}while (!resuelto && a1.getFallos()<7);
		
		
	}

}
