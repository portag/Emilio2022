package practicaExamen;

public class ejercicio2 {

	public static double factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=0.5;
		double sumando=0;
		double total=0;
		double diferencia=0;
		double anterior=0;
		
		
		int i=1;
		
		do {
			sumando=(Math.pow((-1), i+1)/factorial(i))* Math.pow(x, i);
			total+=sumando;
			
			diferencia=total-anterior;
			anterior=total;
			i++;
		}while(Math.abs(diferencia)>0.0001);
		
		System.out.println(total);
		

	}

}
