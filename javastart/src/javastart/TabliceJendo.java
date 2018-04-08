package javastart;

import java.util.Scanner;

public class TabliceJendo {

	public static void main(String[] args) {
		String[] table = new String[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Give me 5 names!");
		for (int i=0; i<5; i++){
			System.out.println("Give me name "+(i+1));
			table[i]=input.nextLine();
		}
		
		for (int i = 0; i < table.length; i++){
			System.out.println("Witaj "+table[i]);
		}
		input.close();
	}

}
