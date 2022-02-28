package uygulama;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DiziyiAlfebeSirasi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Lüfen sýralamak istediginiz kelimeleri giriniz(Büyük harf kullanmayýnýz) :");
		String dizi = scan.nextLine();

		List<String> liste = new ArrayList<String>();

		String[] arrSplit = dizi.split(" ");
		for (String arrSplit1 : arrSplit) {
			liste.add(arrSplit1);
		}

		Collections.sort(liste);

		for (String sirala : liste) {
			System.out.println(sirala);
		}

	}

}
