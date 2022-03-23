package forma;

import java.util.Objects;

public class Rectangulo extends Forma implements Dibujable{

	private int base;
	private int altura;
	
	
	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
		this.base = 0;
		this.altura = 0;
	}


	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo(Rectangulo otro) {
		super();
		this.base = otro.base;
		this.altura = otro.altura;
	}
	
	
	public double area() {
		return this.base*this.altura;
	}
	
	public void dibujar() {
		System.out.println("estoy en rectangulo");
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


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		return altura == other.altura && base == other.base;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangulo [base=");
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
