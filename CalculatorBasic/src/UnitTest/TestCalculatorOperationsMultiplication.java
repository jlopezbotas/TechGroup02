package UnitTest;

import calculator.CalculatorOperations;
import junit.framework.TestCase;
import org.junit.Test;

public class TestCalculatorOperationsMultiplication extends TestCase{

	@Test
	public void testMultiplication1() {
		double valueA = 41;
		double valueB = 36;
		assertEquals(1476.0, CalculatorOperations.multiplication(valueA, valueB));
	}
	@Test
	public void testMultiplication2() {
		double valueA = 0;
		double valueB = 0;
		assertEquals(0.0, CalculatorOperations.multiplication(valueA, valueB));
	}
	@Test
	public void testMultiplication3() {
		double valueA = -7;
		double valueB = -2;
		assertEquals(14.0, CalculatorOperations.multiplication(valueA, valueB));
	}
	@Test
	public void testMultiplication4() {
		double valueA = 0.92;
		double valueB = 0.26;
		assertEquals(0.2392, CalculatorOperations.multiplication(valueA, valueB));
	}
	@Test
	public void testMultiplication5() {
		double valueA = 4.12;
		double valueB = 6.15;
		assertEquals(25.338, CalculatorOperations.multiplication(valueA, valueB));
	}
	@Test
	public void testMultiplication6() {
		double valueA = 2.69;
		double valueB = -8.09;
		assertEquals(-21.7621, CalculatorOperations.multiplication(valueA, valueB));
	}
	@Test
	public void testMultiplication7() {
		double valueA = 0.00;
		double valueB = 0.01;
		assertEquals(0.00, CalculatorOperations.multiplication(valueA, valueB));
	}
	@Test
	public void testMultiplication8() {
		double valueA = 123;
		double valueB = 22;
		assertEquals(2706.0, CalculatorOperations.multiplication(valueA, valueB));
	}
	
}
