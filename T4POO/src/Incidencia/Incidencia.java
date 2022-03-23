package Incidencia;

public class Incidencia {

	private int codigo;
	private String estado;
	private String problema;
	private String solucion;
	
	public static int pendientes=0;
	
	
	public Incidencia() {
		super();
		this.codigo = 0;
		this.estado = "";
		this.problema = "";
		this.solucion = "";
		Incidencia.pendientes++;
	}
	
	public Incidencia(int codigo, String estado, String problema, String solucion) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.problema = problema;
		this.solucion = solucion;
		Incidencia.pendientes++;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public static void resuelve() {
		if (Incidencia.pendientes==0) {
			System.out.println("todas las incidencias estan resueltas");
		}else {
			Incidencia.pendientes--;
		}
	}
	
	public static int getPendientes() {
		return pendientes;
	}

	@Override
	public String toString() {
		return "Incidencia [codigo=" + codigo + ", estado=" + estado + ", problema=" + problema + ", solucion="
				+ solucion + "]";
	}
	
}
