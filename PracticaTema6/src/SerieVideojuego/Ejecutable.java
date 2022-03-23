package SerieVideojuego;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Serie>serie = new ArrayList<>();
		ArrayList<Videojuego>videojuego = new ArrayList<>();
		
		Serie s1 = new Serie();
		Serie s2 = new Serie();
		Serie s3 = new Serie();
		
		
		Videojuego v1 = new Videojuego();
		Videojuego v2 = new Videojuego();
		Videojuego v3 = new Videojuego();
		
		
		serie.add(s1);
		serie.add(s2);
		serie.add(s3);
		
		videojuego.add(v1);
		videojuego.add(v2);
		videojuego.add(v3);
		
		
		v1.entregar();
		s2.entregar();
		v3.entregar();
		s1.entregar();
		s1.devolver();
		
		
		for(Videojuego j : videojuego) {
			System.out.println(j);
		}
		
		
		for(Serie s : serie) {
			System.out.println(s);
		}
		
		System.out.println("Se han entregado "+Videojuego.numPrestamos+" juegos y "+ Serie.numPrestamos+" series");
		
	}

}
