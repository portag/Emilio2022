package ejercicioscasual;

import java.util.Iterator;

public class imparArray {

	public static int sumaImpar(int numero[]) {
		int sum=0;
		
		for (int i=1;i<=numero.length;i+=2) {
			sum=sum+numero[i];
		}
		
		return sum;
		
	}
	
	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]=new int[20];
		
		for (int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100+1);
		}
		
		pintarVector(num);
		System.out.println("");
		System.out.println(sumaImpar(num));
		
	}

}
