package uygulama;

import java.util.Scanner;

public class TamBolunme21e {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen bir say� giriniz :");
		int sayi = scan.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			
			if(i % 21 == 0) {
				
				System.out.println(i);
			}
			
		}
		
	}
	
	

}
