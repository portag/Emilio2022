package Libreria;

public class TestLibreria{

	public static void main(String[] args) {
		
		Libreria libreria = new Libreria();
		Libro l = new Libro("Harry Potter","J.K. Rowling",300);
		Libro l2 = new Libro("El imperio final","Brandon Sanderson",500);
		Libro l3 = new Libro("Juramentada","Brandon Sanderson",700);
		Libro l4 = new Libro("El camino de los reyes","Brandon Sanderson",400);
		Libro l5 = new Libro("Juego de tronos","George R.R. Martin",800);
		Libro l6 = new Libro("Danza de dragones","George R.R. Martin",450);
		Libro l7 = new Libro("Choque de reyes","George R.R. Martin",600);
		Libro l8 = new Libro("La vuelta al mundo en 80 dias","Julio Verne",350);
		Libro l9 = new Libro("Viaje al centro de la tierra","Julio Verne",650);
		Libro l10 = new Libro("Dos años de vacaciones","Julio Verne",100);
		Libro l11 = new Libro(l);
		
		
		//comprobacion metodos obtener libro, vender libro y beneficios
		libreria.adquirirLibro(l, 5);
		libreria.adquirirLibro(l2,20);
		libreria.adquirirLibro(l3,10);
		libreria.adquirirLibro(l4,15);
		libreria.adquirirLibro(l5,25);
		libreria.adquirirLibro(l6,10);
		libreria.adquirirLibro(l7,10);
		libreria.adquirirLibro(l8,15);
		libreria.adquirirLibro(l9,20);
		libreria.adquirirLibro(l10,5);
		
		libreria.venderLibro(l,10);
		libreria.venderLibro(l2,25);
		libreria.venderLibro(l4,20);
		libreria.venderLibro(l5,30);
		libreria.venderLibro(l6,10);
		libreria.venderLibro(l7,15);
		libreria.venderLibro(l9,25);
		libreria.venderLibro(l10,10);
		
	
		
		for(Libro i : libreria.libro) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Las ganancias obtenidas son de: "+libreria.library());
		System.out.println();
		
		
		//comprobacion equals
		System.out.println(l.equals(l10));
		System.out.println(l.equals(l));
		System.out.println(l.equals(l11));
	}

}
