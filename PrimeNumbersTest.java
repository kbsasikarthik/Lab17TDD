// @ Sasi and Amna
// This TDD has test cases for 1, 2, 3, 10, 20, 100, 257th prime numbers
package lab17TDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeNumbersTest {

	@Test
	void testfor1stprime() {
		//arrange & act
		int result = PrimeNumbers.prime(1);
		
		// assert
		assertEquals(2, result);
	}
	
	@Test
	void testfor2ndprime() {
		//arrange & act
		int result = PrimeNumbers.prime(2);
		
		// assert
		assertEquals(3, result);
	}
	
	@Test
	void testfor3rdprime() {
		//arrange & act
		int result = PrimeNumbers.prime(3);
		
		// assert
		assertEquals(5, result);
	}
	
	@Test
	void testfor10thprime() {
		//arrange & act
		int result = PrimeNumbers.prime(10);
		
		// assert
		assertEquals(29, result);
	}
	
	@Test
	void testfor20thprime() {
		//arrange & act
		int result = PrimeNumbers.prime(20);
		
		// assert
		assertEquals(71, result);
	}
	
	@Test
	void testfor100thprime() {
		//arrange & act
		int result = PrimeNumbers.prime(100);
		
		// assert
		assertEquals(541, result);
	}

	@Test
	void testfor257thprime() {
		//arrange & act
		int result = PrimeNumbers.prime(257);
		
		// assert
		assertEquals(1621, result);
	}

}// end of test class
