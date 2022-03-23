package EstructuraControl;
import java.util.Scanner;
public class ejercicio9 {

	
	
	
	//calcular el factorial de un numero introducido
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int num,factorial=1;
		num=teclado.nextInt();
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
	}

}
