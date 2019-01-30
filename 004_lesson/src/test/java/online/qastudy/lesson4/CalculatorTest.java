package online.qastudy.lesson4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new CalculatorImpl();
    }

    @Test
    public void canGetASum() {
        int digit1 = 2;
        int digit2 = 24;
        int expectedResult = 26;
        int actualResult = calculator.add(digit1, digit2);
        Assert.assertEquals("If fail then method add is broken.", actualResult,expectedResult);
    }

    @Test
    public void canSubsctructDigits(){
        Assert.assertEquals(2,calculator.subtract(4,2));
    }

    @Test(expected = ArithmeticException.class)
    public void canGetAnArithmeticalException(){
        Assert.assertEquals(10,calculator.divide(2,0));
    }
}
