package ejercicioscasual;

public class primoArray {

	public static boolean esPrimo(int num) {
		boolean primo=false;
		int cont=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				cont++;
			}
		}
		if(cont==2 || num==1) {
			primo=true;
		}
		return primo;
		
		
	}
	
	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	public static int sumaPrimo(int numero[]) {
		int suma=0;
		for (int i=0;i<numero.length;i++) {
			if(esPrimo(numero[i])) {
				suma=suma+numero[i];
			}
		}
		return suma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num[]=new int[20];
		
		for (int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100+1);
		}
		
		pintarVector(num);
		System.out.println("");
		System.out.println(sumaPrimo(num));

	}

}
