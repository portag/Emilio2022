package Robot;

public class TestRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot r1 = new Robot(0,0,false,0);
		
		
		r1.irIzquierda();
		r1.irAbajo();
		r1.irArriba();
		r1.irArriba();
		System.out.println(r1);
		
	}

}
