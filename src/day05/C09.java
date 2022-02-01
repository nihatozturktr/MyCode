package day05;

import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		
		
		/*
		 * Kullanicidan 5 basamakli bir sayi al 
		 * Rakamlari toplamini bulan uygulamayi yazin.
		 * 
		 */
		
		
		
		System.out.println("Lutfen bir sayi girin");
		
		int sayi = scan.nextInt();
				
		int rakamlartoplami=0;
		
		
		int rakam = sayi%10;
		rakamlartoplami +=rakam;
		sayi/=10;
		
		
		rakam = sayi%10;
		rakamlartoplami +=rakam;
		sayi/=10;
		
		
		rakam = sayi%10;
		rakamlartoplami +=rakam;
		sayi/=10;
		
		rakam = sayi%10;
		rakamlartoplami +=rakam;
		sayi/=10;
		
		rakam = sayi%10;
		rakamlartoplami +=rakam;
		sayi/=10;
		
		System.out.println("Raklamrin toplmi =" + rakamlartoplami );
		
		
		

		
		
		
		
		
		
		
		
	}

}
