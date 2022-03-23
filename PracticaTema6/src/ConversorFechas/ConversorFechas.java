package ConversorFechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConversorFechas {

	public static String normalToAmericano(String cad) {
		
		DateTimeFormatter americano = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter normal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha= LocalDate.parse(cad,normal);
		String fechaAmericana=fecha.format(americano);
		return fechaAmericana;
	}
	
	
	public static String americanoToNormal(String cad) {
		
		DateTimeFormatter normal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter americano = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate fecha= LocalDate.parse(cad,americano);
		cad=fecha.format(normal);
		return cad;
	}
	

	
}
