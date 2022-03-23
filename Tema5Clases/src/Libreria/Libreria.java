package Libreria;
import java.util.ArrayList;

public class Libreria {


		ArrayList<Libro> libro;
		
		public Libreria() {
			this.libro = new ArrayList<>(1000);
		}
		
		public void adquirirLibro(Libro li, int precioCompra) {
			li.setPrecioCompra(precioCompra);
			this.libro.add(li);
		}
		
		public void venderLibro(Libro li, int precioVenta) {
			for(Libro i : libro) {
				if(i.equals(li)) {
					li.setPrecioVenta(precioVenta);
					li.setVendido(true);
				}
			}
			
		}
		
		public double library() {
			double ganancias=0;
			for(Libro i : this.libro) {		
				ganancias = i.getPrecioVenta() - i.getPrecioCompra();			
			}
			return ganancias;
		}
}
