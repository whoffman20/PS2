package myInteger;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyInteger {

	@Test
	public void TestMyInteger() {
		MyInteger i1 = new MyInteger(17);
		boolean dExpectedisOdd = true;
		boolean dExpectedisEven = false;
		boolean dExpectedisPrime = true;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(17), dExpectedisEven);
		assertEquals(i1.isOdd(17), dExpectedisOdd);
		assertEquals(i1.isPrime(17), dExpectedisPrime);

		assertEquals(MyInteger.isEven(17), dExpectedisEven);
		assertEquals(MyInteger.isOdd(17), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(17), dExpectedisPrime);

		assertEquals(i1.equals(17), true);
		assertEquals(i1.equals(i1), true);
	}

	@Test
	public void TestMyInteger2() {
		MyInteger i1 = new MyInteger(6);
		boolean dExpectedisOdd = false;
		boolean dExpectedisEven = true;
		boolean dExpectedisPrime = false;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(6), dExpectedisEven);
		assertEquals(i1.isOdd(6), dExpectedisOdd);
		assertEquals(i1.isPrime(6), dExpectedisPrime);

		assertEquals(MyInteger.isEven(6), dExpectedisEven);
		assertEquals(MyInteger.isOdd(6), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(6), dExpectedisPrime);

		assertEquals(i1.equals(6), true);
		assertEquals(i1.equals(i1), true);
	}

	@Test
	public void TestMyInteger3() {
		MyInteger i1 = new MyInteger(9);
		boolean dExpectedisOdd = true;
		boolean dExpectedisEven = false;
		boolean dExpectedisPrime = false;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(9), dExpectedisEven);
		assertEquals(i1.isOdd(9), dExpectedisOdd);
		assertEquals(i1.isPrime(9), dExpectedisPrime);

		assertEquals(MyInteger.isEven(9), dExpectedisEven);
		assertEquals(MyInteger.isOdd(9), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(9), dExpectedisPrime);

		assertEquals(i1.equals(9), true);
		assertEquals(i1.equals(i1), true);
	}

	@Test
	public void TestMyInteger4() {
		MyInteger i1 = new MyInteger(21);
		boolean dExpectedisOdd = true;
		boolean dExpectedisEven = false;
		boolean dExpectedisPrime = false;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(21), dExpectedisEven);
		assertEquals(i1.isOdd(21), dExpectedisOdd);
		assertEquals(i1.isPrime(21), dExpectedisPrime);

		assertEquals(MyInteger.isEven(21), dExpectedisEven);
		assertEquals(MyInteger.isOdd(21), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(21), dExpectedisPrime);

		assertEquals(i1.equals(21), true);
		assertEquals(i1.equals(i1), true);
	}
	@Test
	public void TestMyInteger5() {
		MyInteger i1 = new MyInteger(2);
		boolean dExpectedisOdd = false;
		boolean dExpectedisEven = true;
		boolean dExpectedisPrime = true;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(2), dExpectedisEven);
		assertEquals(i1.isOdd(2), dExpectedisOdd);
		assertEquals(i1.isPrime(2), dExpectedisPrime);

		assertEquals(MyInteger.isEven(2), dExpectedisEven);
		assertEquals(MyInteger.isOdd(2), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(2), dExpectedisPrime);

		assertEquals(i1.equals(2), true);
		assertEquals(i1.equals(i1), true);
	}
	@Test
	public void TestMyInteger6() {
		MyInteger i1 = new MyInteger(3);
		boolean dExpectedisOdd = true;
		boolean dExpectedisEven = false;
		boolean dExpectedisPrime = true;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(3), dExpectedisEven);
		assertEquals(i1.isOdd(3), dExpectedisOdd);
		assertEquals(i1.isPrime(3), dExpectedisPrime);

		assertEquals(MyInteger.isEven(3), dExpectedisEven);
		assertEquals(MyInteger.isOdd(3), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(3), dExpectedisPrime);

		assertEquals(i1.equals(3), true);
		assertEquals(i1.equals(i1), true);
	}
	@Test
	public void TestMyInteger7() {
		MyInteger i1 = new MyInteger(1);
		boolean dExpectedisOdd = true;
		boolean dExpectedisEven = false;
		boolean dExpectedisPrime = true;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(1), dExpectedisEven);
		assertEquals(i1.isOdd(1), dExpectedisOdd);
		assertEquals(i1.isPrime(1), dExpectedisPrime);

		assertEquals(MyInteger.isEven(1), dExpectedisEven);
		assertEquals(MyInteger.isOdd(1), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(1), dExpectedisPrime);

		assertEquals(i1.equals(1), true);
		assertEquals(i1.equals(i1), true);
}
	@Test
	public void TestMyInteger8() {
		MyInteger i1 = new MyInteger(997);
		boolean dExpectedisOdd = true;
		boolean dExpectedisEven = false;
		boolean dExpectedisPrime = true;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(997), dExpectedisEven);
		assertEquals(i1.isOdd(997), dExpectedisOdd);
		assertEquals(i1.isPrime(997), dExpectedisPrime);

		assertEquals(MyInteger.isEven(997), dExpectedisEven);
		assertEquals(MyInteger.isOdd(997), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(997), dExpectedisPrime);

		assertEquals(i1.equals(997), true);
		assertEquals(i1.equals(i1), true);
}
	@Test
	public void TestMyInteger9() {
		MyInteger i1 = new MyInteger(10000);
		boolean dExpectedisOdd = false;
		boolean dExpectedisEven = true;
		boolean dExpectedisPrime = false;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(10000), dExpectedisEven);
		assertEquals(i1.isOdd(10000), dExpectedisOdd);
		assertEquals(i1.isPrime(10000), dExpectedisPrime);

		assertEquals(MyInteger.isEven(10000), dExpectedisEven);
		assertEquals(MyInteger.isOdd(10000), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(10000), dExpectedisPrime);

		assertEquals(i1.equals(10000), true);
		assertEquals(i1.equals(i1), true);
}
	@Test
	public void TestMyInteger10() {
		MyInteger i1 = new MyInteger(25);
		boolean dExpectedisOdd = true;
		boolean dExpectedisEven = false;
		boolean dExpectedisPrime = false;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(25), dExpectedisEven);
		assertEquals(i1.isOdd(25), dExpectedisOdd);
		assertEquals(i1.isPrime(25), dExpectedisPrime);

		assertEquals(MyInteger.isEven(25), dExpectedisEven);
		assertEquals(MyInteger.isOdd(25), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(25), dExpectedisPrime);

		assertEquals(i1.equals(25), true);
		assertEquals(i1.equals(i1), true);
}
	@Test
	public void TestMyInteger11() {
		MyInteger i1 = new MyInteger(15);
		boolean dExpectedisOdd = true;
		boolean dExpectedisEven = false;
		boolean dExpectedisPrime = false;

		assertEquals(i1.isEven(), dExpectedisEven);
		assertEquals(i1.isOdd(), dExpectedisOdd);
		assertEquals(i1.isPrime(), dExpectedisPrime);

		assertEquals(i1.isEven(15), dExpectedisEven);
		assertEquals(i1.isOdd(15), dExpectedisOdd);
		assertEquals(i1.isPrime(15), dExpectedisPrime);

		assertEquals(MyInteger.isEven(15), dExpectedisEven);
		assertEquals(MyInteger.isOdd(15), dExpectedisOdd);
		assertEquals(MyInteger.isPrime(15), dExpectedisPrime);

		assertEquals(i1.equals(15), true);
		assertEquals(i1.equals(i1), true);
}
}
