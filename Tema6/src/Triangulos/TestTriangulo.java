package Triangulos;

public class TestTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrianguloEquilatero tr = new TrianguloEquilatero(5,5,5);
		
		TrianguloIsosceles tr2 = new TrianguloIsosceles(5,5,4);
		
		TrianguloEscaleno tr3 = new TrianguloEscaleno(2,3,4);
		
		TrianguloRectangulo tr4 = new TrianguloRectangulo(5,4,3);
		System.out.println(tr.area());
		System.out.println(tr2.area());
		System.out.println(tr3.area());
		System.out.println(tr4.area());
		
	}

}
