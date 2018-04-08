package javastart;

public class Operatory {

	public static void main(String[] args) {
		double a = 5.0;
		double b = 3.0;
		double c = 4.0;

		System.out.println((a + b) * c);
		System.out.println(a - b / c);

		a++;
		b++;
		c++;

		System.out.println((a + b) > c);
		System.out.println((a == b));

	}

}
