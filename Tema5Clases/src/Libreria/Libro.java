package Libreria;

import java.util.Objects;

public class Libro {

	
	//atributos
	private String ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;
	private double precioCompra;
	private double precioVenta;
	private boolean vendido;
	
	
	
	//constructores
	public Libro() {
		super();
		this.ISBN = "";
		this.generarISBN();
		this.precioCompra = 0;
		this.precioVenta = 0;
	}
	
	
	//genera aleatoriamente el ISBN
	public Libro(String titulo, String autor, int numPaginas) {
		super();
		this.ISBN = "";
		this.generarISBN();
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.precioCompra = 0;
		this.precioVenta = 0;
		this.vendido = false;
	}
	
	
	//introduce manualmente el ISBN
		public Libro(String iSBN, String titulo, String autor, int numPaginas) {
			super();
			this.ISBN = iSBN;
			this.titulo = titulo;
			this.autor = autor;
			this.numPaginas = numPaginas;
			this.precioCompra = 0;
			this.precioVenta = 0;
			this.vendido = false;
		}
		
		
		public Libro(Libro otro) {
			super();
			this.ISBN = otro.ISBN;
			this.titulo = otro.titulo;
			this.autor = otro.autor;
			this.numPaginas = otro.numPaginas;
			this.precioCompra = otro.precioCompra;
			this.precioVenta = otro.precioVenta;
			this.vendido = otro.vendido;
		}


	//getters y setters
	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}


	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}


	/**
	 * @return the numPaginas
	 */
	public int getNumPaginas() {
		return numPaginas;
	}


	/**
	 * @param numPaginas the numPaginas to set
	 */
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}


	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}


	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}


	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	/**
	 * @return the vendido
	 */
	public boolean isVendido() {
		return vendido;
	}


	/**
	 * @param vendido the vendido to set
	 */
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	
	
	
	//generamos un ISBN aleatorio de 10 digitos para no tener que introducir uno a mano
	public String generarISBN() {
		for(int i=0;i<=9;i++) {
			this.ISBN=this.ISBN.concat((Character.toString((char) (Math.random()*(57-(48+1))+(48)))));
		}
		return this.ISBN;
	}


	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene "  + numPaginas + " paginas";
	}

	
	//equals
	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(ISBN, other.ISBN);
	}

	
}
