package EstructuraControl;

public class ejercicio1 {

	//funcion que de 3 numeros y devuelva el mayor de ellos
	public static int mayor(int a, int b, int c) {
		
		if (a>b && a>c) 
			return a;
		
		if (b>a && b>c) 
			return b;
		
		if (c>a && c>b) 
			return c;
		
		return -1;
		
	}
	
	public static int mayor2(int a,int b,int c,int d) {
		int intermedio;
		intermedio=(mayor(a,b,c));
		return mayor(intermedio,d,-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=6,b=5,c=3,d=3;
		
		
		System.out.println(mayor2(a,b,c,d));
		

	}

}
