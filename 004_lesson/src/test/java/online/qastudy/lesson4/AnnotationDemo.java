package online.qastudy.lesson4;

import org.junit.*;

public class AnnotationDemo {

    @Before
    public void before(){
        System.out.println("before");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }

    @Test(expected=org.junit.ComparisonFailure.class)
//    @Test(expected=junit.framework.ComparisonFailure.class)
    public void test1(){
        System.out.println("test1");
        Assert.assertEquals("Expected value is not equal to actual, ", "expected", "actual");
    }

    @Test(timeout=1000)
    public void test2(){
        System.out.println("test2");
        String expected = "expected";
        String actual = "actual";
        Assert.assertFalse(expected.equals(actual));
        Assert.assertTrue(expected.equals(expected));
        Assert.assertNotNull(actual);
        Assert.assertSame(expected, "expected");
//        while(true);
    }

}
