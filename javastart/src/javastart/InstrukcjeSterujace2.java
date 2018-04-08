package javastart;

import java.util.Scanner;

public class InstrukcjeSterujace2 {

	public static void main(String[] args) {
		String knownName = "wojtek";
		Scanner odczyt = new Scanner(System.in);
		String userName = odczyt.next();
		
		if (knownName.equals(userName))
			System.out.println("czesc "+userName);
		else
			System.out.println("Przykro mi, ale Cie nie znam");
		
		odczyt.close();
	}

}
