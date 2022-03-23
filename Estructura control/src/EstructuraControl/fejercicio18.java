package EstructuraControl;
import java.util.Scanner;
public class fejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//escribir numeros hasta que se introduzca 0(este no cuenta),dar mayor y menor
		Scanner teclado= new Scanner(System.in);
		
		int num,mayor,menor;
		System.out.println("escribe un numero");
		num=teclado.nextInt();
		mayor=num;
		menor=num;
		
		
		while (num!=0) {
			
			System.out.println("escribe un numero");
			num=teclado.nextInt();
			if (num>mayor) {
				mayor=num;
			}
			
			if (num<menor) {
				if(num!=0) {
					menor=num;
				}else if(num==0){
					break;
				}
				
			}
			
		}
		System.out.println("el mayor es "+mayor);
		System.out.println("el menor es "+menor);
		
	}

}
