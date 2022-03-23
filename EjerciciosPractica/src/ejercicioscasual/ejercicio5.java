package ejercicioscasual;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int [6][6];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if (i==j) {
					array[i][j]=1;
				}else {
					array[i][j]=0;
				}
			}
		}
		
		for (int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
		
	}

}
