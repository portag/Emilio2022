package ArraysMatrices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fejercicio15 {

	public static void pintarMatriz(int vector[][]) {
		
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				System.out.print(vector[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[][]=new int[3][3];
		int vector1[][]=new int[3][3];
		int vector2[][]=new int[3][3];
		Scanner teclado=new Scanner(System.in);
		try {
			
			for(int i=0;i<vector.length;i++) {
				for(int j=0;j<vector[i].length;j++) {
					System.out.println("fila "+(i+1)+" columna "+(j+1));
					vector1[i][j]=teclado.nextInt();
				}
			}
			
			for(int i=0;i<vector.length;i++) {
				for(int j=0;j<vector[i].length;j++) {
					System.out.println("fila "+(i+1)+" columna "+(j+1));
					vector2[i][j]=teclado.nextInt();
				}
			}
			
			pintarMatriz(vector1);
			System.out.println();
			System.out.println();
			pintarMatriz(vector2);
			System.out.println();
			System.out.println();
			
			for(int i=0;i<vector.length;i++) {
				for(int j=0;j<vector[i].length;j++) {
					vector[i][j]=vector1[i][j]+vector2[i][j];
				}
			}
			
			pintarMatriz(vector);
			
			
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		

	}

}
