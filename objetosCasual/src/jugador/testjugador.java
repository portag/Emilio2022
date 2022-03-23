package jugador;

public class testjugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador p1= new Jugador();
		Jugador p2= new Jugador(120,50,5,10,"clerigo","vulfer",null,null);
		Jugador p3 = new Jugador();
		System.out.println(p2.numJugadores);
		System.out.println(p1);
		System.out.println(p2);
		
		p2.golpear("magico", p1);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
