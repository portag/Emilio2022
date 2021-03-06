package tienda;

import java.io.IOException;
import java.time.LocalDate;

public class Test {

	
	
	
	
	public static void main(String[] args) {
		
		Categoria tef = new Categoria("telefono");
		Categoria ord = new Categoria("ordenador");
		Producto p = new Producto("teclado","negro",ord,20,1.1);
		Producto p2 = new Producto("iphone","plus",tef,800,1.1);
		ClienteRegistrado cr1 = new ClienteRegistrado("carlos","martinez","123456789p","albox","la avenida","alberto.com","1234",LocalDate.of(1990, 1, 3));
		if(cr1.checkPassword("1234")) {
			Pedido ped = new Pedido(cr1);
			ped.nuevaLinea(new LineaPedido(p,1));
			ped.nuevaLinea(new LineaPedido(p2,2));
			
			System.out.println(ped);
		}else {
			System.out.println("Contraseņa incorrecta");
			System.out.println();
		}
		
		
		
		ClienteNoRegistrado cnr1 = new ClienteNoRegistrado("david","martinez","123456789p","albox","la avenida");
		Pedido ped2 = new Pedido(cnr1);
		ped2.nuevaLinea(new LineaPedido(p,5));
		ped2.nuevaLinea(new LineaPedido(p2,1));
		
		System.out.println(ped2);
		try {
			ped2.toPDF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
