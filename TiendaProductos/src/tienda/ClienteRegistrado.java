package tienda;
import org.apache.commons.codec.digest.DigestUtils;
import java.time.LocalDate;

public class ClienteRegistrado extends Cliente{

	protected String email;
	protected String password;
	protected LocalDate fechaNac;
	protected LocalDate fechaRegistro;
	protected static double descuento = 5;
	
	
	public ClienteRegistrado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Contructor con todos los parametros
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param localidad
	 * @param direccion
	 * @param email
	 * @param password
	 * @param fechaNac
	 */
	public ClienteRegistrado(String nombre, String apellidos, String dni, String localidad, String direccion, String email, String password, LocalDate fechaNac) {
		super(nombre, apellidos, dni, localidad, direccion);
		// TODO Auto-generated constructor stub
		this.email = email;
		this.password = DigestUtils.sha256Hex(password);
		this.fechaNac = fechaNac;
		this.fechaRegistro = LocalDate.now();
	}

	
	/**
	 * comprueba contraseņa encriptada
	 * @param pass
	 * @return
	 */
	public boolean checkPassword(String pass) {
		if(password.equals(DigestUtils.sha256Hex(pass))) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the fechaRegistro
	 */
	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}


	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	/**
	 * @return the descuento
	 */
	public static double getDescuento() {
		return descuento;
	}
	
	
	public double descuento() {
		return ClienteRegistrado.descuento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClienteRegistrado [email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", fechaNac=");
		builder.append(fechaNac);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
