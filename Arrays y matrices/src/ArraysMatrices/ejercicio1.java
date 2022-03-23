package ArraysMatrices;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio1 {

	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	public static void pintarInverso(int numero[]) {
		for (int i=numero.length-1;i>=0;i--) {
			System.out.print(numero[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int vector[]=new int[10];
		
		try {
			for (int i=0;i<vector.length;i++) {
			System.out.println("numero "+(i+1));
			vector[i]=teclado.nextInt();
			}
		
			pintarVector(vector);
			System.out.println();
			pintarInverso(vector);
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		

	}

}
