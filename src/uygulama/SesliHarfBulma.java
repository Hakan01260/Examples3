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
			if (k == 'a' || k == 'e' || k == '�' || k == 'i' || k == 'o' || k == '�' || k == 'u' || k == '�') {
				System.out.print(k + " ,");
			}

		}

	}
}
