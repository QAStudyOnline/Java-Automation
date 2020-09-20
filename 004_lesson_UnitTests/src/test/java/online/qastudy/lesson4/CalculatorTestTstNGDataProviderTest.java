package online.qastudy.lesson4;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class CalculatorTestTstNGDataProviderTest {
    private static Calculator calculate = null;

    @BeforeClass
    public static void setup() {
        calculate = new CalculatorImpl();
    }

    @DataProvider
    public static Object[][] dataProviderDivide() {
        return new Object[][]{
                {10, 2, 5},
                {1, 1, 2},
                {25, 3, 8}
        };
    }

    @Test
    @UseDataProvider("dataProviderDivide")
    public void testDivide(int a, int b, int expected) {
        assertEquals(expected, calculate.divide(a, b));
    }
}
