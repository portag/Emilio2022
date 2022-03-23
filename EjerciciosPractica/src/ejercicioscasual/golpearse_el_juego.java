package ejercicioscasual;
import java.util.Scanner;
public class golpearse_el_juego {

	public static int golpeo(int vida,int danio) {
		vida=vida-danio;
		return vida;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		String atacante;
		int hp1,hp2,at1,at2;
		
		
		hp1=100;
		hp2=150;
		
		at1=20;
		at2=15;
		
		while (hp1>0 && hp2>0) {
			
			System.out.println("¿Quién da la hostia a quién?");
			atacante=teclado.nextLine();
			
			switch(atacante) {
			case "jugador 1":
				System.out.println("Buena guantá jugador 1!");
				hp2=golpeo(hp2,at1);
				System.out.println("te quedan "+hp2+" puntos de vida jugador 2");
				break;
			case "jugador 2":
				System.out.println("Acábalo jugador 2!");
				hp1=golpeo(hp1,at2);
				System.out.println("te quedan "+hp1+" puntos de vida jugador 1");
				break;
			default:
				System.out.println("el aire no pega a nadie crack");
			}
			
		}
		
		if (hp1>0 && hp2<=0) {
			System.out.println("Gana el jugador 1(madre mia como lo ha puesto)");
		}
		
		if (hp1<=0 && hp2>0) {
			System.out.println("Gana el jugador 2(a tu casa platita)");
		}
		
		

	}

}
