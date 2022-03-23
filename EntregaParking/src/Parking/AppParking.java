package Parking;

import java.util.Scanner;



public class AppParking {

	public static void main(String[] args) {
		
		Parking parking = new Parking();
		Scanner teclado = new Scanner(System.in);
		int op;
		String matricula;
		do {
			
			System.out.println("PARKING");
			System.out.println("0 - Salir del programa");
			System.out.println("1 - Registrar entrada vehículo");
			System.out.println("2 - Registrar salida vehículo");
			System.out.println("3 - Número plazas disponibles");
			System.out.println("4 - Imprimir estado del parking");
			System.out.println("5 - Saldo acumulado");	
			
			System.out.println();
			System.out.println("Selecciona una opcion");
			op = Integer.parseInt(teclado.nextLine());
			
			
			switch(op) {
			case 0:
				System.out.println("Fin del programa");
				break;
			case 1:
				System.out.println("1 - Coche");
				System.out.println("2 - Furgoneta");
				op = Integer.parseInt(teclado.nextLine());
				
				switch(op) {
				case 1:
					System.out.println("Introduce la matrícula");
					matricula = teclado.nextLine().toUpperCase();
					Coche c = new Coche(matricula,"mercedes");
					parking.registrarEntradaVehiculo(c);
					break;
				case 2:
					System.out.println("Introduce la matrícula");
					matricula = teclado.nextLine().toUpperCase();
					Furgoneta f = new Furgoneta(matricula,"mercedes");
					parking.registrarEntradaVehiculo(f);
					break;
				default:
					System.out.println("Dato incorrecto");
				}
				break;
				
			case 2:
				
				System.out.println("Dime una matrícula");
				matricula = teclado.nextLine();
				Coche c = new Coche(matricula.toUpperCase(),"mercedes");
				System.out.println(parking.registrarSalidaVehiculo(c));
				break;
				
			case 3:
				
				System.out.println("Plazas disponibles: "+parking.getPlazasDisponibles());
				break;
				
			case 4:
				parking.imprimeParking();
				break;
				
			case 5:
				System.out.println("Se ha acumulado un saldo de "+parking.getSaldoAcumulado());
			}
			
			
		}while(op != 0);
		
		
		
	
	}
}
