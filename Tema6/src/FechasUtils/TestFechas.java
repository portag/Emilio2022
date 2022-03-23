package FechasUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime c = LocalDateTime.of(2022,3,1,12,12,12);
		
		FechasUtils.cuentaAtras(c, "cine");
		
		System.out.println(FechasUtils.diaCumple(LocalDate.of(1999, 3, 6), 2022));
		
		System.out.println(FechasUtils.numYears(LocalDate.of(2001, 3, 6)));
		
		System.out.println(FechasUtils.zodiaco(LocalDate.of(1000, 1, 10)));
	}

}
