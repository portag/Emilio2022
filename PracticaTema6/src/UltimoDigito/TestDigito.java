package UltimoDigito;

import java.util.Scanner;

public class TestDigito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = Integer.parseInt(teclado.nextLine());
		System.out.println(UltimoDigito.ultimoDigito(num));
		
	}

}
