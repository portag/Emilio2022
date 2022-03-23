package String;

public class ejercicio2 {

	public static StringBuilder invertir(String cadena) {
		StringBuilder sb=new StringBuilder(cadena.substring(0, cadena.length()-1));
		StringBuilder sb2=new StringBuilder("");
		sb2.append(cadena);
		sb2.append(sb.reverse());
		return sb2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad="hola";
		
		
		
		System.out.println(invertir(cad));
		
		
		
	}

}
