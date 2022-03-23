package Agenda;

import java.util.ArrayList;

public class Agenda {

	 ArrayList<Contacto> persona;
	
	 
	 public Agenda() {
		 this.persona = new ArrayList<>();
	 }
	
	public boolean existeContacto(Contacto otro) {
		boolean repetido=false;
		for(Contacto i : persona) {
			if(i.equals(otro)) {
				repetido = true;
			}
		}
		return repetido;
	}
	
	
	public void nuevoContacto(Contacto nuevo) {
		if(existeContacto(nuevo)) {
			System.out.println("Contacto ya existente");
		}else {
			persona.add(nuevo);
		}
	}
	
	
	public void listarContactos() {
		for(Contacto i : persona) {
			System.out.println(i);
		}
	}
	
	public void buscarContacto(String nombre) {
		
		for(Contacto i : persona) {
			if(i.getNombre().equals(nombre)) {
				System.out.println(i.getTelefono());
			}
		}
	
	}
	
	public void eliminarContacto(Contacto otro) {
		if(existeContacto(otro)) {
			persona.remove(otro);
			System.out.println("Contacto eliminado");
		}else {
			System.out.println("No se ha podido eliminar al contacto");
		}
		
	}
	
	
	
	
	
	
	
}
