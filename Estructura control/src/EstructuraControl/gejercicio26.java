package EstructuraControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class gejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			int num;
			String cad;
			System.out.println("escribe un numero");
			num=teclado.nextInt();
			cad=String.valueOf(num);
			for(int i=cad.length();i>0;i--) {
				System.out.print(cad.substring(i-1,i));
			}
		}catch(InputMismatchException e){
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
	}
	

}
