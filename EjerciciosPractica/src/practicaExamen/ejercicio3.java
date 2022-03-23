package practicaExamen;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,cont=1;
        String fila="";
        String concat="";

        String fila2="";
        String esp="";
        int cont2=1;

        for (int i=0;i<4;i++) {
            //parte izquierda piramide
            for(int j=0;j<4-cont;j++) {
                System.out.print(" ");
            }
            cont++;


            System.out.print(fila);
            fila=fila.concat("");

            //parte derecha piramide
            System.out.print(concat);
            concat=concat.concat("");

            System.out.println(" ");
        }

        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int z=1;z<=(3-i) +1;z++){
                System.out.print("");
            }
            System.out.println();
        }
		
	}

}
