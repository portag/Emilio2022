package Ampliacion;

public class ejercicio23 {
	
	public static void pintarMatriz(int vector[][]) {
		
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				System.out.print(vector[i][j]+"   ");
			}
			System.out.println();
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fila=5;
		int columna=3;
		
		int vector[][]=new int[fila][columna];
		int traspuesta[][]=new int[columna][fila];
		
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				vector[i][j]=(int)(Math.random()*10)+1;
			}
		}
		
		for(int i=0;i<traspuesta.length;i++) {
			for(int j=0;j<traspuesta[i].length;j++) {
				traspuesta[i][j]=vector[j][i];
			}
		}
		
		pintarMatriz(vector);
		
		System.out.println();
		System.out.println();
		
		pintarMatriz(traspuesta);
	}

}
