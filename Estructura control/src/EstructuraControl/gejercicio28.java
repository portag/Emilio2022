package EstructuraControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class gejercicio28 {

	//pedir fecha y mostrar fecha del dia siguiente
	
	public static boolean fechaCorrecta(int dia,int mes,int anio) {
		boolean verificado=true;
		
		if(anio<1 || (mes<1 || mes>12) || (dia<1 || dia>31) || (mes==2 && dia>28)
			|| ((mes==4 || mes==6 || mes==9 || mes==11) && dia>30)	) {
			verificado=false;
		}
		
		return verificado;
	}
	
	public static void diaSiguiente(int dia,int mes,int anio) {
		if(fechaCorrecta(dia,mes,anio)==true) {
			System.out.println("fecha correcta");
			System.out.println(dia+"/"+mes+"/"+anio);
			switch(mes) {
			case 1:
				if (dia==31) {
					dia=1;
					mes=2;
				}else {
					dia=dia+1;
				}
				break;
			case 2:
				if (dia==28) {
					dia=1;
					mes=3;
				}else {
					dia=dia+1;
				}
				break;
			case 3:
				if (dia==31) {
					dia=1;
					mes=4;
				}else {
					dia=dia+1;
				}
				break;
			case 4:
				if (dia==30) {
					dia=1;
					mes=5;
				}else {
					dia=dia+1;
				}
				break;
			case 5:
				if (dia==31) {
					dia=1;
					mes=6;
				}else {
					dia=dia+1;
				}
				break;
			case 6:
				if (dia==30) {
					dia=1;
					mes=7;
				}else {
					dia=dia+1;
				}
				break;
			case 7:
				if (dia==31) {
					dia=1;
					mes=8;
				}else {
					dia=dia+1;
				}
				break;
			case 8:
				if (dia==31) {
					dia=1;
					mes=9;
				}else {
					dia=dia+1;
				}
				break;
			case 9:
				if (dia==30) {
					dia=1;
					mes=10;
				}else {
					dia=dia+1;
				}
				break;
			case 10:
				if (dia==31) {
					dia=1;
					mes=11;
				}else {
					dia=dia+1;
				}
				break;
			case 11:
				if (dia==30) {
					dia=1;
					mes=12;
				}else {
					dia=dia+1;
				}
				break;
			case 12:
				if (dia==31) {
					dia=1;
					mes=1;
					anio=anio+1;
				}else {
					dia=dia+1;
				}
				break;
			}
			
			System.out.println("al dia siguiente estaremos a:");
			System.out.println(dia+"/"+mes+"/"+anio);
		}else {
			System.out.println("fecha incorrecta");
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
			
			diaSiguiente(dia,mes,anio);
			
			
			
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		

	}

}
