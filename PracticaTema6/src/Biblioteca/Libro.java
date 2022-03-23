package Biblioteca;

public class Libro extends Publicacion implements Prestable{

	
	protected boolean prestado;

	
	
	
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Libro(Libro otra) {
		super(otra);
		// TODO Auto-generated constructor stub
	}


	public Libro(String isbn, String titulo, int anio, int paginas) {
		super(isbn, titulo, anio, paginas);
		// TODO Auto-generated constructor stub
	}


	public boolean estaPrestado() {
		return this.prestado;
	}
	
	
	public void presta() {
		if(this.prestado == false) {
			this.prestado = true;
			System.out.println("operacion realizada");
		}else {
			System.out.println("libro ya prestado");
		}
	}
	
	public void devuelve() {
		if(this.prestado == true) {
			this.prestado = false;
			System.out.println("operacion realizada");
		}else {
			System.out.println("libro ya devuelto");
			
		}
	}
	
}
