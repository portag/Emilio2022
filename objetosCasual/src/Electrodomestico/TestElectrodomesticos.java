package Electrodomestico;


import java.util.ArrayList;
import Electrodomestico.Electrodomestico.Color;
import Electrodomestico.Electrodomestico.Eficiencia;

public class TestElectrodomesticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Electrodomestico> electrodomestico = new ArrayList<>();
		
		Lavadora l1 = new Lavadora("Bosh","Gueno",500,35,Eficiencia.A,Color.azul,9);
		Television t1 = new Television();
		electrodomestico.add(t1);
		electrodomestico.add(l1);
		for(Electrodomestico i : electrodomestico) {
			System.out.println(i);
		}
		
		double precio=0;
		for(Electrodomestico i : electrodomestico) {
			precio+=i.precioFinal()
					
					
					
					
					
					
					
					
					
					
					
					;
		}
		System.out.println(precio);
	}

}
