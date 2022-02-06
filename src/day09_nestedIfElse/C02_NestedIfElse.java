package day09_nestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {

		// Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
		// Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
		// Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
		// Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
		// Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

		Scanner scan = new Scanner(System.in);

		System.out.println("Plase enetr a 4 digit number");

		int sayi = scan.nextInt();

		if (sayi < 1000 || sayi > 9999) {

			System.out.println("You mast a 4 digit number");
		} else { // 4 basamakli sayilari bulacak
			if (sayi % 5 == 0) {

				if (sayi % 10 == 0) {
					System.out.println("5 e bolunebilen cift sayi");
				} else {
					System.out.println("5 e bolunebilen tek sayi");
				}

			} else {

				System.out.println(" lutfen tekrar deneyin");
			}

		}
		scan.close();
	}

}
