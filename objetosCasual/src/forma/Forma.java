package forma;


public abstract class Forma {

	
	protected int id;
	public static int cont = 0; 
	
	Forma(){
		Forma.cont++;
		this.id = cont;
	}

	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}




	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}




	/**
	 * @return the cont
	 */
	public static int getCont() {
		return cont;
	}




	public abstract double area();
	public abstract void dibujar();


	
	
	
	
}
