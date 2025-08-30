package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();
	    String ele=driver.switchTo().alert().getText();
	    System.out.println(ele);
	    driver.switchTo().alert().dismiss();
	    
	    
	    
	    

	}

}
