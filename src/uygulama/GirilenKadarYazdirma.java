package uygulama;

import java.util.Scanner;

public class GirilenKadarYazdirma {

	public static void main(String[] args) {

		

		Scanner scan = new Scanner(System.in);
		System.out.print("Yazd�rmak istedi�iniz metni giriniz :");	
		String metin = scan.nextLine();
		
		System.out.print("Metin ka� defa yazd�r�ls�n :");
		int sayi = scan.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			
			System.out.println(metin);
			
		}

		


	}

}
