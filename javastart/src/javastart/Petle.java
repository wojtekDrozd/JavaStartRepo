package javastart;

import java.util.Scanner;

public class Petle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj liczbê naturaln¹ dodatni¹");
		int number = input.nextInt();
		input.close();
		
		for (int i = number; i>=0; i--){
			System.out.println("Bomba wybuchnie za "+i+"...");
		}
		System.out.println("BUM!");
		
		/*int i = number;
		while (i >= 0){
			System.out.println("Bomba wybuchnie za "+i+"...");
			i--;
		}*/
		
		/*i = number;
		do{
			System.out.println("Bomba wybuchnie za "+i+"...");
			i--;
		}while(i>=0);*/
	}

}
