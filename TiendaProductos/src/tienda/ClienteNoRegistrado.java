package tienda;

public class ClienteNoRegistrado extends Cliente{

	public ClienteNoRegistrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Constructor con todos los parámetros
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param localidad
	 * @param direccion
	 */
	public ClienteNoRegistrado(String nombre, String apellidos, String dni, String localidad, String direccion) {
		super(nombre, apellidos, dni, localidad, direccion);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double descuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
