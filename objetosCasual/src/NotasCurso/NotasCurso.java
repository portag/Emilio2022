package NotasCurso;

public class NotasCurso {

	
	private String materia;
	private int curso;
	private double nota1ev;
	private double nota2ev;
	private double nota3ev;
	private double notaFinal;
	
	
	public NotasCurso(String materia,int curso) {
		super();
		this.materia = materia;
		this.curso = curso;
	}
	
	public NotasCurso(String materia, int curso, double nota1ev, double nota2ev, double nota3ev) {
		super();
		this.materia = materia;
		this.curso = curso;
		this.nota1ev = nota1ev;
		this.nota2ev = nota2ev;
		this.nota3ev = nota3ev;
		this.calcularNotaFinal();
	}

	/**
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		this.materia = materia;
	}

	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * @return the nota1ev
	 */
	public double getNota1ev() {
		return nota1ev;
	}

	/**
	 * @param nota1ev the nota1ev to set
	 */
	public void setNota1ev(double nota1ev) {
		this.nota1ev = nota1ev;
	}

	/**
	 * @return the nota2ev
	 */
	public double getNota2ev() {
		return nota2ev;
	}

	/**
	 * @param nota2ev the nota2ev to set
	 */
	public void setNota2ev(double nota2ev) {
		this.nota2ev = nota2ev;
	}

	/**
	 * @return the nota3ev
	 */
	public double getNota3ev() {
		return nota3ev;
	}

	/**
	 * @param nota3ev the nota3ev to set
	 */
	public void setNota3ev(double nota3ev) {
		this.nota3ev = nota3ev;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + curso;
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota1ev);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota2ev);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota3ev);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotasCurso other = (NotasCurso) obj;
		if (curso != other.curso)
			return false;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		if (Double.doubleToLongBits(nota1ev) != Double.doubleToLongBits(other.nota1ev))
			return false;
		if (Double.doubleToLongBits(nota2ev) != Double.doubleToLongBits(other.nota2ev))
			return false;
		if (Double.doubleToLongBits(nota3ev) != Double.doubleToLongBits(other.nota3ev))
			return false;
		return true;
	}
	
	public void calcularNotaFinal() {
		this.notaFinal=(this.nota1ev+this.nota2ev+this.nota3ev)/3;
	}
	
	public boolean aprobado() {
		return (this.notaFinal>=5); 
	}
	
	public double getNotaFinal() {
		return notaFinal;
	}
	

	@Override
	public String toString() {
		return "NotasCurso [materia=" + materia + ", curso=" + curso + ", nota1ev=" + nota1ev + ", nota2ev=" + nota2ev
				+ ", nota3ev=" + nota3ev + "]";
	}
	
	
	public static void main(String[] args) {
		
		NotasCurso n1 = new NotasCurso("programacion",1,5,6,5);
		System.out.println(n1.notaFinal);
		
		
		
	}
	
	
	
	
}
