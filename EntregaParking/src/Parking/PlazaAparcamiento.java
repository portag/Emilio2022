package Parking;

import java.util.Objects;

public class PlazaAparcamiento {

	
	private int numPlaza;
	private boolean libre;
	
	
	public PlazaAparcamiento() {
		super();
		this.libre = true;
		this.numPlaza = 1;
	}

	public PlazaAparcamiento(int numPlaza) {
		super();
		this.libre = true;
		this.numPlaza = numPlaza;
	}
	

	/**
	 * @return the libre
	 */
	public boolean isLibre() {
		return libre;
	}


	/**
	 * @param libre the libre to set
	 */
	public void setLibre(boolean libre) {
		this.libre = libre;
	}


	/**
	 * @return the numPlaza
	 */
	public int getNumPlaza() {
		return numPlaza;
	}
	
	public void setNumPlaza(int numPlaza) {
		this.numPlaza = numPlaza;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(numPlaza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlazaAparcamiento other = (PlazaAparcamiento) obj;
		return numPlaza == other.numPlaza;
	}

	@Override
	public String toString() {
		return "PlazaAparcamiento [numPlaza=" + numPlaza + ", libre=" + libre + "]";
	}
	
	
	
	
}
