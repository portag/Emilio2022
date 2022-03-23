package EstructuraControl;
import java.util.Scanner;
public class ejercicio2 {

	
	
	//indicar si el numero es multiplo de 2,3,5 o 7
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		int num;
		
		System.out.println("escribe un numero");
		
		num= teclado.nextInt();
		
		if(num%2==0) {
			System.out.println("multiplo de 2");
		}
		if(num%3==0) {
			System.out.println("multiplo de 3");
		}
		if(num%5==0) {
			System.out.println("multiplo de 5");
		}
		if(num%7==0) {
			System.out.println("multiplo de 7");
		}
	
		
		

	}

}
