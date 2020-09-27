package online.qastudy.lesson4;

import org.junit.*;

import java.math.BigDecimal;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new CalculatorImpl();
    }

    @Test
    public void testCanGetASum() {
        int digit1 = 2;
        int digit2 = 24;
        int expectedResult = 26;
        int actualResult = calculator.add(digit1, digit2);
        Assert.assertEquals("If fail then method add is broken.", actualResult, expectedResult);
    }

    @Test
    public void testCanSubtractDigits() {
        Assert.assertEquals(2, calculator.subtract(4, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void canGetAnArithmeticalException() {
        Assert.assertEquals(10, calculator.divide(2, 0));
    }

    @Test
    public void testCanMultiplyValues() {
        int operant1 = 20;
        int operant2 = 3;
        int actualResult = calculator.multiply(operant1, operant2);
        Assert.assertEquals("Verify that 20 * 3= 60 if broken then multiply is broken.",
                60, actualResult);
    }

    @Test
    public void testCanDestroyMultiply(){
        int operant1 = 2147483647;
        int operant2 = 2;
        int actualResult = calculator.multiply(operant1, operant2);
        Assert.assertEquals("Verify that 2147483647 * 2 = ?",
                new BigDecimal("4294967294"), actualResult);
    }
}
