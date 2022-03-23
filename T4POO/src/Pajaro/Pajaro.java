package Pajaro;

public class Pajaro {

	public void setedad(int e) { edad=e; }
	public void printedad() { System.out.println(edad); }
	public void setcolor(char c) { color=c; }
	
	
	//generamos un metodo para imprimir el color
	//la clase esta bien, pero le faltaba este metodo printcolor para mostrar este atributo
		public void printcolor() {
			switch(color) {
			case 'r':
				System.out.println("rojo");
				break;
			case 'a':
				System.out.println("amarillo");
				break;
			case 'm':
				System.out.println("morado");
				break;
			case 'v':
				System.out.println("verde");
				break;
			default:
				System.out.println("color no especificado");
			}
		}
	
	private int edad; 
	private char color;
	
}
