package main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	/*
	 * Soru İşareti Operatörü 
	 * |-----------------------|
	 * İfade1 ? İfade2:İfade3;
	 * gosterimi yukarıdaki gibidir.
	 */
	public static void main(String[] args) throws IOException {

		Scanner giris = new Scanner(System.in);
		String sonuc;
		double not;
		System.out.println("Sinav notunu (0-100) giriniz: ");
		not = giris.nextDouble();
		sonuc = not >= 50 ? "Basarili" : "Basarisiz";
		System.out.println("Sonuc: " + sonuc);
	}

}
