package saucelabdemoTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksOfAllPages {

	public static void main(String[] args) {
		
		   WebDriverManager.chromedriver().setup();
			
	       ChromeDriver  driver= new ChromeDriver();					
	         driver.get("http://demo.guru99.com/test/drag_drop.html");					
	     
		//Element(BANK) which need to drag.		
	        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));					
	      
	        //Using Action class for drag and drop.		
	        Actions act=new Actions(driver);					
	      
	        //Drag and Drop by Offset.		
	        act.dragAndDropBy(From,135, 40).build().perform();		
	 }		
	

	}
	

