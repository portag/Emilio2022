package ejercicioscasual;

public class mediaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int notas[];
		notas=new int[10];
		int acum=0;
		double media;
		
		for (int i=0;i<notas.length;i++) {
			notas[i]=(int)Math.floor(Math.random()*10+1);
		}
		
		for (int i=0;i<notas.length;i++) {
			System.out.print(notas[i]+"  ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		for (int i=0;i<notas.length;i++) {
			acum+=notas[i];
		}
	 
		media=(double)acum/notas.length;
		
		
		System.out.println(media);

	}

}
