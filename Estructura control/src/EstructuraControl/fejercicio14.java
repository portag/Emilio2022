package EstructuraControl;
import java.util.Scanner;
public class fejercicio14 {

	
	
	//piramide para n numeros 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		int num,cont=1;
		String fila="*";
		num=teclado.nextInt();
		
		for (int i=0;i<num;i++) {
			for(int j=0;j<num-cont;j++) {
				System.out.print(" ");
			}
			cont++;
			System.out.print(fila);
			fila=fila.concat("*");
			System.out.println(" ");
		}
		
		
	}

}
