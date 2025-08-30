package day1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft {

	
	
	@Test
	public void assert1() {
		SoftAssert soft=new SoftAssert();
	       		 
		 soft.assertEquals("ravi","ravi"); //pass
		 soft.assertNotEquals("ravi","ravi1");
		 soft.assertTrue(5>3); // True;
		 soft.assertFalse(5<3); // False
		 soft.assertEquals("RAVI","RAVI","Mismathed"); // Fail
		 soft.assertAll();
	}
	
	}
	

