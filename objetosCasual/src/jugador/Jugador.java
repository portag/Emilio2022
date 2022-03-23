package jugador;

public class Jugador {
	
	//propiedades
	private int vida;
	private int mana;
	private int dmgf;
	private int dmgm;
	private String clase;
	private String nombre;
	private Arma armaDerecha;
	private Arma armaIzquierda;
	public static int numJugadores=0;
	
	
	//metodos
	public Jugador() {
		super();
		this.vida = 100;
		this.mana = 100;
		this.dmgf = 5;
		this.dmgm = 5;
		this.clase = "mago";
		this.nombre = "npc";
		this.armaDerecha=null;
		this.armaIzquierda=null;
		Jugador.numJugadores++;
	}


	public Jugador(int vida, int mana, int dmgf, int dmgm, String clase, String nombre, Arma armad,Arma armai) {
		super();
		this.vida = vida;
		this.mana = mana;
		this.dmgf = dmgf;
		this.dmgm = dmgm;
		this.clase = clase;
		this.nombre = nombre;
		this.armaDerecha=armad;
		this.armaIzquierda=armai;
		Jugador.numJugadores++;
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public int getMana() {
		return mana;
	}


	public void setMana(int mana) {
		this.mana = mana;
	}


	public int getDmgf() {
		return dmgf;
	}


	public void setDmgf(int dmgf) {
		this.dmgf = dmgf;
	}


	public int getDmgm() {
		return dmgm;
	}


	public void setDmgm(int dmgm) {
		this.dmgm = dmgm;
	}


	public String getClase() {
		return clase;
	}


	public void setClase(String clase) {
		this.clase = clase;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Jugador [vida=" + vida + ", mana=" + mana + ", dmgf=" + dmgf + ", dmgm=" + dmgm + ", clase=" + clase
				+ ", nombre=" + nombre + "]";
	}
	
	public void golpear(String tipo,Jugador rival) {
		if(tipo.equals("magico")) {
			//quitar al rival la vida de mi golpe magico
			if(this.mana>=5) {
				rival.setVida(rival.getVida()-this.dmgm);
				this.mana-=5;
			}
		}else if(tipo.equals("fisico")) {
			//quitar al rival la vida de mi golpe fisico
			rival.setVida(rival.getVida()-this.dmgf);
		}
	}
	
	
	
	
	

}
