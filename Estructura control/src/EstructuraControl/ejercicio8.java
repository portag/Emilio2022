package EstructuraControl;
import java.util.Scanner;
public class ejercicio8 {

	
	
	//dar tabla de dobles y triples de 1 hasta el numero introducido
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num;
		
		num=teclado.nextInt();
		
		for (int i=1;i<=num;i++) {
			System.out.println(i+" - "+(i*2)+ " - "+(i*3));
		}
	}

}
