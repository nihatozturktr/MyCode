package day03;

public class C06_PresIncrementPostIncrement {

	public static void main(String[] args) {
		// preIncrement ve post increment sadece sayi++ veya sayi-- yazimi icin gecerlidir
				int sayi=10;
				
				sayi++;
				sayi++;
				sayi++;
				
				System.out.println(sayi); // 13
				
				
				System.out.println(sayi++); // 13  bu satirda iki islem var
											// bir artirma , bir de yazdirma 
				System.out.println(sayi); // 14
				
				// once artirmak sonra yazdirmak isterseniz ++sayi
				// once yazdirmak sonra artirmak isterseniz sayi++
				
				System.out.println(++sayi); // 15
				
				System.out.println(++sayi);
				System.out.println(++sayi);
				System.out.println(++sayi);

	}

}
