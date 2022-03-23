package JuegoPoker;

import java.util.Arrays;

public class Jugador {

	//ATRIBUTOS
		private String nombre;
		private int[] tirada=new int[5];
		
		
		
		
		//CONSTRUCTOR
		public Jugador(String nombre) {
			super();
			
			this.nombre = nombre;
			this.tirada = tirada();
		}


		
		//GETTERS Y SETTERS
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}


		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		/**
		 * @return the tirada
		 */
		public int[] getTirada() {
			return tirada;
		}


		/**
		 * @param tirada the tirada to set
		 */
		public void setTirada(int[] tirada) {
			this.tirada = tirada;
		}
		
		
		
		//METODOS
		public int[] tirada(){
			//GENERAMOS UN ARRAY DE NUMEROS ENTRE 1 Y 6
			for(int i=0;i<this.tirada.length;i++) {
				this.tirada[i]=(int)(Math.random()*6)+1;
			}
			//ORDEN DE ARRAY(IMPORTANTE PARA COMPROBACIONES DE valorTirada())
			Arrays.sort(this.tirada);
			return this.tirada;
		}

		public Resultado valorTirada() {
			Resultado r;
			
			
			//POKER REAL
			if ( (tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]) && (tirada[0] == tirada[4]) ) {
				return r = new Resultado(8,tirada[0]);
			}
			
			
			//POKER
			if ( ( (tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]) )) {
				return r = new Resultado(7,tirada[2]);
			}
					
			if ( (tirada[1] == tirada[2]) && (tirada[1] == tirada[3]) && (tirada[1] == tirada[4]) )  {
				return r = new Resultado(7,tirada[2]);
			}
			
			
			//FULL
			if (tirada[0] == tirada[1] && tirada[1] == tirada[2] && tirada[3] == tirada[4]) {
				return r = new Resultado(6,tirada[2]);
			}
				
			if (tirada[2] == tirada[3] && tirada[3] == tirada[4] && tirada[0] == tirada[1]) {
				return r = new Resultado(6,tirada[2]);
			}
				
			
			
			//ESCALERA MAYOR
			if (tirada[0] == 2 && tirada[1] == 3 && tirada[2] == 4 && tirada[3] == 5 && tirada[4] == 6) {
				return r = new Resultado(5,0);
			}
			
			
			//ESCALERA MENOR
			if (tirada[0] == 1 && tirada[1] == 2 && tirada[2] == 3 && tirada[3] == 4 && tirada[4] == 5) {
				return r = new Resultado(4,0);
			}
			
			
			//PIERNAS
			if (tirada[0] == tirada[1] && tirada[1] == tirada[2]) {
				return r = new Resultado(3,tirada[2]);
			}
				
			if (tirada[1] == tirada[2] && tirada[2] == tirada[3]) {
				return r = new Resultado(3,tirada[2]);
			}
				
			if (tirada[2] == tirada[3] && tirada[3] == tirada[4]) {
				return r = new Resultado(3,tirada[2]);
			}
			
			
			//PARES DOBLES
			if (tirada[0] == tirada[1] && tirada[2] == tirada[3]) {
				if(tirada[0]>tirada[3]) {
					return r = new Resultado(2,tirada[0]);
				}else {
					return r = new Resultado(2,tirada[2]);
				}
			}
				
			if (tirada[1] == tirada[2] && tirada[3] == tirada[4]) {
				if(tirada[1]>tirada[3]) {
					return r = new Resultado(2,tirada[1]);
				}else {
					return r = new Resultado(2,tirada[3]);
				}
			}
				
			if (tirada[0] == tirada[1] && tirada[3] == tirada[4]) {
				if(tirada[0]>tirada[3]) {
					return r = new Resultado(2,tirada[1]);
				}else {
					return r = new Resultado(2,tirada[3]);
				}
			}
				
			
			//PARES
			if (tirada[0] == tirada[1]) {
				return r = new Resultado(1,tirada[1]);
			}
			
			if (tirada[1] == tirada[2]) {
				return r = new Resultado(1,tirada[1]);
			}
			
			if (tirada[2] == tirada[3]) {
				return r = new Resultado(1,tirada[3]);
			}
			
			if (tirada[3] == tirada[4]) {
				return r = new Resultado(1,tirada[3]);
			}
				

			
				
			return r = new Resultado(1,1);
		}



		@Override
		public String toString() {
			return "Jugador [nombre=" + nombre + ", tirada=" + Arrays.toString(tirada) + "]";
		}
		
		
		
	
}
