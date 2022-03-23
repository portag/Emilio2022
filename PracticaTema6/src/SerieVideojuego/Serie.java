package SerieVideojuego;

public class Serie implements Entregable{

	
	//ATRIBUTOS
	protected String titulo;
	protected int numTemporadas;
	protected String genero;
	protected String creador;
	protected boolean prestado;
	public static int numPrestamos=0;
	
	
	//CONSTRUCTORES
	public Serie() {
		super();
		this.numTemporadas = 3;
		this.prestado = false;
	}
	
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.prestado = false;
	}
	
	
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.prestado = false;
	}
	
	
	public Serie(Serie otra) {
		super();
		this.titulo = otra.titulo;
		this.numTemporadas = otra.numTemporadas;
		this.genero = otra.genero;
		this.creador = otra.creador;
		this.prestado = otra.prestado;
	}
	
	
	
	//GETTERS Y SETTERS
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
	 * @return the numTemporadas
	 */
	public int getNumTemporadas() {
		return numTemporadas;
	}

	/**
	 * @param numTemporadas the numTemporadas to set
	 */
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	
	public boolean entregar() {
		if(this.prestado==false) {
			this.prestado=true;
			Serie.numPrestamos++;
		}
		
		return this.prestado;
	}
	
	public boolean devolver() {
		if(this.entregar()==true) {
			this.prestado=false;
			Serie.numPrestamos--;
		}
		return this.prestado;
	}
	
	public void isPrestado() {
		System.out.println(this.prestado);
	}
	
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", genero=" + genero + ", creador="
				+ creador + ", prestado=" + prestado + "]";
	}
	
	
	
	
	
	
	
}
