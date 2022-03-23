package Triangulos;

public class TrianguloRectangulo extends Triangulos{

	

	public TrianguloRectangulo() {
		super();
		// TODO Auto-generated constructor stub
		valido();
	}


	public TrianguloRectangulo(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
		valido();
	}


	public TrianguloRectangulo(TrianguloRectangulo otro) {
		super(otro);
		// TODO Auto-generated constructor stub
		valido();
	}


	

	@Override
	public double area() {
		return (lado1*lado2)/2;
	}


	@Override
	public boolean valido() {
		
			if(Math.pow(lado1, 2) == Math.pow(lado3, 2) + Math.pow(lado3, 2)) {
				return true;
			}else {
				throw new IllegalArgumentException("ERROR, los valores no se corresponden con el tipo de triangulo");
			}	
	}


	@Override
	public int compareTo(Triangulos t) {
		if (this.area() > t.area()) {
			return 1;
		}else if(this.area() < t.area()) {
			return -1;
		}else if(this.area() == t.area()) {
			return 0;
		}
		return 2;
	}


	@Override
	public String toString() {
		return "TrianguloRectangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", valido()="
				+ valido() + "]";
	}
	
	
	
}
