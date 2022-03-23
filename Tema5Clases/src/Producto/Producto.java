package Producto;

public class Producto {

	
	//atributos
	private int id;
	private String descripcion;
	private double precioUnitario;
	private int unidades;
	private int stockMaximo;
	private double descuento;
	
	
	
	
	//metodos
	public Producto() {
		super();
		this.id = 0;
		this.descripcion = "";
		this.precioUnitario = 0;
		this.unidades = 0;
		this.stockMaximo = 0;
		this.descuento = 0;
	}
	
	public Producto(int id, String descripcion, double precioUnitario, int unidades, int stockMaximo,
			double descuento) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.unidades = unidades;
		this.stockMaximo = stockMaximo;
		this.descuento = descuento;
	}

	
	public boolean vender() {
		boolean vendido=false;
		if(this.unidades>0 && this.unidades<=this.stockMaximo) {
			this.unidades--;
			vendido=true;
		}
		return vendido;
	}
	
	
	//las unidades disponibles vuelven al stock maximo, devolvemos la cantidad reponida
	public int reponer() {
		int aumento=0;
		if(this.unidades>=0 && this.unidades<this.stockMaximo) {
			 this.unidades=this.stockMaximo;
			 aumento=this.stockMaximo-this.unidades;
		}
		return aumento;
	}
	
	
	//getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public int getStockMaximo() {
		return stockMaximo;
	}

	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	
	
	//el metodo devolvera true en caso de que los id de un producto sean iguales
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", unidades=" + unidades + ", stockMaximo=" + stockMaximo + ", descuento=" + descuento + "]";
	}
	
	
	
		
	
	
	
	
	
	
	
	
}
