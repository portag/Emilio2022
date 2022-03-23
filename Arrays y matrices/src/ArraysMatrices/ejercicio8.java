package ArraysMatrices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio8 {

	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	public static void moverVector(int numero[]) {
		int aux=numero[4];
		for (int j=numero.length-2;j>=0;j--) {
			numero[j+1]=numero[j];
		}
		numero[0]=aux;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		int vector[]=new int[5];
		
		try {
			
			for(int i=0;i<vector.length;i++) {
				System.out.println("posicion "+(i+1));
				vector[i]=teclado.nextInt();
				
			}
			
			pintarVector(vector);
			System.out.println();
			moverVector(vector);

			pintarVector(vector);
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		

	}

}
