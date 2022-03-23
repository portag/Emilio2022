package Ordenacion;

public class ejercicio2 {

	public static int[] generarVector(int vector[]) {
		for (int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*100)+1;
		}
		return vector;
	}
	
	public static void ordenarVector(int vector[]) {
		int aux=0;
		boolean flag=false;
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

	}

}
