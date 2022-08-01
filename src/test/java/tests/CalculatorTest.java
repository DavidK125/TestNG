package tests;

import org.testng.annotations.*;
import org.testng.asserts.Assertion;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {

    @BeforeClass
    public void init(){
        System.out.println("Run once before asstest");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("Run once after all test");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Run once before each test");
    }

    @AfterMethod
    public void terDown(){
        System.out.println("Run once after each test");
    }

    @Test
    public void testOnePlusFive(){
        assertEquals(1+5,6);
        System.out.println("test one is running");

    }
    @Test
    public void testTenMinusFour(){
        assertEquals(10-4,6);
        System.out.println("test two is running");
    }


}
