package uygulama;

import java.util.Scanner;

public class Girilen10SayiToplami {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		 
		int toplam = 0;
 
		for (int i=0; i < 10; i++){
 
			System.out.print("Bir say� giriniz: ");
 
			int sayi = scan.nextInt();
 
			toplam += sayi;
 
		}
 
		System.out.println("Say�lar�n Toplam�: "+toplam);
	}

}
