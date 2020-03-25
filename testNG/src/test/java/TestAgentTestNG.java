import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class TestAgentTestNG {

    @Test
    public void testPrintMessage() {
        System.out.println("This is a message for test testPrintMessage");
    }

    @Test
    public void testPrintMessageFail() {
        System.out.println("This is a message for test testPrintMessageFail");
        Assert.assertEquals("a", "b");
    }

    @Test
    public void testAssertFail() {
        Assert.assertEquals("a", "b");
    }

    @Test
    public void testError() {
        List<String> myList = new ArrayList<String>();
        Assert.assertEquals("a", myList.get(0));
    }

    @Test(enabled = false) 
    public void testSkip() {
        System.out.println("This is a message for test testSkip");
    }

    @Test(timeOut = 10000)
    public void testTimeout() {
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    @Test(timeOut = 100)
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

    @Test(expectedExceptions=IllegalArgumentException.class)
    public void testExpectedException() {
        throw new IllegalArgumentException();
    }

    @Test(expectedExceptions=NumberFormatException.class)
    public void testExpectedExceptionFail() {
        throw new IllegalArgumentException();
    }
}
