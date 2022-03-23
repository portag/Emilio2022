package Direccion;

public class TestDireccion {

	
	public static void main(String[] args) {
		
		
		Direccion d1 = new Direccion("Avda",2,"Zurgena","Almeria","1234","España",37.34,-2.02);
		Direccion d2 = new Direccion("Avda",2,"Barcelona","Barcelona","4321","España",41.38,2.16);
		Direccion d3 = new Direccion(d1);
		
		//d1 y d3 tienen la misma longitud;
		System.out.println(d1.equals(d3));
		System.out.println(d1.equals(d2));
		System.out.println();
		System.out.println();
		
		
		//distancia
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.distanciaKMS(d2));
		
		
	}
	
}
