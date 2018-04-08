package obiektowe;

public class Punkt {
	int x;
	int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void zwieksz1(char a) {
		if (a == 'x') {
			x++;
		}
		if (a == 'y') {
			y++;
		}
	}

	void zmien(char a, int i) {
		if (a == 'x') {
			x += i;
		}
		if (a == 'y') {
			y += i;
		}
	}

	void wartosc() {
		System.out.println("X = " + x + ", Y = " + y);
	}

}
