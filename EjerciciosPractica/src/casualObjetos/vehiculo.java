package casualObjetos;

public class vehiculo {

	private int numruedas;
	private String color;
	private int puertas;
	private int caballos;
	private int longitud;
	
	
	public vehiculo() {
		super();
		this.numruedas = 4;
		this.color = "rojo";
		this.puertas = 2;
		this.caballos = 120;
		this.longitud = 521;
	}
	
	public vehiculo(int numruedas, String color, int puertas, int caballos, int longitud) {
		super();
		this.numruedas = numruedas;
		this.color = color;
		this.puertas = puertas;
		this.caballos = caballos;
		this.longitud = longitud;
	}
	

	@Override
	public String toString() {
		return "vehiculo [numruedas=" + numruedas + ", color=" + color + ", puertas=" + puertas + ", caballos="
				+ caballos + ", longitud=" + longitud + "]";
	}
	
	
	public static void main(String[] args) {
		vehiculo coche1=new vehiculo(4,"verde",2,60,200);
		
		
		System.out.println(coche1);
	}

	

	
	
	
	
	
}
