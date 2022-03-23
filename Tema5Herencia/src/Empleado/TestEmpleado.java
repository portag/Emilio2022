package Empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//con plus
		Repartidor r1 = new Repartidor("pepe",20,2000,"zona 3",false);
		//sin plus
		Repartidor r2 = new Repartidor("juan",27,2100,"zona 3",false);
		//plus x2
		Repartidor r3 = new Repartidor("alvaro",20,2010,"zona 3",true);
		
		
		//con plus
		Comercial c1 = new Comercial("arturo",31,2500,250);
		//sin plus
		Comercial c2 = new Comercial("javier",23,2200,250);
		
		
		//sin plus
		MozoAlmacen m1 = new MozoAlmacen("emilio",40,1400,1,false);
		//plus
		MozoAlmacen m2 = new MozoAlmacen("david",40,1400,2,false);
		MozoAlmacen m3 = new MozoAlmacen("alex",20,1400,3,false);
		//plus x2
		MozoAlmacen m4 = new MozoAlmacen("jose",40,1400,2,true);
		MozoAlmacen m5 = new MozoAlmacen("felipe",20,1400,1,true);
		MozoAlmacen m6 = new MozoAlmacen("pedro",20,1400,3,true);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		
		
	}

}
