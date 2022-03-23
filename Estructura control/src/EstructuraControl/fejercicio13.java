package EstructuraControl;
import java.util.Scanner;
public class fejercicio13 {

	
	
	//piramide para n numeros
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		int num;
		String fila="*";
		num=teclado.nextInt();
		
		for (int i=0;i<num;i++) {
			System.out.print(fila);
			fila=fila.concat("*");
			System.out.println();
		}
		
		
	}

}
