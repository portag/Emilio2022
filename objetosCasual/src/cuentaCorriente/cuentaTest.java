package cuentaCorriente;

public class cuentaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c1= new Cuenta();
		Cuenta c2=new Cuenta();
		c1.ingreso(100);
		c2.ingreso(200);
		c1.transferencia(c2, 10);
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
