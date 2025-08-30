package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	    WebElement dropdown=driver.findElement(By.id("country"));
	    //List<WebElement> drplist=driver.findElements(By.cssSelector("#country>option"));
	    //System.out.println(drplist.size());
	    
	    /*for(WebElement ele:drplist) {
	    	ele.getText();
	    	System.out.println(" the text of each dropdownlist "+ele.getText());
	    }*/
	    Select options=new Select(dropdown);
	    options.selectByVisibleText("Australia");
	    Thread.sleep(3000);
	    options.selectByIndex(7);
        Thread.sleep(3000);
	    options.selectByValue("india");
	   // driver.close();	
	    
	    WebElement color=driver.findElement(By.id("colors"));
	 	Select col=new Select(color);
	    
	   
	
	    
	    for(int i=col.getOptions().size()-1;i>0;i--)
	    {
	    	      // if(i%2==0) {
	    	    	   col.getOptions().get(i).click();
	   // }
	    
	}

	}
}
