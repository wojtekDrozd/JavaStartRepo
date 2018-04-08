package obiektowe;

public class TestPunkt {

	public static void main(String[] args) {
		
		Punkt2D punkt2D = new Punkt2D();
		System.out.println(punkt2D.x+" "+punkt2D.y);
		
		punkt2D = new Punkt2D(10,15);
		System.out.println(punkt2D.x+" "+punkt2D.y);
		
		Punkt3D punkt3D = new Punkt3D();
		System.out.println(punkt3D.x+" "+punkt3D.y+" "+punkt3D.z);
		
		punkt3D = new Punkt3D(2,3,5);
		System.out.println(punkt3D.x+" "+punkt3D.y+" "+punkt3D.z);
	}

}
