package ArraysMatrices;
import java.util.Scanner;
public class ejercicio7 {

	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int vector[]=new int[10];
		int num=0;
		for(int i=0;i<8;i++) {
			System.out.println("posicion "+(i+1));
			num=teclado.nextInt();
			vector[i]=num;
		}
		
		for(int i=0;i<=1;i++) {
			//POSICION
			System.out.println("");
			System.out.println("");
			System.out.println("introduce una posicion entre 0 y 7");
			int posicion=0;
			do {
				
				try {
					posicion=teclado.nextInt();
					
				}catch(Exception e) {
					System.out.println("ERROR");
				}
				
			}while(posicion<0 || posicion>7);
			
			
			//MOVER ELEMENTOS A LA DERECHA
			for (int j=8;j>=posicion;j--) {
				vector[j+1]=vector[j];
			}
			
			
			
			//INSERTAR EN LA POSICION SELECCIONADA
			try {
				int nume=0;
				System.out.println("numero a cambiar");
				nume=teclado.nextInt();
				vector[posicion]=nume;
			}catch(Exception e) {
				System.out.println("ERROR");
			}
		}
		
		
		
		
		pintarVector(vector);
		
	}
}
