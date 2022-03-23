package AlquilerPeliculas;

public class ClientePrimePro extends Cliente{

	
	//ATRIBUTOS
	public static final double precio = 5;

	
	//CONSTRUCTORES
	public ClientePrimePro() {
		super();
		// TODO Auto-generated constructor stub
		this.precioMensual = precio;
	}

	public ClientePrimePro(String dni, String nombre, String email) {
		super(dni, nombre, email);
		// TODO Auto-generated constructor stub
		this.precioMensual = precio;
	}
	
	
	//GETTERS Y SETTERS
	@Override
	public double getPrecioMensual() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public boolean esPro() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
	
	
}
