package day07;

import java.util.Scanner;

public class C09_TekMiCiftMi {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi isteyin tek veya cift oldugunu yazdirin.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		
		int sayi = scan.nextInt();
		
		
		if (sayi%2==0) {
			
			System.out.println("Girdiginiz sayi cift sayidir");
		}
			if(sayi%2!=0) {
				
				System.out.println("Girdiginiz sayi tek sayidir");
			}
			
			scan.close();

	}

}

