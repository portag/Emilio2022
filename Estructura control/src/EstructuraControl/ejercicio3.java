package EstructuraControl;
import java.util.Scanner;
public class ejercicio3 {

	
	//dar un numero int y devolver su correspondiente cadena
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		int num;
		
		System.out.println("escribe un numero");
		
		num=teclado.nextInt();
		
		switch (num){
		case 0:
			System.out.println("cero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		case 6:
			System.out.println("seis");
			break;
		case 7:
			System.out.println("siete");
			break;
		case 8:
			System.out.println("ocho");
			break;
		case 9:
			System.out.println("nueve");
			break;
		default:
				System.out.println("ERROR: el numero no es de un digito");
		}
		
		
	}

}
