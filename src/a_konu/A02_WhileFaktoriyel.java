package a_konu;

import java.util.Scanner;

public class A02_WhileFaktoriyel {

	public static void main(String[] args) {
		// Kullanicadan alinan sayinin faktoriyel'ini hesaplama

		System.out.println("Faktoriyel hesaplama programina hosgeldiniz");
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");

		int sayi = scan.nextInt();
		
		int faktoriyel=1;

		while (sayi > 1) {

			faktoriyel = faktoriyel*sayi;
			
			System.out.println("Faktoriyel "+ faktoriyel + " Sayi " +sayi);

			sayi--;

		}
		System.out.println(faktoriyel);
	}

}
