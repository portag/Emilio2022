package Persona;

import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Nombre: ");
		String nombre = teclado.next();
		System.out.println();
		
		System.out.print("Sexo: ");
		char sexo = teclado.next().charAt(0);
		System.out.println();
		
		System.out.print("Edad: ");
		int edad = teclado.nextInt();
		System.out.println();
		
		System.out.print("Peso: ");
		int peso = teclado.nextInt();
		System.out.println();
		
		System.out.print("Altura: ");
		double altura = teclado.nextDouble();
		System.out.println();
		
		Persona p1 = new Persona(nombre,sexo,edad,peso,altura);
		
		System.out.println(p1);
		System.out.println(p1.calcularIMC());
		System.out.println(p1.mayorEdad());
		
		
	}

}
