package Parking;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Parking {

	
	
	ArrayList<Vehiculo> vehiculo;
	ArrayList<PlazaAparcamiento> plaza;
	private int plazasDisponibles;
	private float saldoAcumulado;
	public static final float preciomin = (float) 0.04;
	public static final float preciometro = (float) 0.2;
	
	
	public Parking() {
		super();
		this.vehiculo = new ArrayList<>();
		this.plaza = new ArrayList<>();
		for ( int i = 1; i <= 100; i++) {
			this.plaza.add(new PlazaAparcamiento(i));
		}
		this.plazasDisponibles = 100;
		this.saldoAcumulado = 0;
	}


	/**
	 * @return the plazasDisponibles
	 */
	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}


	/**
	 * @return the vehiculo
	 */
	public ArrayList<Vehiculo> getVehiculo() {
		return vehiculo;
	}


	/**
	 * @return the saldoAcumulado
	 */
	public float getSaldoAcumulado() {
		return saldoAcumulado;
	}
	
	
	public void imprimeParking() {
		for(PlazaAparcamiento pa : plaza) {
				System.out.println("Plaza numero "+pa.getNumPlaza());
				if(pa.isLibre()) {
					System.out.println("Plaza libre");
				}else {
					for(Vehiculo v : this.vehiculo) {
						if(v.getPlaza().equals(pa)) {
							System.out.println("Plaza ocupada por el vehiculo "+v.getMatricula()+" que ha estado aparcado durante "
									+v.calcularMinutos()+" minutos con un coste de "+v.calcularImporte());
						}
					}
				}
		}
	}
	
	
	public String registrarEntradaVehiculo(Vehiculo v) {
		
		if(this.plazasDisponibles>0) {
			for(PlazaAparcamiento pa : plaza) {
				if(pa.isLibre()) {
					pa.setLibre(false);
					v.setPlaza(pa);
					this.vehiculo.add(v);
					this.plazasDisponibles--;
					return "El vehiculo "+v.getMarca()+" esta aparcado en la plaza "+pa.getNumPlaza();
				}
			}	
		}else {
			return "No quedan plazas disponibles";
		}
		return "";
	}
	
	
	public String registrarSalidaVehiculo(Vehiculo v) {
		boolean encontrado=false;
		Vehiculo vehi = null;
		for(Vehiculo ve: vehiculo) {
			if (ve.equals(v)) {
				encontrado = true;
				vehi = ve;
			}
		}
		
		if (!encontrado) {
			return "El coche no esta en el parking";
		} else {
			long minutos = vehi.calcularMinutos();
			this.saldoAcumulado+= vehi.calcularImporte();
			vehi.getPlaza().setLibre(true);
			this.plazasDisponibles++;
			this.vehiculo.remove(vehi);
			return "Vehículo matrícula " + vehi.getMatricula() + " entró en " + vehi.getFechaEntada() + 
					" salió a " + LocalDateTime.now() + " estando " + minutos + " costando " + vehi.calcularImporte() + "€";
		}
	}
	
	
	
	
	
	
	
	
}
