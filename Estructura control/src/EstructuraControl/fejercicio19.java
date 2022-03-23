package EstructuraControl;
import java.util.Scanner;
public class fejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dar numeros y escribir media, para terminar escribir -1
		
		Scanner teclado=new Scanner(System.in);
		
		int num,cont,acu;
		double media;
		
		acu=0;
		cont=0;
		num=0;
		
		while (num!=-1) {
			
			System.out.println("Escribe numeros");
			
			num=teclado.nextInt();
			
			if (num==-1) {
				break;
			}else {
				acu=acu+num;
			
				cont++;
			}
			
		}
		
		if (cont>0) {
			media=acu/cont;	
		}else {
			media=0;
		}
		
		
		System.out.println("la media es "+media);
		
		
		
	}

}
