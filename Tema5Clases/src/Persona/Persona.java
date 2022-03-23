package Persona;

public class Persona {

	//atributos
	private String nombre;
	private char sexo;
	private int edad;
	private int peso;
	private double altura;
	
	
	
	//metodos
	
	//constructores
	public Persona() {
		super();
		this.nombre = "emilio";
		this.sexo = 'h';
		this.edad = 20;
		this.peso = 75;
		this.altura = 1.8;
	}
	

	public Persona(String nombre, char sexo, int edad, int peso, double altura) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona(Persona otra) {
		super();
		this.nombre = otra.nombre;
		this.sexo = otra.sexo;
		this.edad = otra.edad;
		this.peso = otra.peso;
		this.altura = otra.altura;
	}
	
	
	
	public int calcularIMC() {
		double calculo = this.peso/(Math.pow(this.altura, 2));
		int imc=5;
		if (calculo<20) {
			imc = -1;
		}else if(calculo>=20 && calculo<=25) {
			imc = 0;
		}else if(calculo>25) {
			imc = 1;
		}
		return imc;
	}
	
	public boolean mayorEdad() {
		boolean mayoria = false;
		
		if(this.edad >18) {
			mayoria = true;
		}
		return mayoria;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + "]";
	}
	
	
	
	
}
