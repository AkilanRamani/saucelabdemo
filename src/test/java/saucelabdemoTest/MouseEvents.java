package saucelabdemoTest;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvents {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.browserstack.com/guide/handle-multiple-windows-in-selenium");
	    Robot robot = new Robot();
	    WebElement element =  driver.findElement(By.xpath("//*[@id=\"guideBannerSection\"]/div/div/div/div/a"));
		org.openqa.selenium.Point p = element.getLocation();
		int xcoordinate = p.x;
		int ycoordinate = p.y;
		robot.mouseMove(xcoordinate, ycoordinate);
		System.out.println(xcoordinate);
		System.out.println(ycoordinate);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		//driver.quit();
	}

}
