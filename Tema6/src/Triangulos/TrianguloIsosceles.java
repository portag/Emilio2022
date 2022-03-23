package Triangulos;

public class TrianguloIsosceles extends Triangulos{

	public TrianguloIsosceles() {
		super();
		// TODO Auto-generated constructor stub
		if(!valido()) {
			throw new IllegalArgumentException("ERROR, los valores no se corresponden con el tipo de triangulo");
		}
	}

	public TrianguloIsosceles(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
		if(!valido()) {
			throw new IllegalArgumentException("ERROR, los valores no se corresponden con el tipo de triangulo");
		}
	}

	public TrianguloIsosceles(TrianguloIsosceles otro) {
		super(otro);
		// TODO Auto-generated constructor stub
		if(!valido()) {
			throw new IllegalArgumentException("ERROR, los valores no se corresponden con el tipo de triangulo");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TrianguloIsosceles [lado1=");
		builder.append(lado1);
		builder.append(", lado2=");
		builder.append(lado2);
		builder.append(", lado3=");
		builder.append(lado3);
		builder.append("]");
		return builder.toString();
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
	public double area() {
		double s=(this.lado1+this.lado2+this.lado3)/2;
		return Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));
	}

	@Override
	public boolean valido() {
		if((this.lado1 == this.lado2 && this.lado1 != this.lado3) || (this.lado1 != this.lado2 && this.lado2 == this.lado3)) {
			return true;
		}else {
			return false;
		}
	}

	
	
	
	
}
