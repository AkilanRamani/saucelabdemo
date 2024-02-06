package saucelabdemoTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTabAutomation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		By by = By.xpath("//select[@name=\"selectomatic\"]");
		WebElement element = driver.findElement(by);
	
		System.out.println(element.getText());
		;
		

	}

}
