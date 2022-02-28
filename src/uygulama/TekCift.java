package uygulama;

import java.util.Random;

public class TekCift {
	
	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 10; i++) {
			
			Random random = new Random();
			
			int a = random.nextInt();
			
			if(a % 2 == 0) {
				System.out.println(i + ". Sayi çift");
			}
			
			else {
				System.out.println(i + ". Sayi tek");
			}
			
			
		}
		
	}

}
