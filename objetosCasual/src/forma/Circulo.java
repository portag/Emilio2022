package forma;

import java.util.Objects;

public class Circulo extends Forma implements Dibujable{

	private double radio;

	
	

	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
		this.radio = 0;
	}
	
	public Circulo(double radio) {
		super();
		// TODO Auto-generated constructor stub
		this.radio = radio;
	}
	
	public Circulo(Circulo otro) {
		super();
		// TODO Auto-generated constructor stub
		this.radio = otro.radio;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}
	
	public double area() {
		return 2*3.14*this.radio;
	}
	
	public void dibujar() {
		System.out.println("estoy en circulo");
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circulo [radio=");
		builder.append(radio);
		builder.append(", id=");
		builder.append(id);
		builder.append(", area()=");
		builder.append(area());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
