package Profesor;

import java.util.ArrayList;

public class DepartamentoInformatica {

	ArrayList<Profesor>profe;

	public DepartamentoInformatica() {
		super();
		this.profe = new ArrayList<>();
	}
	
	public void anadir(Profesor p) {
		profe.add(p);
	}
	
	
	
}
