package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ele=driver.findElement(By.xpath("//button[text()='Point Me']"));
		//WebElement source=driver.findElement(By.id("//p[text()=\"Drag me to my target\"]"));
		//WebElement target=driver.findElement(By.className("ui-widget-header ui-droppable"));
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act=new Actions(driver);
		//act.dragAndDrop(source, target).perform();
		
		act.moveToElement(ele).moveToElement(ele).click().perform();
		
		

	}

}
