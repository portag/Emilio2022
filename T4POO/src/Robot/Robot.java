package Robot;


public class Robot {

	
	
	//atributos
	private int posx;
	private int posy;
	private boolean haLlegado;
	private int numPasos;
	public static int contRobots=0;
	final static int filas=100;
	final static int coulmnas=100;
	
	
	
	//constructores
	public Robot() {
		super();
		this.posx = 0;
		this.posy = 0;
		this.haLlegado = false;
		this.numPasos = 0;
		Robot.contRobots++;
	}
	
	public Robot(int posx, int posy, boolean haLlegado, int numPasos) {
		super();
		this.posx = posx;
		this.posy = posy;
		this.haLlegado = haLlegado;
		this.numPasos = numPasos;
		Robot.contRobots++;
	}

	
	
	//getters y setters
	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public boolean isHaLlegado() {
		return haLlegado;
	}

	public void setHaLlegado(boolean haLlegado) {
		this.haLlegado = haLlegado;
	}

	public int getNumPasos() {
		return numPasos;
	}

	public void setNumPasos(int numPasos) {
		this.numPasos = numPasos;
	}

	public static int getContRobots() {
		return contRobots;
	}

	public static void setContRobots(int contRobots) {
		Robot.contRobots = contRobots;
	}

	public static int getFilas() {
		return filas;
	}

	public static int getCoulmnas() {
		return coulmnas;
	}
	
	//en caso de que el robot choque contra una pared el numero de pasos no avanzara
	public void irArriba() {
		if (posy<coulmnas && posy>=0) {
			this.posy+=1;
			this.numPasos++;
		}else {
			System.out.println("el robot no puede seguir por ese camino");
		}
		
		if(posy==100 && posx==100) {
			haLlegado=true;
		}else {
			haLlegado=false;
		}
	}
	
	public void irAbajo() {
		if (posy<=coulmnas && posy>0) {
			this.posy-=1;
			this.numPasos++;
		}else {
			System.out.println("el robot no puede seguir por ese camino");
		}
		
		if(posy==100 && posx==100) {
			haLlegado=true;
		}else {
			haLlegado=false;
		}
	}
	
	public void irDerecha() {
		if (posx<filas && posx>=0) {
			this.posx+=1;
			this.numPasos++;
		}else {
			System.out.println("el robot no puede seguir por ese camino");
		}
		
		if(posy==100 && posx==100) {
			haLlegado=true;
		}else {
			haLlegado=false;
		}
	}
	
	public void irIzquierda() {
		if (posx<=filas && posx>0) {
			this.posx-=1;
			this.numPasos++;
		}else {
			System.out.println("el robot no puede seguir por ese camino");
		}
		
		if(posy==100 && posx==100) {
			haLlegado=true;
		}else {
			haLlegado=false;
		}
	}

	@Override
	public String toString() {
		return "Robot [posx=" + posx + ", posy=" + posy + ", haLlegado=" + haLlegado + ", numPasos=" + numPasos + "]";
	}
	
	
	
}

