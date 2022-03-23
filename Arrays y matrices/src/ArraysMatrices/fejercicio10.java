package ArraysMatrices;
import java.util.InputMismatchException;
import java.util.Scanner;
public class fejercicio10 {

	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	public static void eliminarPosicion(int numero[],int posicion) {
			for (int i=0;i<numero.length;i++) {
				if(i==posicion) {
					numero[i]=0;
				}
			}
	}
	
	public static void moverVector(int numero[]) {
		for(int i=0;i<numero.length;i++) {
			if(numero[i]==0) {
				for(int j=i;j<numero.length-1;j++) {
					numero[j]=numero[j+1];
				}
			}
		}
		numero[9]=0;
	}
	
	public static void main(String[] args) {
		
		
		Scanner teclado=new Scanner(System.in);
		int vector[]=new int[10];
	
		try {
			
			for(int i=0;i<vector.length;i++) {
				System.out.println("posicion "+(i+1));
				vector[i]=teclado.nextInt();
				
			}
			
			pintarVector(vector);
			System.out.println();
			System.out.println();
			System.out.println("posicion a eliminar");
			int posicion=teclado.nextInt();
			if(posicion>=0 && posicion<=9) {
				eliminarPosicion(vector, posicion);
				moverVector(vector);
				pintarVector(vector);
			}else {
				System.out.println("no es un indice correcto");
			}
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		
		
		
	}
	
}
