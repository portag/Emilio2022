package EstructuraControl;

public class ejercicio7 {

	
	//sumar los 100 primeros numeros impares
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int acum=0,cont=0,aux=1;
		
		while (cont!=100) {
			if(aux%2!=0) {
				acum=acum+aux;
				cont++;
			}
			aux++;
		}
		
		
		System.out.println(acum);
		
		
	}

}
