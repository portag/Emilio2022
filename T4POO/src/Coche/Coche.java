package Coche;

public class Coche {

	//propiedades
		private int velocidad; //Atributo
		
		//metodos
		Coche() { 
			velocidad = 0;
		}

		public int getVelocidad() {
			return velocidad;
		} 
		
		public void acelera(int mas) {
			this.velocidad+=mas;
		}
		
		public void frena(int menos) {
			this.velocidad-=menos;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Coche [velocidad=");
			builder.append(velocidad);
			builder.append("]");
			return builder.toString();
		}
		
	
}
