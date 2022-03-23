package AlquilerPeliculas;

public class ClientePrime extends Cliente{

	//ATRIBUTOS
	public static final double precio = 3;

	public ClientePrime() {
		super();
		// TODO Auto-generated constructor stub
		this.precioMensual = precio;
	}

	
	//CONSTRUCTOR
	public ClientePrime(String dni, String nombre, String email) {
		super(dni, nombre, email);
		// TODO Auto-generated constructor stub
		this.precioMensual = precio;
	}

	
	
	//GETTERS Y SETTERS
	@Override
	public double getPrecioMensual() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public boolean esPro() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
