package Ampliacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio32 {

	public static boolean fechaCorrecta(int dia,int mes,int anio) {
		boolean verificado=true;
		
		if(anio<1 || (mes<1 || mes>12) || (dia<1 || dia>31) || (mes==2 && dia>28)
			|| ((mes==4 || mes==6 || mes==9 || mes==11) && dia>30)	) {
			verificado=false;
		}
		if (((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) && (mes==2) && (dia==29) ) {
			verificado=true;
		}
		
		return verificado;
	}
	
	public static void esBisiesto(int anio) {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			System.out.println("es bisiesto");
		}else {
			System.out.println("no es bisiesto");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		try {
			
			int dia,mes,anio;
			System.out.println("escribe una fecha");
			System.out.println("dia");
			dia=teclado.nextInt();
			System.out.println("mes");
			mes=teclado.nextInt();
			System.out.println("año");
			anio=teclado.nextInt();
			
			if(fechaCorrecta(dia,mes,anio)==true) {
				System.out.println("fecha valida");
			}else {
				System.out.println("fecha no valida");
			}
			
			esBisiesto(anio);
			
			
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
		
	}

}
