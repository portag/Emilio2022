package tarjetaRegalo;

public class testRegalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarjeta t1=new Tarjeta(50);
		Tarjeta t2=new Tarjeta();
		
		
		t2.setSaldo(30);
		
		System.out.println(t1.numTarjetas);
		t1.fusion(t2);
		System.out.println(t1);
		System.out.println(t2);
		
	}

}
