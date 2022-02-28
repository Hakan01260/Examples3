package uygulama;

import java.util.Scanner;

public class SesliHarfBulma {

	public static void main(String[] args) {

		String metin;

		char k;
		int i;

		Scanner scan = new Scanner(System.in);

		System.out.print("Metin giriniz: ");
		metin = scan.nextLine();
		
		System.out.print("Sesli harfler :");
		for (i = 0; i < metin.length(); i++) {
			k = metin.charAt(i);
			if (k == 'a' || k == 'e' || k == 'ý' || k == 'i' || k == 'o' || k == 'ö' || k == 'u' || k == 'ü') {
				System.out.print(k + " ,");
			}

		}

	}
}
