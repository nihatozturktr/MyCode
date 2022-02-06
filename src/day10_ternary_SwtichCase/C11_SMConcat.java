package day10_ternary_SwtichCase;

public class C11_SMConcat {

	public static void main(String[] args) {
		// String olarak verilen bir degisken + ile baska bir degiskenle isleme sokulursa
		//Java bunlari yan yana ekler. buna Concanation denir.
		
		
		
		
		
		String isim = "Ali";
		
		String soyisim = "Can";
		
		
		System.out.println(isim + "  "+soyisim);
		
		//yni islemi + sembolu yerine concat()	 ile de yapabiliriz.
		
		
		System.out.println(isim.concat("").concat(soyisim));
		

	}

}
