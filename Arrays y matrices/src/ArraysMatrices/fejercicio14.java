package ArraysMatrices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fejercicio14 {

	
	public static void pintarMatriz(int vector[][]) {
		
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				System.out.print(vector[i][j]+" ");
			}
			System.out.println();
		}
		
	}


	public static double mediaMatriz(int vector[][]) {
		double media=0;
		int suma=0;
		int cont=0;
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				suma=suma+vector[i][j];
				cont++;
			}
			
		}
		media=(double)suma/cont;
		
		return media;
	}
	
	public static int mayorMatriz(int vector[][]) {
		int mayor=vector[0][0];
		for(int i=0;i<vector.length;i++) {
			for(int j=-1;j<vector[i].length-1;j++) {
				if(mayor<vector[i][j+1]) {
					mayor=vector[i][j+1];
				}
			}
			
		}
		return mayor;
	}
	
	public static int menorMatriz(int vector[][]) {
		int menor=vector[0][0];
		for(int i=0;i<vector.length;i++) {
			for(int j=-1;j<vector[i].length-1;j++) {
				if(menor>vector[i][j+1]) {
					menor=vector[i][j+1];
				}
			}
		}
		return menor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado=new Scanner(System.in);
		int vector[][]=new int[5][3];
		
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
			System.out.println(mediaMatriz(vector));	
			System.out.println(mayorMatriz(vector));
			System.out.println(menorMatriz(vector));
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		
	}

}
