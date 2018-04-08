package javastart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZapisOdczyt {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner odczyt = new Scanner(System.in);
		String imie = odczyt.nextLine();
		odczyt.close();
		
		PrintWriter zapis = new PrintWriter("zapisOdczyt.txt");
		zapis.println(imie);
		zapis.close();
		
		Scanner odczytPlik = new Scanner(new File("zapisOdczyt.txt"));
		System.out.println(odczytPlik.nextLine());
		odczytPlik.close();
	}
}
