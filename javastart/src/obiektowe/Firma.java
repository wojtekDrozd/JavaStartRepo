package obiektowe;

public class Firma {

	public static void main(String[] args) {
		Pracownik[] pracownicy = new Pracownik[3];
		String[] imiona = { "Janek", "Marek", "Janusz" };
		String[] nazwiska = { "Kowalski", "Nowak", "Kaleson" };
		int[] wiek = { 22, 45, 61 };

		for (int i = 0; i < pracownicy.length; i++) {
			pracownicy[i] = new Pracownik();
			pracownicy[i].setImie(imiona[i]);
			pracownicy[i].setNazwisko(nazwiska[i]);
			pracownicy[i].setWiek(wiek[i]);
			System.out.println(
					pracownicy[i].getImie() + " " + pracownicy[i].getNazwisko() + " " + pracownicy[i].getWiek());
		}
	}

}
