package ArraysMatrices;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio6 {

	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	public static boolean ordenadoAscendente(int numero[]) {
		boolean orden=false;
		int cont=0;
		for(int i=0;i<numero.length-1;i++) {
			if(numero[i]<numero[i+1]) {
				cont++;
			}
		}
		if(cont==4) {
			orden=true;
		}
		return orden;
	}
	
	public static boolean ordenadoDescendente(int numero[]) {
		boolean orden=false;
		int cont=0;
		for(int i=0;i<numero.length-1;i++) {
			if(numero[i]>numero[i+1]) {
				cont++;
			}
		}
		if(cont==4) {
			orden=true;
		}
		return orden;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[]=new int[5];
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			for (int i=0;i<vector.length;i++) {
				System.out.println("numero "+(i+1));
				vector[i]=teclado.nextInt();
			}
			
			pintarVector(vector);
			System.out.println();
			System.out.println(); 
			if(ordenadoAscendente(vector)) {
				System.out.println("Ordenado de manera ascendente");
			}
			if(ordenadoDescendente(vector)){
				System.out.println("Ordenado de manera descendente");
			}
			if(!((ordenadoDescendente(vector))) && !((ordenadoAscendente(vector)))){
				System.out.println("Desordenado");
			}
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		
	}

}
