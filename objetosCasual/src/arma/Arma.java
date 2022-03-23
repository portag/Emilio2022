package arma;

public class Arma {

	//propiedades
	
	private String nombre;
	private int dmg;
	private String tipo;
	
	
	//metodos
	public Arma() {
		super();
		this.nombre = "shotgun";
		this.dmg = 50;
		this.tipo = "fisico";
	}
	
	public Arma(String nombre, int dmg, String tipo) {
		super();
		this.nombre = nombre;
		this.dmg = dmg;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", dmg=" + dmg + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
}
