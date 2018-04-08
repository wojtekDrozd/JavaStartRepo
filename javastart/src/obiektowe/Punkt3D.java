package obiektowe;

public class Punkt3D extends Punkt2D {
	int z;
	
	public Punkt3D(){
		z = 0;
	}
	
	public Punkt3D(int a, int b, int c){
		x = a;
		y = b;
		z = c;
	}
}
