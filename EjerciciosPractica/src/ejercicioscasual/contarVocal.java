package ejercicioscasual;

public class contarVocal {

	public static int contarVocales(String frase) {
		int cont=0;
		for(int i=0;i<frase.length();i++) {
			char car=frase.charAt(i);
			if (car == 'a' || car == 'e' || car=='i' || car=='o' || car=='u') {
				cont++;
			}
		}
		return cont;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase="hola que tal estas";
		System.out.println(contarVocales(frase));
		
		
		
	}

}
