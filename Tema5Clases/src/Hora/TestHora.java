package Hora;

public class TestHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hora hora = new Hora(20,40,54,234);
		Hora hora2 = new Hora("24:59:59");
		Hora hora3 = new Hora();
		Hora hora4 = new Hora(0,0,0,0);
		
		//ccomprobar hora, segundo siguiente y constructor
		System.out.println(hora);
		hora.segundoSiguiente();
		System.out.println(hora.horaCompleta());
		System.out.println();
		
		
		//comprobar hora valida
		System.out.println(hora2);
		System.out.println();
		
		
		//equals
		System.out.println(hora.equals(hora4));
		System.out.println(hora4.equals(hora3));
		
		//a pesar de que es el mismo objeto, la hora no es valida, devolvemos false
		System.out.println(hora2.equals(hora2));
		
		
		//24h - PM/AM
		/**
		 * 
		 * Si queremos diferenciar entre un formato 24h y AM/PM debemos crear un atributo formato
		 * y mediante un Scanner pedir en que formato se muestra la hora, con un switch llamamos a los
		 * metodos de este ejercicio en caso de que se introduzca 24h, en caso de PM/AM realizaremos sus 
		 * correspondientes metodos
		 * 
		 */
	}

}
