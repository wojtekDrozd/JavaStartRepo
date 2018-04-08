package javastart;

import java.util.Scanner;

public class InstrukcjeSterujace {

	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in);
		int a = odczyt.nextInt();
		int b = odczyt.nextInt();
		
		if (a>b)
			System.out.println("pierwsza wieksza");
		else if (a == b)
			System.out.println("liczby sa rowne");
		else
			System.out.println("druga wieksza");
		
		odczyt.close();
	}

}
