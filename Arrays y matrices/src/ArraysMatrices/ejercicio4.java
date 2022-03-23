package ArraysMatrices;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio4 {

	public static void pintarVector(int numero[]) {
		
		for(int i=0;i<numero.length/2;i++) {
			System.out.print(numero[i]+" "+numero[(numero.length-1)-i]+" ");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[]=new int[10];
		int cont=0;
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			
			for (int i=0;i<vector.length;i++) {
				System.out.println("numero "+(i+1));
				vector[i]=teclado.nextInt();
			}
	
			pintarVector(vector);
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		

	}

}
