package forma;

import java.util.Objects;

public class Triangulo extends Forma implements Dibujable{

	
	private int base;
	private int altura;
	
	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
		this.base = 0;
		this.altura = 0;
	}


	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	
	public Triangulo(Triangulo otro) {
		super();
		this.base = otro.base;
		this.altura = otro.altura;
	}


	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}


	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}


	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}


	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public int hashCode() {
		return Objects.hash(altura, base);
	}


	public double area() {
		return (this.base*this.altura)/2;
	}
	
	public void dibujar() {
		System.out.println("estoy en triangulo");
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangulo other = (Triangulo) obj;
		return altura == other.altura && base == other.base;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangulo [base=");
		builder.append(base);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", id=");
		builder.append(id);
		builder.append(", area()=");
		builder.append(area());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
