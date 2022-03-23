package String;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String cad="hola que tal que estas que muy que bien que me que alegro";
		System.out.println("cadena a buscar");
		
		String str=teclado.next();
		int cont=0;
		
		int posicion=0;
		
		while(posicion>=0) {
			posicion=cad.indexOf(str,posicion);
			if(posicion>=0) {
				cont++;
				posicion++;
			}
		}
		System.out.println(cont);
	}

}
