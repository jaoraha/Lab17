package gc.com.primenum;

import java.util.Scanner;

public class PrimeNumApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrimeNum p = new PrimeNum();

		String cont = "y";

		System.out.println("Let's locate some primes!");
		System.out.println();

		System.out.println("This application will find you any prime, in order, from first prime number on.");

		while (cont.equalsIgnoreCase("y")) {
			int n = Validator.getInt(scan, "Which prime number are you looking for? ");
			int x = p.getPrime(n);
			System.out.println();
			System.out.println("The number " + n + " prime is " + x + ".");
			System.out.println();
			cont = Validator.getString(scan, "Do you want to find another prime number? (y/n): ");
		}
		System.out.println("Goodbye!");
	}
}
