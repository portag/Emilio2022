package EstructuraControl;

import java.util.Scanner;

public class ejercicio5 {

	//decir si el numero introducido esta entre 1 y 10
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int num;
		
		num=teclado.nextInt();
		
		while(num != 1 && num !=2 && num !=3 && num !=4 && num !=5 && num != 6 && num !=7 && num !=8 && num !=9 && num != 10) {
			System.out.println("El numero no esta entre 1 y 10");
			num=teclado.nextInt();
		}
		System.out.println("Numero entre 1 y 10, finalizando programa");
	}

}
