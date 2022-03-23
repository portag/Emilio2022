package EstructuraControl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class gejercicio29 {
	
	//El programa va generando numeros de entre 1 al 100 hasta acertar el que has pensado
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		try {
			int num;
			int acotar1=1;
			int acotar2=100;
			int cont=1;
			System.out.println("piensa un numero entre el 1 y 100");
			
			String respuesta="no";
			String pista="";
		
			while(!(respuesta.equals("igual"))) {
				System.out.println("¿era igual al numero que pensabas?");
				num=(int)Math.floor(Math.random()*(acotar1-(acotar2+1))+(acotar2));
				System.out.println(num);
				respuesta=teclado.next();
				if(respuesta.equals("no")) {
					cont++;
					System.out.println("dame una pista(mayor,menor)");
					pista=teclado.next();
					if(pista.equals("mayor")) {
						acotar1=acotar1+num;
					}else if (respuesta.equals("menor")) {
						acotar2=acotar2-num;
					}
				}
				
			}
			System.out.println("numero de intentos: "+cont);
			System.out.println("fin del programa");
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
	}

}
