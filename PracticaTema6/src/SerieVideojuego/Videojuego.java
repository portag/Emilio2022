package SerieVideojuego;

public class Videojuego implements Entregable{

	
	protected String titulo;
	protected int horasEstimadas;
	protected String genero;
	protected String desarrollador;
	protected boolean prestado;
	public static int numPrestamos=0;
	
	
	public Videojuego() {
		super();
		this.horasEstimadas = 100;
		this.prestado = false;
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.prestado = false;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String desarrollador, boolean prestado) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.desarrollador = desarrollador;
		this.prestado = prestado;
	}
	
	
	public Videojuego(Videojuego otro) {
		super();
		this.titulo = otro.titulo;
		this.horasEstimadas = otro.horasEstimadas;
		this.genero = otro.genero;
		this.desarrollador = otro.desarrollador;
		this.prestado = otro.prestado;
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
	 * @return the horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	/**
	 * @param horasEstimadas the horasEstimadas to set
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
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
	 * @return the desarrollador
	 */
	public String getDesarrollador() {
		return desarrollador;
	}

	/**
	 * @param desarrollador the desarrollador to set
	 */
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}
	
	
	public boolean entregar() {
		if(this.prestado ==false) {
			this.prestado=true;
			Videojuego.numPrestamos++;
		}
		
		return this.prestado;
	}
	
	public boolean devolver() {
		if(this.prestado==true) {
			this.prestado=false;
			Videojuego.numPrestamos--;
		}
		
		return this.prestado;
	}
	
	public void isPrestado() {
		System.out.println(this.prestado);
	}
	

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", genero=" + genero
				+ ", desarrollador=" + desarrollador + ", prestado=" + prestado + "]";
	}
	
	
	
	
	
	
}
