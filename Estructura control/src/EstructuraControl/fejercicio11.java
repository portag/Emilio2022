package EstructuraControl;
import java.util.Scanner;
public class fejercicio11 {

	//funcion que indique el numero de digitos de un numero
	public static int digitos(int num) {
		int cont=0;
		while(num>0) {
			num=Math.floorDiv(num, 10);
			cont++;
		}
		System.out.println(cont);
		return cont;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num;
		num=teclado.nextInt();
		
		digitos(num);
		
	}

}
