package Biblio;

import java.util.ArrayList;
import java.util.Objects;

public class Publicacion {

	protected String isbn;
	protected String titulo;
	protected int anio;
	protected int paginas;
	ArrayList<Autor> autores;
	
	
	public Publicacion() {
		super();
	}
	
	public Publicacion(String isbn, String titulo, int anio, int paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.anio = anio;
		this.paginas = paginas;
		this.autores = new ArrayList<>();
	}
	
	public Publicacion(Publicacion otra) {
		super();
		this.isbn = otra.isbn;
		this.titulo = otra.titulo;
		this.anio = otra.anio;
		this.paginas = otra.paginas;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(titulo, other.titulo);
	}

	
	
	public ArrayList<Autor> getAutor() {
		return autores;
	}
	
	
	
	public void addAutor(Autor a) {
		autores.add(a);
	}
	
	public void delAutor(Autor a) {
		if (autores.indexOf(a) >= 0) {
			autores.remove(autores.indexOf(a));
		}
	}
	
	
	@Override
	public String toString() {
		return "Publicacion [isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + ", paginas=" + paginas + "]";
	}
	
	
}
