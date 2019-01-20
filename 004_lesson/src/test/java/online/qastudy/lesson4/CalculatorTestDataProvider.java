package online.qastudy.lesson4;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTestDataProvider {
    private static Calculator calculate = null;
    private int numberA;
    private int numberB;
    private int expected;

    public CalculatorTestDataProvider(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    @BeforeClass
    public static void setup() {
        calculate = new CalculatorImpl();
    }

    @Parameterized.Parameters(name = "{index}: canDivideTwoNumbers({0}/{1})={2}")
    public static Iterable<Object[]> dataProviderForDivideMethodTests() {
        return Arrays.asList(
                new Object[][]{{1, 1, 1}, {2, 2, 1}, {8, 2, 4}, {4, 5, 0}}
        );
    }

    @Test
    public void canDivideTwoNumbers() {
        assertEquals(expected, calculate.divide(numberA, numberB));
    }


    @Test(expected = ArithmeticException.class)
    public void canVerifyException() {
        assertEquals(0, calculate.divide(1, 0));
    }
}
