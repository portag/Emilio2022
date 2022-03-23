package ejercicioscasual;

public class quickSort {

	public static void quickSort(int[] arr, int start, int end){
		 
        int partition = partition(arr, start, end);
 
        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }
 
	public static int[] generarVector(int vector[]) {
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*10)+1;
		}
		return vector;
	}
	
	public static void pintarVector(int vector[]) {
		for(int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
	}
	
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
 
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
 
        return start;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[]=new int[10];
		generarVector(vector);
		quickSort(vector, 0, vector.length-1);
		pintarVector(vector);

	}

}
