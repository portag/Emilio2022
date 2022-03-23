package Expediente;

import java.time.LocalDate;

import Expediente.Expediente.Modalidad;
import NotasCurso.NotasCurso;

public class testExpediente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Expediente al = new Expediente("emilio","porta",LocalDate.of(2001, 3, 6),1);
		al.setSexo('h');
		al.setModalidad(Modalidad.ESO);
		al.getNotas().add(new NotasCurso("programacion",1,5,6,7));
		al.getNotas().add(new NotasCurso("base datos",1,8,9,7));
		al.getNotas().add(new NotasCurso("base datos",1,8,9,7));
		al.getNotas().add(new NotasCurso("base datos",1,8,9,7));
		System.out.println(al);
		System.out.println(al.titula());
		
		
	}

}
