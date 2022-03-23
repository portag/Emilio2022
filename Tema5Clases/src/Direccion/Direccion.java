package Direccion;

public class Direccion {

	
	//atributos
	private String nombre;
	private int numero;
	private String poblacion;
	private String provincia;
	private String cp;
	private String pais;
	private double latitud;
	private double longitud;
	
	
	//constructor
	public Direccion() {
		super();
		this.nombre = "";
		this.numero = 0;
		this.poblacion = "";
		this.provincia = "";
		this.cp = "";
		this.pais = "";
		this.latitud = 0;
		this.longitud = 0;
	}
	
	
	public Direccion(Direccion otra) {
		super();
		this.nombre = otra.nombre;
		this.numero = otra.numero;
		this.poblacion = otra.poblacion;
		this.provincia = otra.provincia;
		this.cp = otra.cp;
		this.pais = otra.pais;
		this.latitud = otra.latitud;
		this.longitud = otra.longitud;
	}
	
	
	public Direccion(String nombre, int numero, String poblacion, String provincia, String cp, String pais,
			double latitud, double longitud) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.cp = cp;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
	}


	
	//getters y setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getCp() {
		return cp;
	}


	public void setCp(String cp) {
		this.cp = cp;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public double getLatitud() {
		return latitud;
	}


	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}


	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}


	//hash y equals
	//dos objetos seran iguales si tienen la misma latitud y longitud
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(latitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		if (Double.doubleToLongBits(latitud) != Double.doubleToLongBits(other.latitud))
			return false;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		return true;
	}


	//metodo
	public double distanciaKMS(Direccion otra) {
		int r= 6378;
		double alat=Math.toRadians(otra.latitud)-Math.toRadians(this.latitud);
		double along=Math.toRadians(otra.longitud)-Math.toRadians(this.longitud);
		double a=(Math.pow(Math.sin(alat/2), 2)) +
				(Math.cos(Math.toRadians(this.latitud))) *
				(Math.cos(Math.toRadians(otra.latitud))) *
				(Math.pow(Math.sin(along/2), 2));
		double c = 2 * (Math.atan2(Math.sqrt(a),Math.sqrt(1-a)));
		double distancia = r * c;
		return distancia;
	}
	
	
	
	@Override
	public String toString() {
		return "Direccion [nombre=" + nombre + ", numero=" + numero + ", poblacion=" + poblacion + ", provincia="
				+ provincia + ", cp=" + cp + ", pais=" + pais + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
