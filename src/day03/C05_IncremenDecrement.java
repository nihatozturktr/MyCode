package day03;

public class C05_IncremenDecrement {

	public static void main(String[] args) {
		// atama islemi olursa sayinin degeri kalici olarak degisir
		// atama islemi olmadan yapilan toplama, cikarma vs islemler sadece o satirda
		// yapilir
		// sayinin degerini kalici olarak degistirmez

		int sayi1 = 10;

		System.out.println(sayi1 += 5);
		// bu islem sayi1'in degerini 5 artirip sayi1'e assign ediyor
		// dolayisiyla sayi1'in degeri kalici olarak degisiyor

		sayi1++;

		// her ne kadar = isareti gorunmese de sayi1++ isleminde assign vardir
		// dolayisyla deger kalici olarak degisir

		System.out.println(sayi1); //16
		

	}

}
