package ArraysMatrices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fejercicio13 {

	
	public static void pintarMatriz(int vector[][]) {
		
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				System.out.print(vector[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void sumarFila(int vector[][]) {
		
		for(int i=0;i<vector.length;i++) {
			int suma=0;
			for(int j=0;j<vector[i].length;j++) {
				suma=suma+vector[i][j];
			}
			System.out.println("fila "+(i+1)+" = "+suma);
		}
		
	}

	 
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int vector[][]=new int[3][4];
		
		try {
			for(int i=0;i<vector.length;i++) {
				for(int j=0;j<vector[i].length;j++) {
					System.out.println("fila "+(i+1)+" columna "+(j+1));
					vector[i][j]=teclado.nextInt();
				}
			}
			pintarMatriz(vector);
			System.out.println();
			System.out.println();
			sumarFila(vector);
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		

	}

}
