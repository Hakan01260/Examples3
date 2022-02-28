package uygulama;

import java.util.ArrayList;
import java.util.List;

public class AsalSayiListeleme {

	public static void main(String[] args) {

		int sayac;
		int sayi = 1000000;

		List<Integer> asalsayi = new ArrayList<>();

		while (sayi > 2) {

			sayac = 0;
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					sayac++;
				}
			}
			if (sayac == 0) {
				asalsayi.add(sayi);
			}
			sayi--;
		}
		asalsayi.add(2);

		for (Integer sayilar : asalsayi) {
			System.out.print(sayilar + ", ");
		}

	}

}
