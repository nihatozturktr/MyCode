package day10_ternary_SwtichCase;

import java.util.Scanner;

public class C03_Ternary {

	public static void main(String[] args) {
		// Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir 1. sayiyi girin");
		
		double sayi =scan.nextDouble();
		
		
		double mutlakdeger = sayi>= 0? sayi: (-1)*sayi;
		
		
		System.out.println("Sayinin mutlak degeri "+ mutlakdeger);
		
		
		
		scan.close();
		
		

	}

}
