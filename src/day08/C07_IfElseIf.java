package day08;

import java.util.Scanner;

public class C07_IfElseIf {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
		// Not’u harf sistemine cevirip yazdirin.
		// 50’den kucukse “D”,
		// 50 ye esit ve buyuk ve 60 dan kucuk ise “C”,
		// 60 a esit ve buyuk ve 80 dan kucuk ise “B”,
		// 80 ve uzerinde ise “A”

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz");

		int not = scan.nextInt();

		if (not < 0 || not > 100) {

			System.out.println("Lutfen gecerli bir not giriniz");

		}

		else if (not < 50) {
			System.out.println("Notunuz " + not + " ve D'dir");
		} else if (not < 60) {
			System.out.println("Notunuz " + not + "ve  C'dir");

		} else if ( not < 80) {

			System.out.println("Notunuz " + not + " ve B'dir");

		} else {
			System.out.println("Notunuz " + not + "ve  A'dir");
		}
		scan.close();
	}

}
