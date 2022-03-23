package JuegoPoker;


public class Resultado {

	private int jugada;
	private int valor;
	
	
	
	public Resultado(int jugada, int valor) {
		super();
		this.jugada = jugada;
		this.valor = valor;
	}



	/**
	 * @return the jugada
	 */
	public int getJugada() {
		return jugada;
	}



	/**
	 * @param jugada the jugada to set
	 */
	public void setJugada(int jugada) {
		this.jugada = jugada;
	}



	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}



	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
	public int ganador(Resultado otro) {
		
		if(this.jugada>otro.jugada) {
			//SI EL JUGADOR 1 GANA POR VALOR
			return 0;
		}else if(this.jugada<otro.jugada) {
			//SI EL JUGADOR 2 GANA POR VALOR
			return 1;
		}else if (this.jugada==otro.jugada) {
			if(this.valor>otro.valor) {
				//SI EL JUGADOR 1 EMPATA EL VALOR CON EL JUGADOR 2 PERO GANA POR POSEER UNA CARTA DE NUMERO MAYOR
				return 0;
			}else if(this.valor<otro.valor) {
				//SI EL JUGADOR 2 EMPATA EL VALOR CON EL JUGADOR 1 PERO GANA POR POSEER UNA CARTA DE NUMERO MAYOR
				return 1;
			}else if(this.jugada==otro.jugada && this.valor==otro.valor) {
				//EMPATE
				return 2;
			}
		}
		
			return -1;
	}
	
	
}
