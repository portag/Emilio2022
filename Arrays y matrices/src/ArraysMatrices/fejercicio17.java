package ArraysMatrices;

public class fejercicio17 {

	public static void pintarMatriz(int vector[][]) {
		
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				System.out.print(vector[i][j]+"   ");
			}
			System.out.println();
			System.out.println();
		}
		
	}
	
	
	public static int[][] generarMatriz(int vector[][]){
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
					vector[i][j]=(int)(Math.random()*500)+1;
			}
		}
		return vector;
	
	}
	
	
	public static void ordenFila(int vector[][]) {
		int aux;

		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length-1;j++) {
				for(int z=0;z<vector.length;z++) {
					for(int y=0;y<vector[z].length-1;y++) {
						if(vector[z][y]>vector[z][y+1]) {
							aux=vector[z][y];
							vector[z][y]=vector[z][y+1];
							vector[z][y+1]=aux;
						}
					}
				}
			}
		}
	}
	
	
	
	
	public static void ordenColumna(int vector[][]) {
		
			
		int aux=0;
		for(int j=0;j<vector[0].length;j++) {
			for(int i=0;i<vector.length;i++) {
				
				//ordenacion
				for(int z=0;z<vector.length-1;z++) {
					if(vector[z][j]>vector[z+1][j]) {
						aux=vector[z][j];
						vector[z][j]=vector[z+1][j];
						vector[z+1][j]=aux;
					}
				}
			}	
		}
			
			
			
			
			
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[][]=new int[5][5];
		
		generarMatriz(vector);
		
		
	
		
		pintarMatriz(vector);
		System.out.println();
		ordenColumna(vector);
		pintarMatriz(vector);
		
		
	}

}
