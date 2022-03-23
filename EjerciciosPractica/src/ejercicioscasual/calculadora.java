package ejercicioscasual;
import java.util.InputMismatchException;
import java.util.Scanner;
public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int op=0;
		float n1,n2,res;
		
	
			while (op !=5) {
				System.out.println("MENU CALCULADORA");
				System.out.println("1-SUMAR");
				System.out.println("2-RESTAR");
				System.out.println("3-MULTIPLICAR");
				System.out.println("4-DIVIDIR");
				System.out.println("5-SALIR");
				System.out.println("---------------------");	
				System.out.println("Seleccione una opcion");
				try {
					op=teclado.nextInt();
					switch(op) {
					case 1:
						System.out.println("introduce los 2 numeros");
						n1=teclado.nextFloat();
						n2=teclado.nextFloat();
						res=n1+n2;
						System.out.println(res);
						break;
					case 2:
						System.out.println("introduce los 2 numeros");
						n1=teclado.nextFloat();
						n2=teclado.nextFloat();
						res=n1-n2;
						System.out.println(res);
						break;
					case 3:
						System.out.println("introduce los 2 numeros");
						n1=teclado.nextFloat();
						n2=teclado.nextFloat();
						res=n1*n2;
						System.out.println(res);
						break;
					case 4:
							System.out.println("introduce los 2 numeros");
							n1=teclado.nextFloat();
							n2=teclado.nextFloat();
							res=n1/n2;
							if (n2 !=0) {
								System.out.println(res);
							}else {
								System.out.println("el denominador no sebe ser igual a 0");
							}
						break;
					case 5:
						System.out.println("Fin del programa");
						break;
					default:
						System.out.println("Opción incorrecta");
					}
				} catch (InputMismatchException e) {
					System.out.println("Tipo de dato incorrecto");
					break;
				}
				
			
			}
		
		
		
	}

}
