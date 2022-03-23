package ArraysMatrices;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {

	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	public static int mayor(int numero[]) {
		int mayor=numero[0];
		for (int i=0;i<numero.length-1;i++) {
			if(numero[i]<numero[i+1]) {
				mayor=numero[i+1];
			}
		}
		return mayor;
	}
	
	public static int menor(int numero[]) {
		int menor=numero[0];
		for (int i=0;i<numero.length-1;i++) {
			if(numero[i]>numero[i+1]) {
				menor=numero[i+1];
			}
		}
		return menor;
	}
	
	public static double media(int numero[]) {
		double media=0;
		int acum=0;
		for (int i=0;i<numero.length;i++) {
			acum=acum+numero[i];
		}
		media=(double)acum/numero.length;
		return media;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[]=new int[10];
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			for (int i=0;i<vector.length;i++) {
				System.out.println("numero "+(i+1));
				vector[i]=teclado.nextInt();
			}
		
			pintarVector(vector);
			System.out.println("");
			System.out.println(mayor(vector));
			System.out.println(menor(vector));
			System.out.println(media(vector));
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		
		

	}

}
