package EstructuraControl;
import java.util.Scanner;
public class ejercicio4 {

	
	//dada una cantidad determinar cuantos billetes de cada corresponden
	public static void importe(int num) {
		int b500,b200,b100,b50,b20,b10,b5,moneda;
		b500=Math.floorDiv(num, 500);
		num=num-(b500*500);
		b200=Math.floorDiv(num, 200);
		num=num-(b200*200);
		b100=Math.floorDiv(num, 100);
		num=num-(b100*100);
		b50=Math.floorDiv(num, 50);
		num=num-(b50*50);
		b20=Math.floorDiv(num, 20);
		num=num-(b20*20);
		b10=Math.floorDiv(num, 10);
		num=num-(b10*10);
		b5=Math.floorDiv(num, 5);
		num=num-(b5*5);
		moneda=num;
		System.out.print("su cambio es de "+b500+" billetes de 500 ");
		System.out.print(", "+b200+" billetes de 200 ");
		System.out.print(", "+b100+" billetes de 100 ");
		System.out.print(", "+b50+" billetes de 50 ");
		System.out.print(", "+b20+" billetes de 20 ");
		System.out.print(", "+b10+" billetes de 10 ");
		System.out.print(", "+b5+" billetes de 5 ");
		System.out.print("y "+moneda+" monedas ");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		int num;
		
		System.out.println("escriba el importe");
		
		num=teclado.nextInt();
		
		importe(num);
		
		
		
	}

}
