package javastart;

public class TabliceWielo {

	public static void main(String[] args) {
		int[][] tab = new int[2][3];
		int count = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = count++;
				System.out.printf("tab[%d][%d]=%d \n",i,j,tab[i][j]);
			}
		}
	}

}
