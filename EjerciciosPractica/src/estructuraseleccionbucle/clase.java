package estructuraseleccionbucle;

public class clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		int cont=1;
		do {
			System.out.print(num+" ");
			num--;
		}while(num>=1);
		
		
		System.out.println();
		
		
		System.out.println(cont++);
		
		
		for (int i=1;i<=10;i++) {
			if(i==5) {
				System.out.print("");
			}else {
				System.out.print(i+" ");
			}
			
		}
		
		System.out.println("");
		
		
		for (int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}else {
				System.out.print("");
			}
			
		}
		
		System.out.println("");
		
		for (int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print("");
			}else {
				System.out.print(i+" ");
			}
			
		}
		
		System.out.println("");
		
		
		for (int i=100;i>=2;i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}else {
				System.out.print("");
			}	
		}
		
		System.out.println();
		
		for (int i = 1;i <= 100; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				continue;
			}
			if (i==50) {
				break;
			}
		}

	}

}
