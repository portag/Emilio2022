package EstructuraControl;
import java.util.Scanner;
public class fejercicio12 {

	
	//pasar a numeros romanos
	public static String convertirRomano(int num) {
		String romano="";
		
		if(num<0 || num>3999) {
			System.out.println("no es posible convertir a romano");
		}else {
			
			//MILLARES
			
			if(num>999 && num <2000) {
				romano=romano.concat("M");
				num=num-1000;
			}
			
			if(num>1999 && num <3000) {
				romano=romano.concat("MM");
				num=num-2000;
			}
			
			if(num>2999) {
				romano=romano.concat("MMM");
				num=num-3000;
			}
			
			
			
			//CENTENAS
			
			if(num>899) {
				romano=romano.concat("CM");
				num=num-900;
			}
			
			if(num>799 && num<900) {
				romano=romano.concat("DCCC");
				num=num-800;
			}
			
			if(num>699 && num<800) {
				romano=romano.concat("DCC");
				num=num-700;
			}
			
			if(num>599 && num<700) {
				romano=romano.concat("DC");
				num=num-600;
			}
			
			if(num>499 && num<600) {
				romano=romano.concat("D");
				num=num-500;
			}
			
			if(num>399 && num <500) {
				romano=romano.concat("CD");
				num=num-400;
			}
			
			if(num>299 && num <400) {
				romano=romano.concat("CCC");
				num=num-300;
			}
			
			if(num>199 && num <300) {
				romano=romano.concat("CC");
				num=num-200;
			}
			
			if(num>99 && num <200) {
				romano=romano.concat("C");
				num=num-400;
			}
			
			
			//DECENAS
			
			if(num>89) {
				romano=romano.concat("XC");
				num=num-90;
			}
			
			if(num>79 && num<90) {
				romano=romano.concat("LXXX");
				num=num-80;
			}
			
			if(num>69 && num<80) {
				romano=romano.concat("LXX");
				num=num-70;
			}
			
			if(num>59 && num<70) {
				romano=romano.concat("LX");
				num=num-60;
			}
			
			if(num>49 && num<60) {
				romano=romano.concat("L");
				num=num-50;
			}
			
			if(num>39 && num<50) {
				romano=romano.concat("XL");
				num=num-40;
			}
			
			if(num>29 && num<40) {
				romano=romano.concat("XXX");
				num=num-30;
			}
			
			if(num>19 && num<30) {
				romano=romano.concat("XX");
				num=num-20;
			}
			
			if(num>9 && num<20) {
				romano=romano.concat("X");
				num=num-10;
			}
			
			
			//UNIDADES
			
			if(num==9) {
				romano=romano.concat("IX");
			}
			
			if(num==8) {
				romano=romano.concat("VIII");
			}
			
			if(num==7) {
				romano=romano.concat("VII");
			}
			
			if(num==6) {
				romano=romano.concat("VI");
			}
			
			if(num==5) {
				romano=romano.concat("V");
			}
			
			if(num==4) {
				romano=romano.concat("IV");
			}
			
			if(num==3) {
				romano=romano.concat("III");
			}
			
			if(num==2) {
				romano=romano.concat("II");
			}
			
			if(num==1) {
				romano=romano.concat("I");
			}
			
		}
		
		
		return romano;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		int num;
		num=teclado.nextInt();
		
		System.out.println(convertirRomano(num));
		
	
	}

}
