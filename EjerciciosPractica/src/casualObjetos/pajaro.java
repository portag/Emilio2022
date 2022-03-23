package casualObjetos;

public class pajaro {

	
	private int edad;
	private String color;
	

	
	public void printEdad() {
		System.out.println(edad);
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void printColor() {
		switch (color) {
		case "a":
			System.out.println("amarillo");break;
		case "b":
			System.out.println("blanco");break;
		case "c":
			System.out.println("celeste");break;
		case "r":
			System.out.println("rojo");break;
		default:
			System.out.println("no se ha establecido un color");
		}
	}
	
	
	
	
}
