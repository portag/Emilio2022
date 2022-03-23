package tarjetaRegalo;

public class Tarjeta {

	//propiedades
	private String numero;
	private double saldo;
	public static int numTarjetas=0;
	
	
	//metodos
	public Tarjeta() {
		super();
		this.numero = generarNum();
		this.saldo = 0;
		Tarjeta.numTarjetas++;
	}
	
	
	public Tarjeta(double saldo) {
		super();
		this.numero = generarNum();
		this.saldo = saldo;
		Tarjeta.numTarjetas++;
	}
	
	public static String generarNum() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<20;i++) {
			int num=(int)(Math.random()*10);
			sb.append(num);
		}
		return sb.toString();
	}
	
	public void fusion(Tarjeta tarjeta) {
		this.saldo+=tarjeta.getSaldo();
		tarjeta.setSaldo(0);
		tarjeta.setNumero(null);
	}
	
	@Override
	public String toString() {
		return "Tarjeta [numero=" + numero + ", saldo=" + saldo + "]";
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public void gasta(int paga) {
		this.saldo-=paga;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getNumero() {
		return numero;
	}


	public static int getNumTarjetas() {
		return numTarjetas;
	}
	
	
	
	
	
}
