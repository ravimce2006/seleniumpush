package day1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft1 {

  @Test
  public void assert5() {
	  
	  
	  SoftAssert soft1=new SoftAssert();
	  Assert.assertEquals(5,5);
	  soft1.assertEquals("guru","guru");
	  soft1.assertAll();
	  
  }
	
	
}

