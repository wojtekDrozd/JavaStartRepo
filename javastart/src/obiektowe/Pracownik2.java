package obiektowe;

public class Pracownik2 {
	String imie;
	String nazwisko;
	int wiek;
	
	// konstruktor ze wszystkimi parametrami obiektu
	public Pracownik2(String im, String nazw, int wi){
		imie = im;
		nazwisko = nazw;
		wiek = wi;
	}
	
//	public Pracownik2(String im, String nazw){
//		imie = im;
//		nazwisko = nazw;
//		wiek = 20;
//	}
//	
//	public Pracownik2(int wi){
//		imie = "Anon";
//		nazwisko = "Anononowicz";
//		wiek = wi;
//	}
	
	// konstruktor z domyœlnymi parametami
	public Pracownik2(){
		imie = "Brak imienia";
		nazwisko = "Brak nazwiska";
		wiek = -1;
	}
	
	public Pracownik2(Pracownik2 prac){
		imie = prac.imie;
		nazwisko = prac.nazwisko;
		wiek = prac.wiek;
	}
}
