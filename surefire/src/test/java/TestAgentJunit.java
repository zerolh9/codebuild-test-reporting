import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestAgentJunit {

//    @BeforeClass
//    public static void m1() {
//        System.out.println("Using @BeforeClass , executed before all test cases ");
//    }
//
//    @Before
//    public void m2() {
//        List<String> myList = new ArrayList<String>();
//        assertEquals("a", myList.get(0));
//        System.out.println("Using @Before annotations ,executed before each test cases ");
//    }
//
//    @AfterClass
//    public static void m3() {
//        System.out.println("Using @AfterClass ,executed after all test cases");
//    }
//
//    @After
//    public void m4() {
//        System.out.println("Using @After ,executed after each test cases");
//    }


    @Test
    public void testPrintMessage() {
        System.out.println("This is a message for test testPrintMessage");
    }

    @Test
    public void testPrintMessageFail() {
        System.out.println("This is a message for test testPrintMessageFail");
        assertEquals("a", "b");
    }

    @Test
    public void testAssertFail() {
        assertEquals("a", "b");
    }

    @Test
    public void testError() {
        List<String> myList = new ArrayList<String>();
        assertEquals("a", myList.get(0));
    }

    @Test @Ignore
    public void testSkip() {
        System.out.println("This is a message for test testSkip");
    }

    @Test @Ignore("This test is ignored")
    public void testSkipWithMessage() {
    }

    @Test(timeout = 10000)
    public void testTimeout() {
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    @Test(timeout = 100)
    public void testTimeoutFail() {
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    @Test
    public void testException() {
        throw new IllegalArgumentException();
    }

    @Test(expected=NumberFormatException.class)
    public void testExpectedException() {
        throw new IllegalArgumentException();
    }
}
