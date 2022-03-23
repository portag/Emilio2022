package EstructuraControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class zejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int op=0;
		
		
		
		try {
			
			while(op!=4) {
				System.out.println("MENU EN JAVA");
				System.out.println("1-OPCION 1");
				System.out.println("2-OPCION 2");
				System.out.println("3-OPCION 3");
				System.out.println("4-SALIR");
				
				op=teclado.nextInt();
				switch(op) {
				case 1:
					System.out.println("opcion 1");
					break;
				case 2:
					System.out.println("opcion 2");
					break;
				case 3:
					System.out.println("opcion 3");
					break;
				case 4:
					System.out.println("ha salido");
					break;
				default:
					System.out.println("su dato no esta entre las opciones");
				}
			}
			
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		
	}

}
