package Triangulos;

import java.util.Objects;

public abstract class Triangulos implements Comparable<Triangulos>{

	protected double lado1;
	protected double lado2;
	protected double lado3;
	
	
	
	public Triangulos() {
		super();
	}
	
	public Triangulos(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public Triangulos(Triangulos otro) {
		super();
		this.lado1 = otro.lado1;
		this.lado2 = otro.lado2;
		this.lado3 = otro.lado3;
	}

	public abstract double area();
	
	public abstract boolean valido();
	
	public double perimeto() {
		return this.lado1+this.lado2+this.lado3;
	}

	/**
	 * @return the lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * @param lado1 the lado1 to set
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * @return the lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * @param lado2 the lado2 to set
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * @return the lado3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * @param lado3 the lado3 to set
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lado1, lado2, lado3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangulos other = (Triangulos) obj;
		return Double.doubleToLongBits(lado1) == Double.doubleToLongBits(other.lado1)
				&& Double.doubleToLongBits(lado2) == Double.doubleToLongBits(other.lado2)
				&& Double.doubleToLongBits(lado3) == Double.doubleToLongBits(other.lado3);
	}
	
}
