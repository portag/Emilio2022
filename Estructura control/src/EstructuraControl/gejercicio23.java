package EstructuraControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class gejercicio23 {

	//escribir el mayor divisor de un numero
	
	public static int mayorDiv(int num) {
		int max=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				max=i;
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		try {
			System.out.println("escriba un numero entero");
			num= teclado.nextInt();
		
			System.out.println("el mayor divisor de "+num+" es "+mayorDiv(num));
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		
	}
	
}
