package ejercicioscasual;

public class loteria {

	
	
	public static int generarAleatorio() {
		int num=0;
		
		num=(int)(Math.random()*49+1);
		
		return num;
		
	}
	
	public static boolean estaRepetido(int numero,int[]vector) {
		
		boolean repetido=false;
		
		for (int i=0;i<vector.length;i++) {
			if(vector[i]==numero) {
				repetido=true;
				break;
			}
		}
		
		return repetido;
		
	}
	
	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]=new int[6];
		int numero=0;
		for (int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*49+1);
		}
		
		for (int i=0;i<num.length;i++) {
			do {
				numero=generarAleatorio();
			}while(estaRepetido(numero,num));
			
			num[i]=numero;
		}
		
		pintarVector(num);
		
	}

}
