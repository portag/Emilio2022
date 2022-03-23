package String;

public class ejercicio6 {

	public static boolean palindromo(String cadena) {
		
		StringBuilder sb=new StringBuilder();
		
		boolean esPalindromo=false;
		sb.append(cadena);
		sb.reverse();
		
		
		if(sb.toString().equals(cadena)) {
			esPalindromo=true;
		}
		
		return esPalindromo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cad="reconocer";
		
		System.out.println(palindromo(cad));
		
		if(palindromo(cad)) {
			System.out.println("es palindromo");
		}else {
			System.out.println("no es palindromo");
		}
		

	}

}
