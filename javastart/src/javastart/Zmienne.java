package javastart;

public class Zmienne {

	public static void main(String[] args) {
		final String TEKST_1 = "babcia";
		final String TEKST_2 = "dziadek";
		final String TEKST_3 = "ciotka";
		
		String tekst4 = TEKST_1+TEKST_2+TEKST_3;
		
		System.out.println(tekst4);
		System.out.println(tekst4.substring(0, 26));
	}

}
