package JuegoPoker;


import java.util.Scanner;

public class TestJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		int op = 3;
		do {
			System.out.println("¿jugamos?");
			System.out.println("0 - no");
			System.out.println("1 - si");
			System.out.println();
			op = op = Integer.parseInt(teclado.nextLine());
			switch(op) {
			case 1:
				System.out.println("nombre jugador 1:");
				String jugador1 = teclado.nextLine();
				System.out.println();
				System.out.println("nombre jugador 2:");
				System.out.println();
				String jugador2 = teclado.nextLine();
				Juego j = new Juego(jugador1,jugador2);
				break;
				
			case 0:
				System.out.println("fin del programa");break;
				
			default:
				//EN CASO DE QUE SE TECLEE ALGUNA OPCION FUERA DE LOS PARAMETROS REINICIAMOS EL BUCLE 
				System.out.println("opcion incorrecta");
			}
		}while(op!=0);
		
		System.out.println("Partidas jugadas: "+Juego.numPartidas);
		
	}
	
}
