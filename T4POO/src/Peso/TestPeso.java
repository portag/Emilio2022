package Peso;

import java.util.Scanner;

public class TestPeso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("introduzca un peso");
		int peso=teclado.nextInt();
		
		System.out.println("medida en la que esta el peso");
		String medida=teclado.next();
		
		Peso p = new Peso(peso,medida);
		
		System.out.println("Peso en Kilogramos = " + p.getPesoKilos());
		System.out.println("Peso en Lingotes = " + p.getPeso("Li"));
		System.out.println("Peso en Gramos = " + p.getPeso("G"));
		System.out.println("Peso en Onzas = " + p.getPeso("Oz"));
		System.out.println("Peso en Peniques = " + p.getPeso("P"));
		
		
	}

}
