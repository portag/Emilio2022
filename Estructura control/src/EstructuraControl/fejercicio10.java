package EstructuraControl;
import java.util.Scanner;
public class fejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tabla de multiplicar de un numero introducido
		Scanner teclado=new Scanner(System.in);
		int num;
		
		num=teclado.nextInt();
		
		if (num<1 || num>10) {
			System.out.println("El numero ha de estar entre 1 y 10");
		}else {
			for(int i=0;i<=10;i++) {
				System.out.println(num+" x "+i+" = "+(num*i));
			}
		
		}
		
		
	}

}
