package obiektowe;

public class Firma2 {

	public static void main(String[] args) {
		Pracownik2[] pracownicy = new Pracownik2[3];
		pracownicy[0] = new Pracownik2();
		pracownicy[1] = new Pracownik2("Jacek","Placek",18);
		pracownicy[2] = new Pracownik2(pracownicy[1]);
		
		for (Pracownik2 p : pracownicy){
			System.out.println(p.imie+" "+p.nazwisko+" "+p.wiek);
		}
	}

}
