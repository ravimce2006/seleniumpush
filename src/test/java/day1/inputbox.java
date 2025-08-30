package day1;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputbox {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	   WebDriver driver=new ChromeDriver();
	   driver.get("https://testautomationpractice.blogspot.com/");
	   
	   driver.manage().window().maximize();
	   
	   By name=By.id("name");
	   By email=By.id("email");
	   By phone=By.id("phone");
	   //WebElement enterName=driver.findElement(By.id("#name"));
	   //WebElement enterEmail=driver.findElement(By.id("email"));
       // driver.findElement(By.id("#name")).sendKeys("ravikmar");
	   //inputbox.entertext(driver,"ravikumar");
	   //driver.findElement(By.id("email")).sendKeys("a@b.com");
	   //inputbox.entertext();
	   //entertext(driver,"ravikumar",enterName);
	   //entertext(driver,"a@b.com",enterEmail);
	   Thread.sleep(3000);
	   entertext1(driver,"ravi",name);
	   entertext1(driver,"a@b.com",email);
	   entertext1(driver,"8431975742",phone);
	   
	   String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(0));
	   
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   //File tag=new File("C://Users//ravim//eclipse-workspace1//selenium-project//homepage.png");
	   File tag = new File("C:\\Users\\ravim\\eclipse-workspace1\\selenium-project\\screenshots\\homepage"+timestamp+".png");

	   
	   FileUtils.copyFile(src,tag);
	   driver.close();
	   
	   
			  }

	/*   public static void entertext(WebDriver driver,String text,WebElement ele)
	   {
		   System.out.println("this funciton about common enter text box");
		   ele.sendKeys(text);
		   
	   }*/
	   
	static void entertext1(WebDriver driver,String text, By locator)
	{ 
		driver.findElement(locator).sendKeys(text);
		
	}
}
