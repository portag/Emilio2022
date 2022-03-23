package EstructuraControl;
import java.util.Scanner;
public class gejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//dar un numero y decir todos sus divisores
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		num=teclado.nextInt();
		if (num>0) {
			System.out.println("los divisores de "+num+" son:");
		
			for (int i=1;i<=num;i++) {
				if(num%i==0) {
					System.out.print(i+"  ");
				}
			}
		}else if (num<0) {
			System.out.println("debe ser un numero positivo");
		}else {
			System.out.println("0 no tiene divisores");
		}
		
		
		
		
	}

}
