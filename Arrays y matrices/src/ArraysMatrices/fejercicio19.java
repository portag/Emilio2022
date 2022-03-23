package ArraysMatrices;

public class fejercicio19 {
	
	
	public static void sumarColumna(int vector[][]) {
		
		for(int i=0;i<vector[0].length;i++) {
			int suma=0;
			for(int j=0;j<vector.length;j++) {
				suma=suma+vector[j][i];
			}
			System.out.print(suma+" ");
		}
		
	}
	
	//muestra toda la matriz con la suma de columnas por una parte y la suma de las filas por otra
	public static void pintarMatriz(int vector[][]) {
		
		for(int i=0;i<vector.length;i++) {
			int suma=0;
			for(int j=0;j<vector[i].length;j++) {
				System.out.print(vector[i][j]+"  ");
				suma+=vector[i][j];
				
			}
			System.out.print(suma);
			System.out.println();
			
		}
		sumarColumna(vector);
		
	}
	
	
	
	
	public static void sumarColumnaFila(int vector[][]) {
		int suma=0;
		int suma1=0;
		int total=0;
		for(int i=0;i<vector[0].length;i++) {
			
			for(int j=0;j<vector.length;j++) {
				suma=suma+vector[j][i];
			}
		}
		
		for(int i=0;i<vector.length;i++) {
			
			for(int j=0;j<vector[0].length;j++) {
				suma1=suma1+vector[i][j];
			}
		}
		total=suma+suma1;
		System.out.print(total);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[][]=new int[4][5];
		
		for(int i=0;i<vector.length;i++) {
		
			for(int j=0;j<vector[i].length;j++) {
				vector[i][j]=(int)(Math.random()*10);
				
			}
		}
		
		pintarMatriz(vector);
		
		
		sumarColumnaFila(vector);

	}

}
