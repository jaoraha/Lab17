/* Title: Lab No 17
// Author: John Aoraha
 Date: May 20, 2018*/

package gc.com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gc.com.primenum.PrimeNum;

class PrimeNumTest {
	
	@Test
	void test1() {
		PrimeNum obj = new PrimeNum();
		int expected = 2;
		int actual = obj.getPrime(1);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		PrimeNum obj = new PrimeNum();
		int expected = 3;
		int actual = obj.getPrime(2);
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		PrimeNum obj = new PrimeNum();
		int expected = 409;
		int actual = obj.getPrime(80);
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		PrimeNum obj = new PrimeNum();
		int expected = 2017;
		int actual = obj.getPrime(306);
		assertEquals(expected, actual);
	}


}
