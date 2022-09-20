
public class Main {

	public static void main(String[] args) {
		double[] ucretler = { 100, 600, 70, 1000, 45, 23 };
		double toplam = 0;
		double enPahali = ucretler[0];

		for (double number : ucretler) {
			toplam = toplam + number;
			if (enPahali < number) {
				enPahali = number;
			}
		}

		System.out.println("En pahali kulaklıgın fiyati " + enPahali);
		System.out.println("Sitedeki butun kulaklik fiyatlarinin toplami " + toplam);
	}
}
