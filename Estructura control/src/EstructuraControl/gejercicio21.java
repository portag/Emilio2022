package EstructuraControl;
import java.util.Scanner;
public class gejercicio21 {

	
	//crear funcion para determinar si un numero es primo o no
	public static boolean esPrimo(int num) {
		boolean primo=false;
		int cont =0;
		for (int i=1;i<=num;i++) {
			if (num%i==0) {
				cont++;
			}
		}
		if (cont==2) {
			//en caso de que tenga 2 divisores, es que es primo
			// ya que solo se dividiria entre 1 y el mismo numero
			//retornamos la variable booleana a true
			primo=true;
		}
		
		return primo;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.println("escribe un numero");
		num = teclado.nextInt();
		
		System.out.println(esPrimo(num));
		
	}

}
