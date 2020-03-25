import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

  String message = "Robert";    
  MessageUtil messageUtil = new MessageUtil(message);
   
  @Test
  public void testPrintMessage() {      
    System.out.println("Inside testPrintMessage()");     
    assertEquals(message,messageUtil.printMessage());
  }

  @Test
  public void testSalutationMessage() {
    System.out.println("Inside testSalutationMessage()");
    message = "Hi!" + "Robert";
    assertEquals(message,messageUtil.salutationMessage());
  }
  
  @Test
  public void testFail() {
    assertEquals("a", "b");
  }

  @Test
  public void testAnotherFail() {
    List<String> myList = new ArrayList<String>();
    assertEquals("a", myList.get(0));
  }

  @Test @Ignore
  public void testSkip() {
  }

  @Test @Ignore("not ready yet")
  public void testIgnore() {
  }

  @Test(timeout = 1)
  public void testTimeout() {
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
      Thread.currentThread().interrupt();
    }

  }



  @Test(expected=NumberFormatException.class)
  public void testexception() {
    throw new IllegalArgumentException();
//    throw new NumberFormatException();
  }

}
