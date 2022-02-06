package day10_ternary_SwtichCase;

import java.util.Scanner;

public class C09_SwitchCase {

	public static void main(String[] args) {

		// harf olarak girilen notu rakama cevirin
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen harf notunuzu buyuk harf giriniz");

		char not = scan.next().charAt(0);
		
		
		switch (not) {

		case 'A':
			System.out.println("85 - 100 arasi");
			break;
		case 'B':
			System.out.println("60 - 85 arasi");
			break;
		case 'C':
			System.out.println("50 - 60 arasi");
			break;
		case 'D':
			System.out.println("50'den dusuk");
			break;
		default:
			System.out.println("gecersiz not");

		}
scan.close();
	}

}
