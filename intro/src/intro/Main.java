package intro;

public class Main {

	public static void main(String[] args) {

		// camelCase

		// Don't repeat yourself
		String internetSubeButonu = "�nternet �ubesi";
		System.out.println(internetSubeButonu);

		double dolarDun = 8.10;
		double dolarBugun = 8.10;
		int vade = 36;
		boolean dustuMu;

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar D��m��");
			dustuMu = true;
			System.out.println(dustuMu);
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar Artm��");
			dustuMu = false;
			System.out.println(dustuMu);

		}

		else {

			System.out.println("Dolar E�ittir");

		}
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Kamu Kredisi";
		String kredi5 = "Konut Kredi";

		System.out.println(kredi1);

		// basit hali arraya d�n��t�r�lm��

		String[] krediler = { "H�zl� Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "Kamu Kredisi", "Konut Kredi",
				"Yeni Eklenen Kredi" };
		// for each
		for (String kredi : krediler) {
			System.out.println(kredi);

		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		//Referans tip olarak �al���r 100 olarak yazar
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		
		System.out.println(sayilar1[0]);
		
		//int de�ertip gibi �al���r
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		
		sehir1 = sehir2;
		
		sehir2 = "�zmir";
		
		System.out.println(sehir1);
		

	}

}
