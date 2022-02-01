package day03;

public class C03_AutoWidening {

	public static void main(String[] args) {
		//Otomatik gesisletme
		// esitligin sol tarafi short, sag tarafi byte
		// iki data turu farkli oldugu halde java itiraz etmiyor
		// cunku atama yapilan variable'in data turu (short)
		// atanan degerin veri turunden (byte) buyuk oldugundan sorun olusmaz
		
		
		byte sayi1 =44;
		
		short sayi2= sayi1;
		
		System.out.println(sayi2);
		
		//Esitligin sol tarafi short, sag tarafi byte
		//ik data turu farkli oldugu halde java ititraz etmiyor.
		//Cunku atama yapilan variable'in data turu (short)
		//atatnan degerin veri turunden (byte) buyuk oldugundan sorun olusturmaz.
		
		
		System.out.println("sayi2 : " + sayi2);
		
		
		int sayi3 = 55;
		
		
		
		double sayi4 = sayi3;
		
		
		System.out.println("sayi4 =  " + sayi4);
		
		
		//atanan degerin data turu, deger atanan veriable'nin data turunden kukse
		//java casting'i otomatik yapar.
		//Bu isleme auto widenig denir.
		
		
		
		
		
	}

}
