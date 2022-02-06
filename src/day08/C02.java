package day08;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		// Kullaniciya yasini sorun' eger yas 65 den kucuk ise "emekli olamassin,
		// calismalisin" , 65 den buykse "Emekli olabilirsin" yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen yasinizi giriniz");

		int yas = scan.nextInt();

		if (yas >= 0 && yas < 65) {

			System.out.println("Emekli olamassin, calismalisin");

		} else {
			System.out.println("Emekli olabilirsin");

		}
		scan.close();
	}

}
