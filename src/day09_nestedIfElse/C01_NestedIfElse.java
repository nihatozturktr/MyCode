package day09_nestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
		// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		// Kullanicidan bir sifre girmesini isteyin
		// Eger ilk harf buyuk harf ise
		// “A” olup olmadigini kontrol edin.
		// Ilk harf A ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		// Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
		// Ilk harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println(" Lutfen bir sifre giriniz");

		char ilkharf = scan.next().charAt(0); // next secmemizin sebebi ilk once string olacak.

		// ilk harf buyuk mu , kucuk mu bakalim

		if (ilkharf >= 'A' && ilkharf <= 'Z') { // buyuk harf olup olmadigina baktik

			if (ilkharf == 'A') {
				System.out.println("Gecerli sifer");

			} else {
				System.out.println("Gecersiz Sifre");

			}

		} else if ((ilkharf >= 'a') && (ilkharf <= 'z')) { // kucuk haerf olup olmadigina baktik.

			if (ilkharf == 'z') {

				System.out.println("Gecerli sifer");

			} else {

				System.out.println("Gecersiz Sifre");

			}

		} else {// geriye kalan tum karekterler

			System.out.println("Lutfen gecerli karekter girin");

		}
		scan.close();

	}

}
