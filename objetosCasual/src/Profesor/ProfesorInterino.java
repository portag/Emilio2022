package Profesor;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import java.time.LocalDate;

public class ProfesorInterino extends Profesor {

	LocalDate fechaInt;
	
		
	
	public ProfesorInterino() {
		super();
		// TODO Auto-generated constructor stub
		this.fechaInt = LocalDate.of(2021, 12, 12);
	}


	public ProfesorInterino(String numRegistro, String nombre, String apellidos, LocalDate fechaNac, double nomina, LocalDate fechaInt) {
		super(numRegistro, nombre, apellidos, fechaNac, nomina);
		// TODO Auto-generated constructor stub
		this.fechaInt = fechaInt;
	}

	
	public void tiempoTrabajado() {
		int dia = (int) DAYS.between(fechaInt, LocalDate.now());
		int mes = (int) MONTHS.between(fechaInt, LocalDate.now());
		
		System.out.println("Ha trabajado durante "+dia+" dias y "+mes+" meses");
	}

	@Override
	public double importeNomina() {
		// TODO Auto-generated method stub
		return this.nomina + (this.nomina*0.1);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProfesorInterino [fechaInt=");
		builder.append(fechaInt);
		builder.append(", numRegistro=");
		builder.append(numRegistro);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNac=");
		builder.append(fechaNac);
		builder.append(", nomina=");
		builder.append(nomina);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
