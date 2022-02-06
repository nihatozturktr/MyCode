package day08;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		// Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzun
		// birbirine esitse "Eskanar Ucgen" degilse "Eskenar degil" yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Ucgenin kenar uzunlarini giriniz  her girilen degerden sonra ENTER tusuna basiniz");

		int birincikenar = scan.nextInt();
		int ikicikenar = scan.nextInt();
		int ucuncukenar = scan.nextInt();

		if (birincikenar == ikicikenar &&  ikicikenar == ucuncukenar) {

			System.out.println("Eskenar ucgendir");

		} else {
			System.out.println("Eskenar ucgen degildir");

		}

		scan.close();
	}

}
