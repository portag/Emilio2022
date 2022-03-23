package Password;

public class TestPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//usando el constructor que recibe como parametro la longitud
		
		Password clave = new Password(20);
		
		System.out.println(clave);
		System.out.println(clave.esFuerte());
		
		
		
		//constructor por defecto
		
		Password clave2 = new Password();
		
		System.out.println(clave2);
		System.out.println(clave2.esFuerte());
		
		
		
	}

}
