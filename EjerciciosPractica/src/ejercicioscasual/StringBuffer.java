package ejercicioscasual;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringBuffer y StringBuilder, usar sobretodo builder
		
		StringBuilder cad=new StringBuilder();
		
		cad.append("david");
		String cadena= cad.toString();
		System.out.println(cad.toString());
		System.out.println(cadena);
		System.out.println(cadena.charAt(3));
		
	}

}
