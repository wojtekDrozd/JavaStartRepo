package javastart;

import java.util.Scanner;

public class TabliceJedno2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me table size");
		int[] tab = new int[input.nextInt()];
		int i = 0;
		while (i < tab.length){
			tab[i] = i+1;
			System.out.println(tab[i]);
			i++;
		}
		input.close();
	}

}
