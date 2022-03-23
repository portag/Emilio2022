package Triangulos;

public class TrianguloEquilatero extends Triangulos{

	public TrianguloEquilatero() {
		super();
		// TODO Auto-generated constructor stub
		if(!valido()) {
			throw new IllegalArgumentException("ERROR, los valores no se corresponden con el tipo de triangulo");
		}
	}

	public TrianguloEquilatero(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
		if(!valido()) {
			throw new IllegalArgumentException("ERROR, los valores no se corresponden con el tipo de triangulo");
		}
	}

	public TrianguloEquilatero(TrianguloEquilatero otro) {
		super(otro);
		// TODO Auto-generated constructor stub
		if(!valido()) {
			throw new IllegalArgumentException("ERROR, los valores no se corresponden con el tipo de triangulo");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TrianguloEquilatero [lado1=");
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
		// TODO Auto-generated method stub
		return (Math.pow(lado2, 2)*Math.sqrt(3))/4;
	}

	@Override
	public boolean valido() {
		if(lado1==lado2 && lado1==lado3) {
			return true;
		}else {
			return false;
		}
	}

	
	
	
}
