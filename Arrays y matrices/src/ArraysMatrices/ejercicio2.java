package ArraysMatrices;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio2 {

	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[]=new int[10];
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			int acum=0;
			for (int i=0;i<vector.length;i++) {
				System.out.println("numero "+(i+1));
				vector[i]=teclado.nextInt();
				acum+=vector[i];
			}
		
			int menor=vector[0];
			int mayor=vector[0];
			double media=0;
		
			for (int i=0;i<vector.length-1;i++) {
				if(vector[i]>vector[i+1]) {
					menor=vector[i+1];
				}
				if(vector[i]<vector[i+1]) {
					mayor=vector[i+1];
				}
			
			}
			media=(double)acum/vector.length;
		
			pintarVector(vector);
			System.out.println("la media es "+media);
			System.out.println("el mayor es "+mayor);
			System.out.println("el menor es "+menor);
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		
		
	}

}
