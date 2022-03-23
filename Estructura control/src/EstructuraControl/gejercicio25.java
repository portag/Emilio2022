package EstructuraControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class gejercicio25 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		try {
			int cant,num,menor,mayor,acu,cont;
			double media;
			menor=0;
			mayor=0;
			acu=0;
			cont=0;
			System.out.println("cantidad de numeros a escribir");
			cant=teclado.nextInt();
			
			if(cant>0) {
				for(int i=1;i<=cant;i++) {
					
					System.out.println("escribe un numero");
					num=teclado.nextInt();
					acu=acu+num;
					cont++;
					if(mayor<num) {
						mayor=num;
					}
					//pone el menor igual que el mayor para que no sea 0 mas adelante
					menor=mayor;
					if(menor>num) {
						menor=num;
					}
					
				}
				media=acu/cont;
				System.out.println("La media es: "+media);
				System.out.println("El mayor es: "+mayor);
				System.out.println("El menor es: "+menor);
			}else if(cant==0) {
				System.out.println("No se puede hacer la media de 0 numeros");
			}else {
				System.out.println("debe ser un numero positivo");
			}
			
			
			
		}catch(InputMismatchException e){
			System.out.println("ERROR: tipo de dato incorrecto");
		}
		

	}

}
