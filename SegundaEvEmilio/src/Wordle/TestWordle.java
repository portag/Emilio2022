package Wordle;

import java.time.LocalDate;
import java.util.Scanner;

public class TestWordle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Wordle w = new Wordle();
		
		System.out.println("Fecha actual: "+LocalDate.now());
		
		System.out.println("WORDLE");
		System.out.println("Escribe una palabra(5 letras)");
		for(int i = 0; i < 6; i++) {
			String intento = teclado.nextLine();
			
			if(w.comprobar(intento)) {
				System.out.println("YOU WIN");
				break;
			}else if(i == 5) {
				System.out.println(w.getIntento());
				System.out.println("YOU LOSE");
				break;
			}
			System.out.println(w.getIntento());
			w.getIntento().clear();
		}
		
		//System.out.println(w.getPalabraAcertar());
	}

}
