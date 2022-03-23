package String;
import java.util.Scanner;
public class ejercicio1 {

	public static String invertida(String cadena) {
		String inver="";
		for(int i=cadena.length()-1;i>=0;i--) {
			inver+=(cadena.charAt(i));
		}
		return inver;
	}
	
	public static StringBuilder invertidaBuilder(String cadena) {
	
		StringBuilder sb=new StringBuilder("");
		sb.append(cadena);
		sb.reverse();
		return sb;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String cad=teclado.next();
		
		System.out.println(cad);
		System.out.println();
		System.out.println(invertida(cad));
		System.out.println();
		System.out.println(invertidaBuilder(cad));
		
	}

}
