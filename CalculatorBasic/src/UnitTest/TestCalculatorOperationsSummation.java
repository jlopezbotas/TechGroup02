package UnitTest;

import calculator.CalculatorOperations;
import junit.framework.TestCase;
import org.junit.Test;

public class TestCalculatorOperationsSummation extends TestCase{

	@Test
	public void testSuma1() {
		double valueA = 12;
		double valueB = 65;
		assertEquals(77.0, CalculatorOperations.add(valueA, valueB));
	}
	@Test
	public void testSuma2() {
		double valueA = 0;
		double valueB = 0;
		assertEquals(0.0, CalculatorOperations.add(valueA, valueB));
	}
	@Test
	public void testSuma3() {
		double valueA = -4;
		double valueB = -9;
		assertEquals(-13.0, CalculatorOperations.add(valueA, valueB));
	}
	@Test
	public void testSuma4() {
		double valueA = 0.22;
		double valueB = 0.46;
		assertEquals(0.68, CalculatorOperations.add(valueA, valueB));
	}
	@Test
	public void testSuma5() {
		double valueA = 4.12;
		double valueB = 6.15;
		assertEquals(10.27, CalculatorOperations.add(valueA, valueB));
	}
	@Test
	public void testSuma6() {
		double valueA = -2.69;
		double valueB = -8.09;
		assertEquals(-10.78, CalculatorOperations.add(valueA, valueB));
	}
	@Test
	public void testSuma7() {
		double valueA = 0.00;
		double valueB = 0.01;
		assertEquals(0.01, CalculatorOperations.add(valueA, valueB));
	}
	@Test
	public void testSuma8() {
		double valueA = 3421;
		double valueB = 7564;
		assertEquals(10985.0, CalculatorOperations.add(valueA, valueB));
	}
	
}
