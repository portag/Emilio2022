package Biblio;

import java.util.Scanner;

public class TestBiblioteca {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Biblioteca b1 = new Biblioteca();
		Autor a1 = new Autor("alberto","perez",23,"almeria","avenida","alberto.com");
		
		Libro l1 = new Libro("123456789","milibro",12,234);
		Libro l2 = new Libro("123456789","otrolibro",12,234);
		Libro l3 = new Libro("123456789","dnd",12,234);
		Libro l4 = new Libro("123456789","manga",12,234);
		Libro l5 = new Libro("123456789","novela",12,234);
		Libro l6 = new Libro("123456789","comic",12,234);
		Libro l7 = new Libro("123456789","biografia",12,234);
		Libro l8 = new Libro("123456789","historieta",12,234);
		Libro l9 = new Libro("123456789","documental",12,234);
		Libro l10 = new Libro("123456789","poesia",12,234);

		Revista r1 = new Revista("123456789","marca",12,234,1);
		Revista r2 = new Revista("123456789","diario",12,234,1);
		Revista r3 = new Revista("123456789","hoy",12,234,1);
		Revista r4 = new Revista("123456789","almeria",12,234,1);
		Revista r5 = new Revista("123456789","local",12,234,1);
		
		
		l1.addAutor(a1);
		b1.adquirirMaterial(l1);
		b1.adquirirMaterial(l2);
		b1.adquirirMaterial(l3);
		b1.adquirirMaterial(l4);
		b1.adquirirMaterial(l5);
		b1.adquirirMaterial(l6);
		b1.adquirirMaterial(l7);
		b1.adquirirMaterial(l8);
		b1.adquirirMaterial(l9);
		b1.adquirirMaterial(l10);
		b1.adquirirMaterial(r1);
		b1.adquirirMaterial(r2);
		b1.adquirirMaterial(r3);
		b1.adquirirMaterial(r4);
		b1.adquirirMaterial(r5);
		
		int op = 0;
		String titulo= "";
		do {
			System.out.println("SELECCIONA UNA OPCION");
			System.out.println("1 - PRESTAR");
			System.out.println("2 - DEVOLVER");
			System.out.println("3 - BUSCAR");
			System.out.println("4 - SALIR");
			op = Integer.parseInt(teclado.nextLine());
			switch(op) {
			case 1:
				System.out.println("que se presta?");
				titulo = teclado.nextLine();
				for(Publicacion i : b1.publi) {
					if (i instanceof Libro) {
						if(((Libro) i).titulo.equals(titulo)) {
							((Libro) i).presta();
						}
					}
				}
				break;
			case 2:
				System.out.println("que devuelves?");
				titulo = teclado.nextLine();
				for(Publicacion i : b1.publi) {
					if (i instanceof Libro) {
						if(((Libro) i).titulo.equals(titulo)) {
							((Libro) i).devuelve();
						}
					}
				}
				break;
			case 3:
					
				System.out.println("1 - BUSCAR POR TITULO");
				System.out.println("2 - BUSCAR POR AUTOR");
				int op2 = Integer.parseInt(teclado.nextLine());
				
				switch(op2) {
				case 1:
					System.out.println("Titulo a buscar");
					titulo = teclado.nextLine();
					b1.buscar(titulo);
					break;
				case 2:
					
					System.out.println("nombre");
					String nombre= teclado.nextLine();
					System.out.println("apellidos");
					String ap = teclado.nextLine();
					Autor a = new Autor(nombre,ap,23,"almeria","avenida","alberto.com");	
						System.out.println(b1.buscar(a));
					break;
				default:
						System.out.println("dato incorrecto");
				}
				
				break;
			case 4:
				System.out.println("fin del programa");
				break;
			default:
				System.out.println("opcion incorrecta");
			}
			
		}while(op!=4);
		
	}
	
	
}
