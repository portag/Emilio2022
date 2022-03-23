package ejercicioscasual;

public class separarCadena {

	
	public static void separar(String frase) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena="https://www.iesjaroso.es/noticias";
		
		System.out.println(cadena.substring(0,"https".length()));
		System.out.println(cadena.substring(8,"www.iesjaroso.es".length()));
		System.out.println(cadena.substring("noticias".length()));
		
	}

}
