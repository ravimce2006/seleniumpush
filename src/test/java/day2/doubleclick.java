package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dbl=driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));
		
		Actions act=new Actions(driver);
				
		act.doubleClick(dbl).perform();
		String text = driver.findElement(By.id("field2")).getAttribute("value");
        System.out.println(text);

        if (text.equals("Hello World!")) {
            System.out.println("Strings are matched");
        } else {
            System.out.println("Strings are not matched");
        }
		
		driver.close();
	}

}
