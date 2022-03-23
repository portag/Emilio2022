package ArraysMatrices;

public class fejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[][]=new int[8][6];
		
		try {
			
			for(int i=0;i<vector.length;i++) {
				for(int j=0;j<vector[0].length;j++) {
					if(i==0 || i==vector.length-1 ||  j==0 || j==vector[i].length -1) {
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
