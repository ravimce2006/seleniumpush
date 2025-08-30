package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		// taking section screenshot
	 	WebElement color=driver.findElement(By.id("colors"));
	 	File src1=color.getScreenshotAs(OutputType.FILE);
	 	File tag1=new File("C:\\Users\\ravim\\eclipse-workspace1\\selenium-project\\screenshots\\one.png");
	 	FileUtils.copyFile(src1, tag1);
	 	//driver.close();
	  WebElement alert=driver.findElement(By.id("alertBtn"));
	  File src2=alert.getScreenshotAs(OutputType.FILE);
      File  trc2=new File("C:\\Users\\ravim\\eclipse-workspace1\\selenium-project\\screenshots\\two.png");
      FileUtils.copyFile(src2, trc2);
	}

}
