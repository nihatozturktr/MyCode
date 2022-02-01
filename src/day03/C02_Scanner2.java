package day03;

import java.util.Scanner;

public class C02_Scanner2 {

	public static void main(String[] args) {
		/*
		 * Soru ) Kullanicidan ismini alip isminin bas harfini yazdirin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen isminizi yaziniz");

		char ilkharf = scan.next().charAt(0);

		System.out.println("Adinizin ilk harfi " + ilkharf);
		scan.close();

	}

}
