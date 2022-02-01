package day07;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		/*
		 * 
		 * Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
		 * baslayan gun isimlerini yazdirin Ornek: ilkHarf=P output = “Pazar, Pazartesi
		 * veya Persembe” ilkHarf=S output = “Sali”
		 * 
		 * Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		 * 
		 **
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun isimlerinden birinin ilk harfini yaziniz");

		char ilkHarf = scan.next().toUpperCase().charAt(0);

		if (ilkHarf == 'P') {
			System.out.println("Pazar,Pazartesi veya Persembe ");

		}
		if (ilkHarf == 'S') {

			System.out.println("Sali");
		}
		if (ilkHarf == 'C') {
			System.out.println("Carsamba' Cuma veya Cumartesi");
		}
		if (ilkHarf != 'P' && ilkHarf != 'P' && ilkHarf != 'C') {

			System.out.println("Gecersiz harf girdiniz .Lutfen gun isimlerinden birinin basharfini yazin");
		}

		scan.close();
	}

}
