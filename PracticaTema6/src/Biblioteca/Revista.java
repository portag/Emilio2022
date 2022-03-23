package Biblioteca;

public class Revista extends Publicacion{

	protected int numero;

	public Revista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Revista(Revista otra) {
		super(otra);
		// TODO Auto-generated constructor stub
		this.numero = otra.numero;
	}

	public Revista(String isbn, String titulo, int anio, int paginas, int numero) {
		super(isbn, titulo, anio, paginas);
		// TODO Auto-generated constructor stub
		this.numero = numero;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + ", paginas="
				+ paginas + "]";
	}
	
	
	
	
	
}
