package miniProjeAsalSayi;

public class Main {
	public static void main(String[] args) {
		
		
		int number = 7;
		int remainder = number %2;
		
		boolean isPrime = true;
		if(number == 1) {
			System.out.println("En k���k asal say� 2'dir");
			return;
		}
		if(number <2) {
			System.out.println("Ge�ersiz Say�");
		}else {
			for(int i = 2; i<number; i++) {
				if(number %i == 0) {
					isPrime = false;
					
				}
			}
				
				if(isPrime) {
					
					System.out.println("Say� Asald�r");
				}else {
					System.out.println("Say� Asal De�ildir");
				}
		}
		
		}
		
	}


