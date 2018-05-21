package gc.com.primenum;

public class PrimeNum {

	public int getPrime(int n) {

		int i = 2;
		int x = 2;

		for (i = 2, x = 2; n > 0; i++) {
			for (x = 2; x < i; x++) {
				if (i % x == 0) {
					break;
				}
			}
			if (x == i) {
				n--;
			}
		}
		return x;

	}

}
