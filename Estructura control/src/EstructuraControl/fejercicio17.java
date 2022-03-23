package EstructuraControl;
import java.util.Scanner;
public class fejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//escribir pares dado un intervalo y escribir el numero de pares
		Scanner teclado=new Scanner(System.in);
		
		int n1,n2;
		int cont=0;
		System.out.println("numero 1");
		n1=teclado.nextInt();
		System.out.println("numero 2");
		n2=teclado.nextInt();
		
			
			for (int i=n1;i<=n2;i++) {
				if(i%2==0) {
					System.out.print(i+" ");
					cont++;
				}
			}
			System.out.println("");
			System.out.println("");
			System.out.println(cont);	
	}

}
