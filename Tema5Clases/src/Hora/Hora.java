package Hora;

import java.util.Objects;

public class Hora {

	
	//atributos
	private int miliSegundos;
	private int segundos;
	private int minutos;
	private int horas;
	
	
	
	//metodos
	public Hora() {
		super();
		this.miliSegundos = 0;
		this.segundos = 0;
		this.minutos = 0;
		this.horas = 0;
	}
	
	
	public Hora(int horas, int minutos, int segundos, int miliSegundos) {
		super();
			this.miliSegundos = miliSegundos;
			this.segundos = segundos;
			this.minutos = minutos;
			this.horas = horas;
	}
	
	
	public Hora(Hora otra) {
		super();
		this.miliSegundos = otra.miliSegundos;
		this.segundos = otra.segundos;
		this.minutos = otra.minutos;
		this.horas = otra.horas;
	}
	
	
	public Hora(String hora) {
		super();
		this.segundos = Integer.valueOf(hora.substring(6, 8));
		this.minutos = Integer.valueOf(hora.substring(3, 5));
		this.horas = Integer.valueOf(hora.substring(0, 2));
		this.miliSegundos = 0;
	}


	//getters y setters
	public int getMiliSegundos() {
		return miliSegundos;
	}


	public void setMiliSegundos(int miliSegundos) {
		this.miliSegundos = miliSegundos;
	}


	public int getSegundos() {
		return segundos;
	}


	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}


	public int getMinutos() {
		return minutos;
	}


	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	//validar hora
	public boolean esHoraValida() {
		boolean validar=true;
		if ((this.miliSegundos<0 || this.miliSegundos>999) || (this.segundos<0 || this.segundos>59) || (this.minutos<0 || this.minutos>59) || (this.horas<0 || this.horas>23)) {
			validar=false;
		}
		return validar;
	}
	
	
	//segundo siguiente
	public void segundoSiguiente() {
		//evitamos que en caso de que los valores de m y s sean mayores de 59 y los retornamos a 0 sumando 1 a minutos u horas
		//en caso contrario sumanos 1 a los segundos
		if(esHoraValida()) {
			
			//comprobar segundos
			if(this.segundos==59) {
				this.segundos=00;
				
				//comprobar minutos
				if(this.minutos==59) {
					this.minutos=00;
					
					//comprobar horas
					if(this.horas==23) {
						this.horas=00;
					}else {
						this.horas++;
					}
					
				}else {
					this.minutos++;
				}
			}else {
				this.segundos++;
			}
			
		}
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	//COMPARA HORAS,MINUTOS Y SEGUNDOS(NO MILISEGUNDOS)
	@Override
	public boolean equals(Object obj) {
		if(esHoraValida()) {
			if (this == obj)
			return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Hora other = (Hora) obj;
			return horas == other.horas && minutos == other.minutos && segundos == other.segundos;
		}else {
			return false;
		}
		
	}


	public String horaCompleta() {
		if(esHoraValida()) {
			return horas + " : " + minutos + " : " + segundos + " : " + miliSegundos;
		}else {
			return "Hora mal introducida";
		}
	}
	

	@Override
	public String toString() {
		if(esHoraValida()) {
			return horas + " : " + minutos + " : " + segundos;
		}else {
			return "Hora mal introducida";
		}
	}
}
