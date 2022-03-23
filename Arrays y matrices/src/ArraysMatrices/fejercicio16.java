package ArraysMatrices;

public class fejercicio16 {

	public static void pintarMatriz(int vector[][]) {
		
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				System.out.print(vector[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static boolean comprobarRepetido(int vector[][],int num) {
		boolean repetido=false;
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				if(vector[i][j]==num) {
					repetido= true;
					break;
				}
			}
		}
		return repetido;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[][]=new int[3][6];
		
			int num=0;
		try {
			
			

			for(int i=0;i<vector.length;i++) {
				for(int j=0;j<vector[i].length;j++) {
					
					do {
						num=(int)(Math.random()*25)+1;
						
					}while(comprobarRepetido(vector,num));
					vector[i][j]=num;
				}
				
			}
			
		pintarMatriz(vector);
	
		}catch(Exception e){
			System.out.println("ERROR");
		}
			
			
	
	}

}
