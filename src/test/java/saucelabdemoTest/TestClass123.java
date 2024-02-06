package saucelabdemoTest;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass123 {
	
	public static void main(String[] args) {
		 
		// String path = System.getProperty("user.dir");
		 
		 // For Windows define path as C:\Users\abc\Desktop\chromedriver.exe
		 
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 
		 /**
		 * Now, let's open the browser with the help of the driver and get the
		 * title of the site: Here we will use the dummy Site for testing
		 */
		 
		driver.navigate().to("https://www.hubspot.com/");
		 String actualTitle = driver.getTitle();
		 
		 // Finally, we can validate if the actual title is matched with our
		 // expected
		 // Title:
		 
		 String expectedTitle = "HubSpot | Inbound Marketing, Sales, and Service Software";
		if (actualTitle.equalsIgnoreCase(expectedTitle))
		 System.out.println("Test Passed!");
		 else
		 System.out.println("Test Failed");
		 
		 // once all the operations are done, we can close the web driver
		 
		driver.close();
		 }
		 
		}


