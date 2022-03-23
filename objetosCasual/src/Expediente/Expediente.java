package Expediente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

import NotasCurso.NotasCurso;

public class Expediente {

	
	//tipo enum definido para mi clase
	public enum Modalidad{fpb,gradomedio,gradosuperior,ESO,bachillerato};
	
	
	//propiedades
	private static int numAlumnos=0;
	private final int id = Expediente.numAlumnos+1;
	private String nombre;
	private String apellidos;
	private char sexo;
	private LocalDate fechaNac;
	private Modalidad modalidad;
	private int curso;
	private ArrayList<NotasCurso> notas;
	
	
	Expediente(){
		Expediente.numAlumnos++;
	}

	
	public Expediente(String nombre, String apellidos,LocalDate fechaNac, int curso) {
		super();
		Expediente.numAlumnos++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.curso = curso;
		
		//inicializar ArrayList
		this.notas = new ArrayList<>();
	}
	
	
	public int getId() {
		return this.id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}


	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	/**
	 * @return the fechaNac
	 */
	public LocalDate getFechaNac() {
		return fechaNac;
	}


	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}


	/**
	 * @return the modalidad
	 */
	public Modalidad getModalidad() {
		return modalidad;
	}


	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
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
	 * @return the numAlumnos
	 */
	public static int getNumAlumnos() {
		return numAlumnos;
	}


	/**
	 * @return the notas
	 */
	public ArrayList<NotasCurso> getNotas() {
		return notas;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expediente [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", fechaNac=");
		builder.append(fechaNac);
		builder.append(", modalidad=");
		builder.append(modalidad);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", notas=");
		builder.append(notas);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente other = (Expediente) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}
	
	
	public int getEdad() {
		return LocalDate.now().getYear() - this.fechaNac.getYear();
	}
	
	public boolean mayorEdad() {
		boolean legal=false;
		if(this.getEdad()>=18) {
			legal = true;
		}
		return legal;
	}
	
	public boolean titula() {
		
		//devuelve true si esta en ESO o Bachillerato y te quedan 2 o menos
		//devuelve true si esta en ciclo y aprueba todas
		//en caso contrario devuelve false
		
		if(this.modalidad == Modalidad.bachillerato || this.modalidad == Modalidad.ESO) {
			//solo puede haber 2 suspensos
			System.out.println("solo ESO o bachillerato");
			//contador de suspensos
			int cont=0;
			for (NotasCurso nc : this.getNotas()) {
				if(nc.getNotaFinal()<5) {
					cont++;
				}
			}
			if(cont>=2) {
				return false;
			}else {
				return true;
			}
			
		}else {
			//aprobamos todo
			for (NotasCurso nc : this.getNotas()) {
				if(nc.getNotaFinal()<5) {
					return false;
				}
			}
			return true;
			
		}
	}

	public double mediaExpediente() {
		//recorrer arraylist de notas curso y obtenemos la nota final de cada
		double media=0;
		int contmat=0;
		for(NotasCurso nc : this.getNotas()) {
			contmat++;
			media+=nc.getNotaFinal();
		}
		media=media/contmat;
		
		return media;
	}
	
	
	
	
	
	
}
