package cuentaCorriente;

public class Cuenta {
	
	
	//propiedades
	private String numCuenta;
	private double saldo;
	
	
	//metodos
	public Cuenta() {
		super();
		this.numCuenta = this.generarNum(); //faltan 16 numeros
		this.saldo = 0;
	}


	public Cuenta(String numCuenta, double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public static String generarNum() {
		StringBuilder sb=new StringBuilder("ES49");
		for(int i=0;i<16;i++) {
			int num=(int)(Math.random()*10); //generamos 16 numeros
			sb.append(num);
		}
		return sb.toString();
	}
	
	public void ingreso(int importe) {
		this.saldo+=importe;
	}
	
	public void pago(int importe) {
		if(this.saldo>=importe) {
			this.saldo-=importe;
		}else {
			System.out.println("la operacion no se ha realizado");
		}
	}
	
	public void transferencia(Cuenta cuenta, int importe) {
		if(this.saldo>=importe) {
			this.saldo-=importe;
			cuenta.setSaldo(importe+cuenta.getSaldo());
		}else {
			System.out.println("capital insuficiente");
		}
		
	}
	
	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
	}
	
	
}
