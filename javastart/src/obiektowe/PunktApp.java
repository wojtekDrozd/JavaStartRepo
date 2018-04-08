package obiektowe;

public class PunktApp {

	public static void main(String[] args) {
		Punkt punkt = new Punkt();
		punkt.setX(0);
		punkt.setY(0);
		punkt.zwieksz1('x');
		punkt.zmien('y', 15);
		punkt.wartosc();
	}

}
