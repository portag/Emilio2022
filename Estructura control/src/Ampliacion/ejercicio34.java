package Ampliacion;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio34 {

	
	//generar contraseña
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String simbol="#$%&/()=?¿!";
		String mayus="QWERTYUIOPÑLKJMNHBGVCFDXSA";
		String minus="wqertyuiopñlkmnjhbvgfcxdsza";
		String clave="";
		System.out.println("dime una longitud para la contraseña");
		try {
			int longitud=teclado.nextInt();
			int alsimbol=(int) Math.floor(Math.random()*simbol.length()+1);
			int almayus=(int) Math.floor(Math.random()*mayus.length()+1);
			
			if(longitud<9) {
				System.out.println("la clave ha de tener mas de 8 caracteres");
			}else {
				System.out.println("generando su nueva clave...");
				
				clave=clave.concat(simbol.substring(alsimbol-1,alsimbol));
				clave=clave.concat(mayus.substring(almayus-1,almayus));
				for(int i=0;i<longitud-2;i++) {
					int alminus=(int) Math.floor(Math.random()*minus.length()+1);
					clave=clave.concat(minus.substring(alminus-1,alminus));
				}
				System.out.println(clave);
				
			}
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
	}

}
