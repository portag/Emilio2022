package FechaUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaUtils {

	
	
	//CUENTA ATRAS
	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {
		System.out.println("Faltan "+fechaHasta.getYear()+" años, "+fechaHasta.getMonth()+" meses, "+fechaHasta.getDayOfMonth()+" dias, "
				+ fechaHasta.getHour()+" horas, "+fechaHasta.getMinute()+" minutos y "+fechaHasta.getSecond()+" segundos hasta "+titulo);
	}

	
	
	
	//CUMPLEAÑOS
	public static String diaCumple(LocalDateTime cumple, int anio) {
		Locale spanish = new Locale("SPANISH","ES","dd/MM/yyyy");
		
		return "";
	}
	
	
}
