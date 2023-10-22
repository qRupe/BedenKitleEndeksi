package org.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Boyunuzu giriniz(Örn: 1,75): ");
		float boy = scanner.nextFloat();
		System.out.print("Kilonuzu giriniz(Örn: 77,5): ");
		float kilo = scanner.nextFloat();
		
		float bki = kilo / (boy * boy);
		
		System.out.println("Beden kitle endeksiniz: " + bki);

	}

}
