package Agenda;
import java.util.Scanner;

public class TestAgenda {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner(System.in);	
	Agenda agenda = new Agenda();
	int op=0;
	
	do {
		
		System.out.println("-----AGENDA-----");
		System.out.println("1 - Añadir contacto");
		System.out.println("2 - Listar contactos");
		System.out.println("3 - Buscar contacto");
		System.out.println("4 - Eliminar contacto");
		System.out.println("5 - Salir");
		
		System.out.println();
		System.out.println("Selecciona una opcion:");
		op=teclado.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Nombre del contacto:");
			String nombre = teclado.next();
			System.out.println("Telefono del contacto:");
			String tef = teclado.next();
			agenda.nuevoContacto(new Contacto(nombre,tef));
			System.out.println();
			break;
		case 2:
			agenda.listarContactos();
			System.out.println();
			break;
		case 3:
			System.out.println("Nombre del contacto:");
			nombre = teclado.next();
			agenda.buscarContacto(nombre);
			System.out.println();
			break;
		case 4:
			System.out.println("Nombre del contacto:");
			nombre = teclado.next();
			agenda.eliminarContacto(new Contacto(nombre));
			System.out.println();
			break;
		case 5:
			System.out.println("Fin del programa");
			break;
		default:
			System.out.println("Opcion incorercta");
			System.out.println();
		}
		
		
		
	}while(op!=6);
	
	
	
	}

}
