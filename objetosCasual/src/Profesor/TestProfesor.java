package Profesor;

import java.time.LocalDate;

public class TestProfesor {
	
	public static void main(String[] args) {
		
		
		
		DepartamentoInformatica d = new DepartamentoInformatica();
		
		
		ProfesorTitular t1 = new ProfesorTitular("1","felipe","pacheco",LocalDate.of(2021, 12, 20),1000,false);
		ProfesorInterino i1 = new ProfesorInterino("2","pedro","morgado",LocalDate.of(2021, 12, 20),1000,LocalDate.of(2022, 1, 2));
		
		d.anadir(i1);
		d.anadir(t1);
		
		for(Profesor p : d.profe) {
			System.out.println(p.getNombre()+" gana "+p.importeNomina());
			if(p instanceof ProfesorInterino) {
				((ProfesorInterino)p).tiempoTrabajado();
			}
		}
		
	}
}
