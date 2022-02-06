package day10_ternary_SwtichCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 1. sayiyi girin");
		double sayi1 = scan.nextDouble();

		System.out.println("Lutfen 2. sayiyi girin");

		double sayi2 = scan.nextDouble();

		System.out.println(sayi1 > sayi2 ? sayi1 : sayi2);

		scan.close();

	}

}
