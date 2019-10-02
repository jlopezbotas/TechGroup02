package UnitTest;

import calculator.CalculatorOperations;
import junit.framework.TestCase;
import org.junit.Test;

public class TestCalculatorOperationsSubstraction extends TestCase{

	@Test
	public void testSubstraction1() {
		double valueA = 12;
		double valueB = 65;
		assertEquals(-53.0, CalculatorOperations.subtraction(valueA, valueB));
	}
	@Test
	public void testSubstraction2() {
		double valueA = 0;
		double valueB = 0;
		assertEquals(0.0, CalculatorOperations.subtraction(valueA, valueB));
	}
	@Test
	public void testSubstraction3() {
		double valueA = -4;
		double valueB = -9;
		assertEquals(5.0, CalculatorOperations.subtraction(valueA, valueB));
	}
	@Test
	public void testSubstraction4() {
		double valueA = 0.22;
		double valueB = 0.46;
		assertEquals(-0.24, CalculatorOperations.subtraction(valueA, valueB));
	}
	@Test
	public void testSubstraction5() {
		double valueA = 4.12;
		double valueB = 6.15;
		assertEquals(-2.03, CalculatorOperations.subtraction(valueA, valueB));
	}
	@Test
	public void testSubstraction6() {
		double valueA = -2.69;
		double valueB = -8.09;
		assertEquals(5.4, CalculatorOperations.subtraction(valueA, valueB));
	}
	@Test
	public void testSubstraction7() {
		double valueA = 0.00;
		double valueB = 0.01;
		assertEquals(-0.01, CalculatorOperations.subtraction(valueA, valueB));
	}
	@Test
	public void testSubstraction8() {
		double valueA = 7421;
		double valueB = 3564;
		assertEquals(3857.0, CalculatorOperations.subtraction(valueA, valueB));
	}
	
}
