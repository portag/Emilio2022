package Password;

public class Password {

	
	
	//atributos
	private int longitud;
	private String contrasena;
	


	//metodos
	public Password() {
		super();
		this.longitud = 8;
		this.contrasena="";
		this.generarPassword();
	}
	
	
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrasena="";
		this.generarPassword();
	}
	
	public Password(Password otra) {
		super();
		this.longitud = otra.longitud;
		this.contrasena = otra.contrasena;
	}
	
	
	public boolean esFuerte() {
		boolean fuerte=false;
		int contsymbol=0;
		int contnum=0;
		int contmayus=0;
		int contminus=0;
		
		//comprobamos el string caracter a caracter y segun su valor ASCII comprobamos si es un numero,simbolo,mayuscula o minuscula
		for(int i=0;i<this.contrasena.length();i++) {
			if((this.contrasena.charAt(i)>=33 && this.contrasena.charAt(i)<=47) || (this.contrasena.charAt(i)>=58 && this.contrasena.charAt(i)<=64) || (this.contrasena.charAt(i)>=91 && this.contrasena.charAt(i)<=96)) {
				contsymbol++;
			}else if((this.contrasena.charAt(i)>=48 && this.contrasena.charAt(i)<=57)) {
				contnum++;
			}else if((this.contrasena.charAt(i)>=65 && this.contrasena.charAt(i)<=90)) {
				contmayus++;
			}else if((this.contrasena.charAt(i)>=97 && this.contrasena.charAt(i)<=122)) {
				contminus++;
			}
		}
		
		if(this.longitud>=8 && contsymbol>=1 && contmayus>=1 && contminus>2 && contnum>2) {
			fuerte=true;
		}
		
		return fuerte;
	}
	
	
	public String generarPassword() {
		for(int i=0;i<this.longitud;i++) {
			this.contrasena=this.contrasena.concat((Character.toString((char) (Math.random()*(122-(33+1))+(33)) )));
		}
		return this.contrasena;
	}
	
	
	
	
	public int getLongitud() {
		return longitud;
	}
	

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public String getContrasena() {
		this.generarPassword();
		return contrasena;
	}


	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrasena= " + contrasena + "]";
	}
	
}
