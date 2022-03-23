package EstructuraControl;
import java.util.Scanner;
public class gejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int num,cont;
		
		cont=0;
		System.out.println("escribe un numero");
		num = teclado.nextInt();
		System.out.println("los primos hasta "+num+" son:");
		for(int i=1;i<num;i++) {
			for (int j=1;j<=i;j++) {
				if (i%j==0) {
					cont++;
				}
			}
			if (cont==2 || i==1) {
				System.out.print(i+ "  ");
			}
			cont=0;
		}
		
	}

}
