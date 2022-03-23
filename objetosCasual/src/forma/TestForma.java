package forma;

public class TestForma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c1 = new Circulo(4);
		
		System.out.println(c1);
		
		Circulo c2 = new Circulo(c1);
		
		System.out.println(c2);
		
		System.out.println(c1.equals(c2));
		
		Rectangulo r1 = new Rectangulo(2,4);
		
		System.out.println(r1);
		
		Rectangulo r2 = new Rectangulo(3,5);
		
		System.out.println(r2);
		
		System.out.println(r1.equals(r2));
		
		Triangulo t1 = new Triangulo(2,5);
		
		System.out.println(t1);
		
		Triangulo t2 = new Triangulo(t1);
		
		System.out.println(t2);
		
		System.out.println(t1.equals(t2));
		
	}

}
