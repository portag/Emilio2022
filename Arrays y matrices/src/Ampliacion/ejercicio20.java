package Ampliacion;
import java.util.Scanner;
public class ejercicio20 {

	public static void pintarVector(int vector[]) {
		
		for(int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
		
	}
	
	public static int[] crearPila(int capacidad) {
		return new int [capacidad];
	}
	
	public static void inicioPila(int vector[]) {
		for(int i =0;i<vector.length;i++) {
			vector[i]=-1;
		}
	}
	
	public static void insertarPila(int vector[],int elemento) {
		for(int i =0;i<vector.length;i++) {
			if(vector[i]==-1) {
				vector[i]=elemento;
				break;
			}
		}
	}
	
	public static boolean lleno(int vector[]) {
		boolean llena=true;
		for(int i =0;i<vector.length;i++) {
			if(vector[i]==-1) {
				llena=false;
			}
		}
		return llena;
	}
	
	public static int sacarPila(int vector[]) {
		int elemento=-1;
		for(int i =0;i<vector.length;i++) {
			if(lleno(vector)) {
				elemento=vector[vector.length-1];
				vector[vector.length-1]=-1;
				return elemento;
			}
			
		}
		
		if(vector[0]!=-1) {
			for(int i =0;i<vector.length;i++) {
				if(vector[i]==-1) {
					elemento=vector[i-1];
					vector[i-1]=-1;
					return elemento;
				}
			}
		}
		return elemento;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int pila[]=crearPila(5);
		
		inicioPila(pila);
		pintarVector(pila);
		insertarPila(pila, 4);
		insertarPila(pila, 8);
		sacarPila(pila);
		System.out.println();
		pintarVector(pila);
		
	}

}
