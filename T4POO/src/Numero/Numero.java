package Numero;

public class Numero {

	private Integer numero;

	public Numero() {
		super();
		this.numero = 0;
	}
	
	public Numero(Integer numero) {
		super();
		this.numero = numero;
	}

	public void suma(int mas) {
		numero+=mas;
	}
	
	public void resta(int menos) {
		numero-=menos;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getValor() {
		return numero;
	}
	
	public void getDoble() {
		this.numero= this.numero*2;
	}
	
	public double getDouble() {
		return this.numero.doubleValue();
	}

	@Override
	public String toString() {
		return "Numero [numero=" + numero + "]";
	}
	
}
