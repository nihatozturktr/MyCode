package day08;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		/*
		 * Kullanicidan iki sayi isteyin, // sayilarin ikisi de pozitif ise sayilarin
		 * toplamini yazdirin, // sayilarin ikisi de negative ise sayilarin carpimini
		 * yazdirin, // sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde
		 * sayilarla islem yapamazsin” yazdirin, // sayilardan sifira esit olan varsa
		 * “sifir carpmaya gore yutan elemandir” yazdirin.
		 * 
		 * sayilarin ikisi de pozitif sayilarin ikisi de negative sayilarin ikisi farkli
		 * isaretlere sayilardan sifira esit
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir sayi girin ENTER tusuna basin saonra ikinci sayiyi girin");

		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();

		if (sayi1 > 0 && sayi2 > 0) {

			System.out.println("Iki sayi da pozitif toplam " + (sayi1 + sayi2));

		} else if (sayi1 < 0 && sayi2 < 0) {

			System.out.println("Iki sayi da negatif carpim= " + (sayi1 + sayi2));

		} else if (sayi1 * sayi2< 0 ) {

			System.out.println("farkli isaretlerde sayilarla islem yapamazsin");

		} else {
			System.out.println("Sifir carpmaya gore yutan elemandir");
		}
		scan.close();
	}

}
