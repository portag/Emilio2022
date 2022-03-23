package EstructuraControl;
import java.util.Scanner;
public class fejercicio15 {

	
	//piramide para n numeros 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		
		int num,cont=1;
		String fila="*";
		String concat="";
		num=teclado.nextInt();
		
		for (int i=0;i<num;i++) {
			//parte izquierda piramide
			for(int j=0;j<num-cont;j++) {
				System.out.print(" ");
			}
			cont++;
			
			
			System.out.print(fila);
			fila=fila.concat("*");
			
			//parte derecha piramide
			System.out.print(concat);
			concat=concat.concat("*");
			
			System.out.println(" ");
		}
		
	}

}
