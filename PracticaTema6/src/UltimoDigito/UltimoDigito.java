package UltimoDigito;

public class UltimoDigito {

	
	public static char ultimoDigito(int num) {
	
		String cad = String.valueOf(num);

		return cad.charAt(cad.length()-1);

	}
	

	
}
