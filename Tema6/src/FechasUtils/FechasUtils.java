package FechasUtils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class FechasUtils {

	
	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {
		LocalDateTime fechaActual = LocalDateTime.now();
		
		Period cuentaAtras = Period.between(fechaHasta.toLocalDate(), fechaActual.toLocalDate());
		Duration cuentaAtras2 = Duration.between(fechaHasta.toLocalTime(), fechaActual.toLocalTime());
		
		System.out.println("Faltan "+cuentaAtras.getYears()+" años, "+cuentaAtras.getMonths()+" meses, "+cuentaAtras.getDays()+" dias, "
				+ cuentaAtras2.toHoursPart()+" horas, "+cuentaAtras2.toMinutesPart()+" minutos y "+cuentaAtras2.toSecondsPart()+" segundos hasta "+titulo);
		
	}
	
	
	public static String diaCumple(LocalDate fechaCumple, int anio) {
		LocalDate fecha = fechaCumple.withYear(anio);
		//LENGUA ESPAÑOL
		Locale loc = Locale.forLanguageTag("es-HN");
		String dia = fecha.format(DateTimeFormatter.ofPattern("EEEE",loc));
		return dia;
	}
	
	
	public static int numYears(LocalDate fechaCumple) {
		LocalDate hoy = LocalDate.now();
		Period p = Period.between(fechaCumple, hoy);
		return p.getYears();
	}
	
	
	public static Signo zodiaco(LocalDate fecha) {
		
		Signo signo = null;
		
		switch(fecha.getMonthValue()) {
		case 1:
			if(fecha.getDayOfMonth()<=20) {
				signo = Signo.CAPRICORNIO;
			}else {
				signo = Signo.ACUARIO;
			}
			break;
		case 2:
			if(fecha.getDayOfMonth()<=18) {
				signo = Signo.ACUARIO;
			}else {
				signo = Signo.PISCIS;
			}
			break;
		case 3:
			if(fecha.getDayOfMonth()<=20) {
				signo = Signo.PISCIS;
			}else {
				signo = Signo.ARIES;
			}
			break;
		case 4:
			if(fecha.getDayOfMonth()<=20) {
				signo = Signo.ARIES;
			}else {
				signo = Signo.TAURO;
			}
			break;
		case 5:
			if(fecha.getDayOfMonth()<=21) {
				signo = Signo.TAURO;
			}else {
				signo = Signo.GÉMINIS;
			}
			break;
		case 6:
			if(fecha.getDayOfMonth()<=22) {
				signo = Signo.CÁNCER;
			}else {
				signo = Signo.LEO;
			}
			break;
		case 7:
			if(fecha.getDayOfMonth()<=23) {
				signo = Signo.LEO;
			}else {
				signo = Signo.VIRGO;
			}
			break;
		case 8:
			if(fecha.getDayOfMonth()<=23) {
				signo = Signo.VIRGO;
			}else {
				signo = Signo.LIBRA;
			}
			break;
		case 9:
			if(fecha.getDayOfMonth()<=24) {
				signo = Signo.LIBRA;
			}else {
				signo = Signo.ESCORPIO;
			}
			break;
		case 10:
			if(fecha.getDayOfMonth()<=24) {
				signo = Signo.ESCORPIO;
			}else {
				signo = Signo.SAGITARIO;
			}
			break;
		case 11:
			if(fecha.getDayOfMonth()<=23) {
				signo = Signo.SAGITARIO;
			}else {
				signo = Signo.CAPRICORNIO;
			}
			break;
		case 12:
			if(fecha.getDayOfMonth()<=22) {
				signo = Signo.CAPRICORNIO;
			}else {
				signo = Signo.ACUARIO;
			}
			break;
		}
		return signo;
	}
	
	public static boolean isIntervalo(LocalDateTime inicio,LocalDateTime fin,LocalDateTime fecha) {
		if(inicio.isBefore(fecha) && fin.isAfter(fecha)) {
			return true;
		}
		
		return false;
	}
	
}
