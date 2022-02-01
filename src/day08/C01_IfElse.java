package day08;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// Kullanicidan bir karakter girmesini isteyin ve girilen karekterlerin harf olup olmadigini yazdirin.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir karekter girin");
		
		char karekter = scan.next().charAt(0);
		
		
		if((karekter >= 'A' && karekter <='Z' ) ||(karekter >= 'a' && karekter <='z')) {
			
			System.out.println("Girdiginiz " + karekter+ " bir harftir");
		} else {
			
			System.out.println("Girdiginiz " + karekter+ " bir harf degildir");
			
		}

	}

}
