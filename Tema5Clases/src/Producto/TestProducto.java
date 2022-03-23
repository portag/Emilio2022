package Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Producto();
		Producto p2 = new Producto(0,"tostadora",1,21,20,1);
		Producto p3 = new Producto(2,"tostadora",1,20,25,1);
		
		//a pesar de que el resto de datos son distintos el print devolvera true puesto que los id de p1 y p2 son iguales
		System.out.println(p1.equals(p2));
		
		
		//probamos el metodo vender y reponer en caso de que las unidades superen el stock maximo
		System.out.println(p2);
		System.out.println(p2.vender());
		System.out.println(p2);
		System.out.println(p2.reponer());
		System.out.println(p2);

		
		System.out.println();
		System.out.println();
		
		
		//probamos el metodo vender y reponer en un caso corriente
		System.out.println(p3);
		System.out.println(p3.vender());
		System.out.println(p3);
		System.out.println(p3.reponer());
		System.out.println(p3);
		
		//p3 y p2 son distintos porque tienen distintos id
		System.out.println(p3.equals(p2));
		System.out.println(p1.equals(p2));
		
	}

}
