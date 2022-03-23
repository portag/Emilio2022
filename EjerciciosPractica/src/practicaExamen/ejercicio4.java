package practicaExamen;
import java.util.Scanner;
public class ejercicio4 {
	
	public static int[] generarVector(int[]vector) {
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*10)+1;
		}
		return vector;
	}
	
	public static void pintarVector(int numero[]) {
		for (int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int op=0;
		
		do {
			
			System.out.println("-----------------");
			System.out.println("MENU: MASTER MIND");
			System.out.println("1-SALIR");
			System.out.println("2- NUEVA PARTIDA");
			System.out.println("-----------------");
			op=teclado.nextInt();
			
			
			switch (op) {
			case 1:
				break;
				
				
				
			case 2:
				int longitud=0;
				do {
					System.out.println("longitud del numero(entre 2 y 9)");
					longitud=teclado.nextInt();
					switch(longitud) {
					case 2,3,4,5,6,7,8,9:
						break;
					default:
						break;
					}
					
				}while(longitud<2 || longitud>9);
				int vector[]=new int[longitud];
				generarVector(vector);
				pintarVector(vector);
				System.out.println();
				System.out.println();
				
				int num=0;
				int cont;
				
				do {
					
					
					System.out.println("");
					System.out.println("escribe 0 cuando quieras rendirte");
					cont=0;
					
					
					for(int i=0;i<vector.length;i++) {
						System.out.println("escribe un numero de un digito");
						num=teclado.nextInt();
						if(num==vector[i]) {
							cont++;
							System.out.println("posicion "+(i+1)+" correcta");
						}
						if(num==0) {
							System.out.println("una pena, puedes volver a jugar si quieres");
							cont=vector.length;
							break;
						}
					}
					
					
					if(cont!=vector.length) {
						System.out.println("has tenido "+cont+" numeros correctos");
					}
					
					
				}while(cont!=vector.length);
				
				
				if(num==-1) {
					System.out.println("una pena, puedes volver a jugar si quieres");
				}else if(cont==vector.length) {
					System.out.println("partida finalizada");
				}
				break;
				
				
			default:
				System.out.println("Opcion no válida");
			
			}
			
			
		}while(op!=1);
		
		System.out.println("Fin del programa");
		
		
	}
}
