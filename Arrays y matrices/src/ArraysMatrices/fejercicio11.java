package ArraysMatrices;

public class fejercicio11 {

	public static void main(String[] args) {
		
		int vector[][]=new int[5][5];
		
		try {
			for(int i=0;i<vector.length;i++) {
				for(int j=0;j<vector.length;j++) {
					if(j==i) {
						vector[i][j]=1;
					}else {
						vector[i][j]=0;
					}
				}
			}
			
			for(int i=0;i<vector.length;i++) {
				for(int j=0;j<vector[i].length;j++) {
					System.out.print(vector[i][j]+" ");
				}
				System.out.println(" ");
			}
		}catch(Exception e) {
			System.out.println("ERROR");
		}
		
	}
	
}
