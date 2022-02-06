package day10_ternary_SwtichCase;

import java.util.Scanner;

public class D01_SwitchCase {

	public static void main(String[] args) {

		// Bir atm uygulamasi yapalim.
		// Kullnici para yatirabilsin
		// Kullanici para cekebilsin
		// Kullanici bakiye goruntulesin
		
		
		Scanner scan = new Scanner(System.in);	
		
	int bakiye=1000;
		
		

		

		System.out.println("Islem numrasini giriniz");
		System.out.println("1: Bakiye goruntuleme");
		System.out.println("2: Para cekme");
		System.out.println("3: Para yatirma");
		
	
		
		int islem=scan.nextInt();
		
		
		switch(islem) {
		case 1:
			
			System.out.println("Bakiyeniz  ="+bakiye);
			break;
			
		case 2:
					
			System.out.println("lutfen yatiracaginiz para tutarini giriniz");
			int cekilenbakiye =scan.nextInt();
			bakiye = bakiye-cekilenbakiye;			
			System.out.println("Kalan bakiyeniz +"+ bakiye);
			break;
			
		case 3: 
			System.out.println("lutfen yatiracaginiz para tutarini giriniz");
			int yatirilanbakiye =scan.nextInt();
		
			System.out.println(("Toplam bakiyeniz +")+(bakiye+yatirilanbakiye));
			break;
			
		case 4:
			
			System.out.println("Islem gecersiz");
			break;
			
		
		
		}
		scan.close();

	}

}
