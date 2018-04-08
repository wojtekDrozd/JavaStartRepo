package obiektowe;

public class Dodawanie {
	int dodaj(int a, int b){
		System.out.println("Parametry: int int");
		System.out.println("Zwraca: int");
		System.out.println(a+b);
		return a+b;
	}
	double dodaj(double a, double b){
		System.out.println("Parametry: double double");
		System.out.println("Zwraca: double");
		System.out.println(a+b);
		return a+b;
	}
	
	long dodaj(int a, long b){
		System.out.println("Parametry: int long");
		System.out.println("Zwraca: long");
		System.out.println(a+b);
		return a+b;
	}
	
	long dodaj(short a, short b){
		System.out.println("Parametry: short short");
		System.out.println("Zwraca: long");
		System.out.println(a+b);
		return a+b;
	}
}
