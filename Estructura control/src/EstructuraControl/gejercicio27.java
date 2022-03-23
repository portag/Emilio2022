package EstructuraControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class gejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Decir si un numero entre 1 y 9999 es capicua
			Scanner teclado=new Scanner(System.in);
		try {
			
			int num;
			System.out.println("escribe un numero");
			num=teclado.nextInt();
			
			if(num<1 || num>9999) {
				System.out.println("el numero ha de estar entre 1 y 9999");
			}else {
				if(num>=1 && num<10) {
					System.out.println("Si tiene un solo digito no se puede decir si es capicua");
				}else if(num>=10 && num<=99) {
					
					int decenas = (int) Math.floor(num/10);
					num=num-(decenas*10);
					if(decenas==num) {
						System.out.println("capicua");
					}else {
						System.out.println("no es capicua");
					}
				}else if(num>=100 && num<=999) {
					int centenas=(int)Math.floor(num/100);
					num=num-(centenas*100);
					int decenas = (int) Math.floor(num/10);
					num=num-(decenas*10);
					if(centenas==num) {
						System.out.println("capicua");
					}else {
						System.out.println("no es capicua");
					}
				}else if(num>=1000 && num<=9999) {
					int millar = (int)Math.floor(num/1000);
					num=num-(millar*1000);
					int centenas=(int)Math.floor(num/100);
					num=num-(centenas*100);
					int decenas = (int) Math.floor(num/10);
					num=num-(decenas*10);
					if(millar==num && centenas==decenas) {
						System.out.println("capicua");
					}else {
						System.out.println("no es capicua");
					}
				}
			}
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		

	}

}
