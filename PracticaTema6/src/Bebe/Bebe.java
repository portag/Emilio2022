package Bebe;

public class Bebe {

	//IMPRIME LA CADENA RESULTADO
	static void pedir() { 
		System.out.println(str1 + " , " + str2 + " , " + str3); 
	} 
	
	static {
		//DA VALORES A LAS CADENAS 2 Y 3, SON ESTATICOS, POR LO QUE SU VALOR SE APLICA A TODOS LOS OBJETOS
		str2 = "mama tengo hambre";
		str3 = "mama quiero agua"; 
	} 
	
	//EL CONSTRUCTOR POR DEFECTO IMPRIMIRA ESE STRING
	Bebe() {
		System.out.println("Nacimiento del bebe");
	} 
	
	//DA SOLO VALOR A STR1, PUESTO QUE SOLO SE USA UN = CON ESA VARIABLE, LO QUE HACE ES DEFINIR LAS VARIABLES COMO STRING
	static String str2, str3, str1="papa quiero jugar";
	
	
	public static void main(String[] args) {
		System.out.println("El bebe se ha despertado y va a pedir cosas"); 
		//IMPRIME LA CADENA DEL PRINT JUNTO A LA CADENA 1
		System.out.println("El bebe dice: "+Bebe.str1); 
		//IMPRIME LAS 3 CADENAS
		Bebe.pedir(); 
	}
	
}
