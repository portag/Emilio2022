package Consumo;

public class Consumo {

	//atributos
		private double kms;
		private double litros;
		private double vmed;
		private double pagas;
		
		
		//constructores
		public Consumo() {
			super();
			this.kms = 0;
			this.litros = 0;
			this.vmed = 0;
			this.pagas = 0;
		}
		
		public Consumo(double kms, double litros, double vmed, double pagas) {
			super();
			this.kms = kms;
			this.litros = litros;
			this.vmed = vmed;
			this.pagas = pagas;
		}

		
		
		//getters y setters
		public double getKms() {
			return kms;
		}

		public void setKms(double kms) {
			this.kms = kms;
		}

		public double getLitros() {
			return litros;
		}

		public void setLitros(double litros) {
			this.litros = litros;
		}

		public double getVmed() {
			return vmed;
		}

		public void setVmed(double vmed) {
			this.vmed = vmed;
		}

		public double getPagas() {
			return pagas;
		}

		public void setPagas(double pagas) {
			this.pagas = pagas;
		}
		
		
		
		//otros metodos
		public double getTiempo() {
			double tiempo=0;
			tiempo=this.kms/this.vmed;
			return tiempo;
		}
		
		public double consumoMedio() {
			double consumo=0;
			double media=0;
			//conocer cuantos kilometros se deben recorrer para consumir un litro
			consumo=this.litros/this.kms;
			
			media=consumo*100;
			
			return media;
			
		}
		
		public double consumoEuros() {
			double consumo=0;
			double media=0;
			
			consumo=this.litros/this.kms;
			
			media=consumo*100*this.pagas;
			
			return media;
			
		}

		@Override
		public String toString() {
			return "Consumo [kms=" + kms + ", litros=" + litros + ", vmed=" + vmed + ", pagas=" + pagas + ", getTiempo()="
					+ getTiempo() + ", consumoMedio()=" + consumoMedio() + ", consumoEuros()=" + consumoEuros() + "]";
		}
	
}
