package AlquilerPeliculas;


import java.util.ArrayList;


public class PrimeVideo {

	
	//ATRIBUTOS
	ArrayList<Multimedia> catalogo;
	ArrayList<Cliente> suscriptores;
	private double ganancias;
	
	
	//CONSTRUCTOR
	public PrimeVideo() {
		super();
		this.catalogo = new ArrayList<>();
		this.suscriptores = new ArrayList<>();
		this.ganancias = 0;
	}
	
	
	//METODOS
	public void addSuscriptor(Cliente c) {
		
		boolean encontrado=false;
		
		for(Cliente cli: suscriptores) {
			if (cli.equals(c)) {
				encontrado = true;
			}
		}

		if (!encontrado) {
			suscriptores.add(c);
		} else {
			System.out.println("El cliente ya está suscrito");
		}
		
	}
	
	
	public void addMultimedia(Multimedia m) {
		
		boolean encontrado=false;
		
		for(Multimedia media: catalogo) {
			if (media.equals(m)) {
				encontrado = true;
			}
		}

		if (!encontrado) {
			catalogo.add(m);
		} else {
			System.out.println("Ya está en el catálogo");
		}
		
	}
	
	public void ver(Multimedia m, Cliente c) {
		
		
		if((!c.esPro()) && m.isPlus()) {
			this.ganancias += m.getPrecio();
		}
		
	}
	
	public double getGanancias() {
		for(Cliente c : suscriptores) {
			
				this.ganancias += c.getPrecioMensual()*12;
			
		}
		
		return this.ganancias;
		
	}
	
}


