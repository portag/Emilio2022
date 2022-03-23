package Pez;

public class TestPez {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		
		Pez p1 = new Pez();
		Pez p2 = new Pez("caballa");
		
		
		Pez p3 = (Pez) p1.clone();
		System.out.println(p1.equals(p3));
		
		
		Pez p4 = new Pez(p1);
		
		System.out.println(p1.equals(p4));
		System.out.println(p2.equals(p4));
		
		System.out.println(Pez.numPeces);
		
	}

}
