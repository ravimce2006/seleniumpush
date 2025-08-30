package day2;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testannotation {
	
	@Test(description="login test",priority=1,enabled=true,timeOut =0)
	void ctest()
	{
		System.out.println("Test1 block executed");
	}
	
	
	@Test(description="enter username",priority=1,enabled=true)
		void btest()
	{
		System.out.println("Test2 block executed");
		Assert.assertEquals(2,4,"number are not matched");
	
	}
    @Test(description="enter password",priority=2,invocationCount =1,enabled=true)
	void atest3()
	{
		System.out.println("Test3 block executed");
	}
    
    @Test
    void skiipedtest()
    {
    	System.out.println("skipped the test case");
    	throw new SkipException("This testcase is skipped due to some reasons");
    	
    }
    
    @Test
    void enterinput()
    {
    	System.out.println("enter input value");
    	Assert.assertTrue(true);
    }
    
    @Test
    void enterinput1()
    {
    	System.out.println("enter input1 value");
    	Assert.assertFalse(false);
    }
    
    @Test(dependsOnMethods={"enterinput","enterinput1"},alwaysRun=false)
    void calcuate()
    {
    	System.out.println("calculate values");
    }
    
}

