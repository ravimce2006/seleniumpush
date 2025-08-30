package day2;

import org.testng.annotations.Test;

public class group {

	
   @Test(groups="smoke")
   void logintest()
   {
	   System.out.println("------------>Login test smoke test");
   }
   @Test(groups="smoke")
   void homepagetest()
   {
	   System.out.println("--------------->home page smoke test");
   }
   @Test(groups="regression")
   void addcarttest()
   {
	   System.out.println("-------------->add cart test");
   }
   @Test(groups="regression")
   void productdetails()
   {
	   System.out.println("--------------------->product details test");
   }
   
}
