package EstructuraControl;

import java.util.Scanner;

public class ejercicio6 {

	
	//mostrar lista de numeros impares desde el 2 hasta el numero introducido
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		num=teclado.nextInt();
		
		
		if (num<=2){
			System.out.println("el numero debe ser mayor");
		}else {
			for(int i=2;i<=num;i++) {
				if (i%2!=0) {
					System.out.print(i+" ");
				}
			}
		}
			
		

	}

}
