package EstructuraControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class gejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teclado = new Scanner(System.in);
		
		try {
			int num=-1;
			int cont=0;
			int cont2=0;
			int max=0;
			while(num!=0) {
				System.out.println("escribe un numero entre el 1 y el 100");
				num=teclado.nextInt();
				
				if (num>0 && num<101) {
					if(num==1) {
						max=1;
					}else {
						for (int i=1;i<num;i++) {
							if(num%i==0) {
								max=i;
							}
						}
					}
					
					System.out.println("el mayor divisor de "+num+" es "+max);
					cont++;
				}else {
					if(num==0) {
						break;
					}else {
						System.out.println("ERROR: el numero ha de estar entre 1 y 100");
						cont2++;
					}
				}
			}
			
			System.out.println("Numeros correctos: "+cont);
			System.out.println("Numeros incorrectos: "+cont2);
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		
	}

}
