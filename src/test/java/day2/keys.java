package day2;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcone");
		//WebElement text1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		//WebElement text2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		 	
	//	text1.sendKeys("enter the value");
		// Control + A
		// Control + C
		// Control + V
		
		//Actions act=new Actions(driver);
		//act.keyDown(Keys.CONTROL);
		//act.sendKeys("a");
		//act.keyUp(Keys.CONTROL);
		//act.perform();
		
		//Thread.sleep(4000);
		
	}

}
