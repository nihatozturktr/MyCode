package a_intec;

import java.util.Scanner;

public class TijdMatik {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int beginuur;
		int begiminute;
		int stoptuur;
		int stoptminute;
		double salary = 0;
		int werkuur = 0;
		int werkminute = 0;

		int werkdag = 1;
		double dagelijkprice = 0;
		double uurlijkprice = 11.5;

		do {

			System.out.println("Aub " + werkdag + ". werkuur inlogen ");

			System.out.print("beginuur ");
			beginuur = input.nextInt();
			System.out.print("begiminute ");
			begiminute = input.nextInt();
			System.out.print("Stoptnuur ");
			stoptuur = input.nextInt();
			System.out.print("Stoptminute ");
			stoptminute = input.nextInt();

			// baslangic saatine gore 21:30

			werkuur = 24 - beginuur - 1;
			werkminute = 60 - begiminute;

			if (stoptuur < 6) {
				werkuur += stoptuur;
				werkminute += stoptminute;
				// mesela 22:30 de bitirdi
			} else {
				werkuur -= (24 - stoptuur - 1);
				werkminute -= (60 - stoptminute);
			}
			System.out.println(werkminute + " ---");
			if (werkminute >= 60) {
				werkminute -= 60;
				werkuur += 1;

			} else if (werkminute < 0) {

				werkminute = (-1 * werkminute);

				werkuur -= 1;

			}
			System.out.println(werkdag + ". dagelijkse werkuren " + werkuur + " uur " + werkminute + " minute");

			if (werkdag == 6) {
				dagelijkprice = 1.25 * (werkuur * uurlijkprice + werkminute * uurlijkprice / 60);

			} else if (werkdag == 7) {
				dagelijkprice = 1.5 * (werkuur * uurlijkprice + werkminute * uurlijkprice / 60);

			} else {
				dagelijkprice = (werkuur * uurlijkprice + werkminute * uurlijkprice / 60);
			}

			System.out.println(werkdag + ". dagelijkse loon  " + dagelijkprice);

			salary += dagelijkprice;

			dagelijkprice = 0;
			werkuur = 0;
			werkminute = 0;
			System.out.println(werkdag + ". einde dag  salary  " + salary);

			werkdag++;

		} while (werkdag <= 7);

	}

}
