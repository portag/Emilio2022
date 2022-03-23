/**
 * 
 */
package estructurasseleccion;
import java.util.Scanner;
/**
 * @author emili
 *
 */
public class horoscopo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int dia;
		String mes;
		
		System.out.println("INTRODUCE TU MES DE NACIMIENTO");
		mes = teclado.next();
		
		System.out.println("INTRODUCE TU DIA DE NACIMIENTO");
		dia= teclado.nextInt();
		
		switch (mes) {
		case "enero":
			if (dia>=19 && dia <=31) {
				System.out.println("acuario");
			}else if (dia<=18 && dia >=0) {
				System.out.println("capricornio");
			}else {
				System.out.println("ERROR");
			}
			break;
			
		case "febrero":
			if (dia>0 && dia <19) {
				System.out.println("acuario");
			}else if (dia>18 && dia <29) {
				System.out.println("piscis");
			}else {
				System.out.println("ERROR");
			}
			break;
		
		case "marzo":
			if (dia>=1 && dia <=20) {
				System.out.println("piscis");
			}else if (dia>=21 && dia <=31) {
				System.out.println("aries");
			}else {
				System.out.println("ERROR");
			}
			break;
			
		case "abril":
			if (dia>=1 && dia <=19) {
				System.out.println("aries");
			}else if (dia>=20 && dia <=30) {
				System.out.println("tauro");
			}else {
				System.out.println("ERROR");
			}
			break;
			
		case "mayo":
			if (dia>=1 && dia <=20) {
				System.out.println("tauro");
			}else if (dia>=10 && dia <=31) {
				System.out.println("geminis");
			}else {
				System.out.println("ERROR");
			}
			break;
			
		case "junio":
			if (dia>=1 && dia <=21) {
				System.out.println("geminis");
			}else if (dia>=22 && dia <=30) {
				System.out.println("cancer");
			}else {
				System.out.println("ERROR");
			}
			break;
			
		case "julio":
			if (dia>=1 && dia <=22) {
				System.out.println("cancer");
			}else if (dia>=23 && dia <=31) {
				System.out.println("leo");
			}else {
				System.out.println("ERROR");
			}
			break;
			
		case "agosto":
			if (dia>=1 && dia <=22) {
				System.out.println("leo");
			}else if (dia>=23 && dia <=31) {
				System.out.println("virgo");
			}else {
				System.out.println("ERROR");
			}
			break;
			
		case "septiembre":
			if (dia>=1 && dia <=22) {
				System.out.println("virgo");
			}else if (dia>=23 && dia <=30) {
				System.out.println("libra");
			}else {
				System.out.println("ERROR");
			}
			break;
		
		case "octubre":
			if (dia>=1 && dia <=22) {
				System.out.println("libra");
			}else if (dia>=23 && dia <=31) {
				System.out.println("escorpio");
			}else {
				System.out.println("ERROR");
			}
			break;
			
		case "noviembre":
			if (dia>=1 && dia <=21) {
				System.out.println("escorpio");
			}else if (dia>=22 && dia <=30) {
				System.out.println("sagitario");
			}else {
				System.out.println("ERROR");
			}
			break;
			
		case "diciembre":
			if (dia>=1 && dia <=21) {
				System.out.println("sagitario");
			}else if (dia>=22 && dia <=31) {
				System.out.println("capricornio");
			}else {
				System.out.println("ERROR");
			}
			break;
		
		default:
			System.out.println("ERROR: mes incorrecto");
		
		}
		
		
		
		
		
		
		
	}

}
