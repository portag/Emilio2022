package AlquilerPeliculas;

public class ClaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeVideo pv = new PrimeVideo();
		
		
	
		/**
		 * CREA 200 OBJETOS PELICULA
		 */
		for(int i = 0; i < 200; i++) {
			if(i<30) {
				Pelicula p = new Pelicula("Pacific RIM", true, 10, 100);
				pv.addMultimedia(p);
			}else {
				Pelicula p2 = new Pelicula("Rambo", false, 10, 100);
				pv.addMultimedia(p2);
			}		
		}
		
		
		
		
		/**
		 * CREA OBJETOS CLIENTE
		 * 
		 */
		for(int i = 0; i < 10000; i++) {
			if(i < 7500) {
				ClientePrime c = new ClientePrime();
				pv.addSuscriptor(c);
			}else {
				ClientePrimePro c2 = new ClientePrimePro();
				pv.addSuscriptor(c2);
			}	
		}
		
		
		/**
		 * TODOS LOS CLIENTES VEN 40 PELICULAS
		 */
		for(Cliente c : pv.suscriptores) {
			for(Multimedia m : pv.catalogo) {
				if(m.getCodigo()<=40) {
					pv.ver(m, c);
				}else {
					break;
				}
			}
		}
		
		
		
		System.out.println(pv.getGanancias());

		
		//GENERA SERIES 
		for(int i = 0; i < 10; i++) {
			Serie serie = new Serie();
			for(int j=0; j<10; j++) {
				Temporada t = new Temporada(i);
					for(int z=0; z<10; z++) {
						t.addEpisodio(new Episodio("Episodio "+z, 50));
					}
				serie.addTemporada(t);
			}
			pv.addMultimedia(serie);
		}
		
		int cont = 0;
		for(Cliente c : pv.suscriptores) {
			
			for(Multimedia m : pv.catalogo) {
				if(m instanceof Serie && cont < 5) {
					pv.ver(m, c);
					cont++;
				}
			}
		}
		System.out.println(pv.getGanancias());
	}

}
