package day05;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		// kullanicidan 3 basamakli bir sayi alip
		// rakamlar toplamini yazdiran
		// bir program yaziniz
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi girin");
		 int sayi = scan.nextInt();
		 
		 
		
		 int rakamlartoplami=0;
		 
		 
		 
		 int rakam = sayi%10; // Bize birler basamagini verdi
		 rakamlartoplami+=rakam; 
		 sayi/=10;
		 
		 
		 rakam = sayi%10; // Bize birler basamagini verdi
		 rakamlartoplami+=rakam; 
		 sayi/=10;
		 
		 rakam = sayi%10; // Bize birler basamagini verdi
		 rakamlartoplami+=rakam; 
		 sayi/=10;
		 
 System.out.println(rakamlartoplami);
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
