package day06;

public class C01 {

	public static void main(String[] args) {
		int sayi1 = 10;
		Integer sayi2 = 20;
		// sayi1. yazdigimizda hic bir method cikmaz, cunku sayi1 int 'dir yani
		// primitive dir
		// sayi2. yazdigimizda ise bircok method geliyor, cunku sayi2 Integer'dir yani
		// wrapper class'dir
		
		String tel1 = "3578987";
		String tel2 = "3245434";
		
		System.out.println(tel1+tel2); //35789873245434
		
		
		
		//bu sayilari toplamak istersek
		
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		//String caddeNo= "B203";
		String caddeNo="203";
		String sokakNo= "1564";
		
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo)); 
		// Integer.valueOf(String numerik ifade) method'u string olarak kaydedilmis 
		// numerik ifadeleri sayiya cevirir
		// ancak String ifadede numerik olmayan bir karakter olursa
		// Java NumberFormatException hatasi verir ve calismayi durdurur
		
		// stops execution
		
		System.out.println("Hello world");
		

	}

}
