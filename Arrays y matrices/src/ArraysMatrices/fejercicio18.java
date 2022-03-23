package ArraysMatrices;

public class fejercicio18 {
	
	//FUNCION PINTAR MATRIZ
	public static void pintarMatriz(int vector[][]) {
		
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				System.out.print(vector[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	//FUNCION GENERAR MATRIZ ALEATORIA
	public static int[][] generarMatriz(int vector[][]){
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				if (j==0 || j==1) {
					vector[i][j]=(int)(Math.random()*2)+1;
				}else if(vector[i][1]==1) {
					vector[i][2]=(int)(Math.random()*(2000-600)+600);
				}else {
					vector[i][2]=0;
				}
			}
		}
		return vector;
	}
	
	
	//FUNCION PORCENTAJE HOMBRES Y MUJERES
	public static void porcentajeHM(int vector[][]){
		int contHombre=0;
		int porcentajeHombre=0;
		int porcentajeMujer=0;
		
		//CONTAMOS EL NUMERO DE HOMBRES Y A PARTIR DE ESTE DATO SACAMOS A LAS MUJERES
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<1;j++) {
				if(vector[i][j]==1) {
					contHombre++;
				}
			}
		}
		porcentajeHombre=contHombre*10;
		porcentajeMujer=100-porcentajeHombre;
		System.out.println("el porcentaje de hombres es de un "+porcentajeHombre+"%, mientras que el de mujeres es de un "+porcentajeMujer+"%");
	}
	
	//FUNCION PORCENTAJE TRABAJADORES
	public static void porcentajeHMTrabajadores(int vector[][]){
		
		int contHombre=0;
		int contMujer=0;
		int contHT=0;
		int contMT=0;
		double porcentajeHombre=0;
		double porcentajeMujer=0;
		
		//CONTAMOS LOS HOMBRES Y MUJERES TOTALES
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<1;j++) {
				if(vector[i][j]==1) {
					contHombre++;
				}else if(vector[i][j]==2){
					contMujer++;
				}
			}
		}
		
		//CONTAMOS LOS HOMBRES Y MUJERES QUE TRABAJAN
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<1;j++) {
				if(vector[i][0]==1 && vector[i][1]==1) {
					contHT++;
				}else if(vector[i][0]==2 && vector[i][1]==1){
					contMT++;
				}
			}
		}
		
		//CALCULAMOS EL PORCENTAJE DE TRABAJADORES SEGUN EL GENERO
		if(contHombre>0 && contMujer>0) {
			porcentajeHombre=(double)(contHT*100)/contHombre;
			porcentajeMujer=(double)(contMT*100)/contMujer;
		}
		
		System.out.println("el porcentaje de hombres trabajadores es de un "+porcentajeHombre+"%, mientras que el de mujeres trabajadoras es de un "+porcentajeMujer+"%");
	}
	
	//FUNCION SUELDO MEDIO SEGUN GENERO
	public static void sueldoPromedio(int[][]vector) {
		
		int sueldoH=0;
		int sueldoM=0;
		int contM=0;
		int contH=0;
		double mediaH=0;
		double mediaM=0;
		
		//CREAMOS 2 ACUMULADORES QUE SUMEN EL SUELDO SEGUN GENERO
		//CREAMOS UN CONTADOR PARA REALIZAR LA MEDIA MAS TARDE
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<1;j++) {
				if(vector[i][0]==1 && vector[i][1]==1) {
					sueldoH=sueldoH+vector[i][2];
					contH++;
				}else if(vector[i][0]==2 && vector[i][1]==1){
					sueldoM=sueldoM+vector[i][2];
					contM++;
				}
			}
		}
		//CALCULO DE MEDIA
		if(contH>0 && contM>0) {
			mediaH=(double)(sueldoH/contH);
			mediaM=(double)(sueldoM/contM);
		}
			
		System.out.println("el suedo promedio de un hombre es de "+mediaH);
		System.out.println("el suedo promedio de una mujer es de "+mediaM);
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[][]=new int[10][3];
		try {
			System.out.println("Primera columna: 1-Hombre     2-Mujer");
			System.out.println("Segunda columna: 1-Trabaja     2-No trabaja");
			System.out.println("Tercera columna: Sueldo");
			
			System.out.println();
			generarMatriz(vector);
			pintarMatriz(vector);
			
			System.out.println();
			porcentajeHM(vector);
			
			System.out.println();
			porcentajeHMTrabajadores(vector);
			
			System.out.println();
			sueldoPromedio(vector);
			
		}catch(Exception e) {
			System.out.println("ERROR");
		}
	}
}
