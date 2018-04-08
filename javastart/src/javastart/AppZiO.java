package javastart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppZiO {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner odczyt = new Scanner(new File("C:\\Users\\Wojtek\\Desktop\\skile.txt"));
		String text = odczyt.nextLine();
		System.out.println(text);
		PrintWriter zapis = new PrintWriter("C:\\Users\\Wojtek\\Desktop\\skile2.txt");
		zapis.println("Ala ma kota, a kot ma Alê");
		zapis.close();
		odczyt.close();
	}

}
