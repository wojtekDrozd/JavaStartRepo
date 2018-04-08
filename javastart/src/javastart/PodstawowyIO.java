package javastart;

import java.util.Scanner;

public class PodstawowyIO {

	public static void main(String[] args) {
		double a;
		double b;
		
		Scanner odczyt = new Scanner(System.in);
		
		a = odczyt.nextDouble();
		b = odczyt.nextDouble();
	
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		odczyt.close();
	}

}
