package UnitTest;

import calculator.CalculatorOperations;
import junit.framework.TestCase;
import org.junit.Test;

public class TestCalculatorOperationsDivision extends TestCase{

	@Test
	public void testDivision1() {
		double valueA = 12;
		double valueB = 65;
		assertEquals(0.1846, CalculatorOperations.division(valueA, valueB));
	}
	@Test
	public void testDivision2() {
		double valueA = 0;
		double valueB = 0;
		assertEquals(-0.0, CalculatorOperations.division(valueA, valueB));
	}
	@Test
	public void testDivision3() {
		double valueA = -4;
		double valueB = -9;
		assertEquals(0.4444, CalculatorOperations.division(valueA, valueB));
	}
	@Test
	public void testDivision4() {
		double valueA = 0.22;
		double valueB = 0.46;
		assertEquals(0.4783, CalculatorOperations.division(valueA, valueB));
	}
	@Test
	public void testDivision5() {
		double valueA = 4.12;
		double valueB = 6.15;
		assertEquals(0.6699, CalculatorOperations.division(valueA, valueB));
	}
	@Test
	public void testDivision6() {
		double valueA = 2.69;
		double valueB = -8.09;
		assertEquals(-0.3325, CalculatorOperations.division(valueA, valueB));
	}
	@Test
	public void testDivision7() {
		double valueA = 0.00;
		double valueB = 0.01;
		assertEquals(0.00, CalculatorOperations.division(valueA, valueB));
	}
	@Test
	public void testDivision8() {
		double valueA = 785;
		double valueB = 4;
		assertEquals(196.25, CalculatorOperations.division(valueA, valueB));
	}
	
}
