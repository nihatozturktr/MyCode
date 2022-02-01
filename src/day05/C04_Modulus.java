package day05;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		// kullanicidan 6 basamakli bir sayi alin
		// ve rakamlar toplamini bulun
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 6 basamakli bir sayi girin");
		
		int sayi= scan.nextInt();
		
		
		int rakamlartoplami =0;
		
		int rakam= sayi%10;		
		rakamlartoplami +=rakam;
		sayi/=10;
		
		rakam= sayi%10;		
		rakamlartoplami +=rakam;
		sayi/=10;
		
		
		rakam= sayi%10;		
		rakamlartoplami +=rakam;
		sayi/=10;
		
		
		
		rakam= sayi%10;		
		rakamlartoplami +=rakam;
		sayi/=10;
		
		 
		rakam= sayi%10;		
		rakamlartoplami +=rakam;
		sayi/=10;
		
		rakam= sayi%10;		
		rakamlartoplami +=rakam;
		sayi/=10;
		
		System.out.println("rakamlar toplami = "+ rakamlartoplami);
		
		
		
		
		
		
		
		
		

	}

}
