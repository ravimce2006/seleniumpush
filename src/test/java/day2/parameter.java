package day2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter {
	
	
	@Test
	@Parameters({"num1","num2"})
	void add(int num1,int num2)
	{
		int c=num1+num2;
		System.out.println("==================>"+c);
	}
}
