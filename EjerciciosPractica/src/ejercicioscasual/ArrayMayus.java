package ejercicioscasual;

public class ArrayMayus {

	
	public static void pintarVector(char[] abecedario) {
		for (int i=0;i<abecedario.length;i++) {
			System.out.print(abecedario[i]+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char abecedario[]=new char[26];
		
		char car='A';
		
		for (int i=0;i<abecedario.length;i++) {
			abecedario[i]=car;
			car++;
		}
		
		pintarVector(abecedario);
		
	}

}
