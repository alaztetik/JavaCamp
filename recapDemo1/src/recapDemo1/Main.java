package recapDemo1;

public class Main {
	public static void main(String[] args) {
		int sayi1 = 25;
		int sayi2 = 26;
		int sayi3 = 2;
		if (sayi1 > sayi2 && sayi1 > sayi3) {

			System.out.println("Say� 1 b�y�kt�r");

		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("Say� 2 b�y�kt�r");
		} else if (sayi3 > sayi2 && sayi3 > sayi2) {
			System.out.println("Say� 3 b�y�kt�r");
		} else {
			System.out.println("Say�larda E�it olan var");
		}

		char grade = 'B';
		switch (grade) {

		case 'A':
			System.out.println("M�kemmel Ge�tiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("Orta Ge�tiniz");
			break;
		case 'D':
			System.out.println("Eh i�te");
			break;
		case 'F':
			System.out.println("Malesef Kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz Not Girdiniz");
			break;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <= 10; i += 2) {// tek say�lar
			System.out.println(i);
		}
		for (int i = 2; i <= 10; i += 2) {// �ift say�lar
			System.out.println(i);
		}
		int i = 0;
		while (i < 10) {

			i++;
			System.out.println("While D�ng�s�" + i);

		}

		// Do while
		int j = 0;//�art uymasa bile bir defa �al���r = 100 desek bile
		do {
			System.out.println("Do While D�ng�s�" + j);
			j++;

		} while (j < 10);

	}

}
