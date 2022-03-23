package Biblioteca;

import java.util.ArrayList;


public class Biblioteca {

	
	ArrayList<Publicacion> publi;
	private String direccion;
	
	
	public Biblioteca() {
		super();
		this.publi = new ArrayList<>();
	}
	
	public Biblioteca(String direccion) {
		super();
		this.direccion = direccion;
		this.publi = new ArrayList<>();
	}


	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public boolean existePublicacion(Publicacion otro) {
		boolean repetido=false;
		for(Publicacion i : publi) {
			if(i.equals(otro)) {
				repetido = true;
			}
		}
		return repetido;
	}
	
	
	public void adquirirMaterial(Publicacion nuevo) {
		if(existePublicacion(nuevo)) {
			System.out.println("Publicacion en posesion");
		}else {
			publi.add(nuevo);
		}
	}
	
	public void buscar(String titulo) {
		for(Publicacion i : publi) {
			if(i.getTitulo().equals(titulo)) {
				System.out.println(i);
			}
		}
	}
	

	public Publicacion buscar(Autor a) {
		for(Publicacion i : publi) {
			
		}
		return null;
	}
	
}
