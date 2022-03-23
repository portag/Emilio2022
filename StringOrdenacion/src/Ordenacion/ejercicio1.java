package Ordenacion;

public class ejercicio1 {
	
	public static int[] generarVector(int vector[]) {
		for (int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*100)+1;
		}
		return vector;
	}
	
	public static void ordenarVector(int vector[]) {
		int aux=0;
		for (int i=0;i<vector.length;i++) {
			for (int j=0;j<vector.length-1;j++) {
				if(vector[j]>vector[j+1]){
					aux=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=aux;
				}
			}
		}
	}
	
	public static void pintarVector(int vector[]) {
		for (int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]vector=new int[50];
		
		generarVector(vector);
		pintarVector(vector);
		System.out.println();
		System.out.println();
		ordenarVector(vector);
		pintarVector(vector);
		
	}

}
