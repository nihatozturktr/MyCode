package day10_ternary_SwtichCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin tek veya cift oldugunu yazdirin.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir 1. sayiyi girin");
		
		int sayi =scan.nextInt();
		
				
		
		
		System.out.println(sayi %2 ==0 ?"cift" :"tek");
		
scan.close();
	}

}
