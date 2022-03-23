package JuegoPoker;



public class Juego {

		private Jugador player1;
		private Jugador player2;
		public static int numPartidas=0;
		
		public Juego(String player1, String player2) {
			super();
			this.player1 = new Jugador(player1);
			this.player2 = new Jugador(player2);
			Juego.numPartidas++;
			jugar();
			mostrarResultado();
		}
		
		
		public void jugar() {
			Resultado r1 = new Resultado(this.player1.valorTirada().getJugada(),this.player1.valorTirada().getValor());
			Resultado r2 = new Resultado(this.player2.valorTirada().getJugada(),this.player2.valorTirada().getValor());
			r1.ganador(r2);
			if(r1.ganador(r2)==0) {
				System.out.println("Gana "+this.player1.getNombre());
			}else if(r1.ganador(r2)==1) {
				System.out.println("Gana "+this.player2.getNombre());
			}else if(r1.ganador(r2)==2) {
				System.out.println("Empate");
			}
		}
		
		
		
		public void mostrarResultado() {
			System.out.println(this.player1);
			System.out.println(this.player2);
		}


		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("");
			
			return builder.toString();
		}
		
		
		 
		

	
}
