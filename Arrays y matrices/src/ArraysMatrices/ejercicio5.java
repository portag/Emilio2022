package ArraysMatrices;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio5 {

	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vectorA[]=new int[5];
		int vectorB[]=new int[5];
		int vectorC[]=new int[vectorA.length+vectorB.length];
		
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			for (int i=0;i<vectorA.length;i++) {
				System.out.println("numero "+(i+1));
				vectorA[i]=teclado.nextInt();
			}
			System.out.println("");
			System.out.println("");
			for (int i=0;i<vectorB.length;i++) {
				System.out.println("numero "+(i+1));
				vectorB[i]=teclado.nextInt();
			}
			int cont=0;
			for (int i=0;i<(vectorC.length/2);i++) {
					vectorC[i+cont]=vectorA[i];
					vectorC[i+1+cont]=vectorB[i];
					cont++;
			}
			
			pintarVector(vectorC);
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
	}

}
