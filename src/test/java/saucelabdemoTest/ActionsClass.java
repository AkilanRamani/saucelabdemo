package saucelabdemoTest;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {
     
	
	//@Test
	/*public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	      // identify element
	      WebElement l = driver.findElement(By.xpath("//a[text()=\"Privacy\"]"));
	      // Actions class
	      Actions a = new Actions(driver);
	      // moveToElement() and then click()
	      a.moveToElement(l).click().build().perform();
	      //enter text with keyDown() SHIFT key ,keyUp() then build() ,perform()
	     // a.keyDown(Keys.SHIFT);
	      Thread.sleep(5000);
	     // a.sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
	      driver.quit(); */
	
	
  /*@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement l = driver.findElement(By.xpath("//input[@id=\"b-query\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(l).click()
		.keyDown(Keys.SHIFT);
	    Thread.sleep(5000);
	    a.sendKeys("hello").keyUp(Keys.SHIFT).build().perform();	
	    
	    //public Actions sendKeys(CharSequence... keys) { // hello
	 //return sendKeysInTicks(keys); // hello
	  } */
	
/*	@Test
	public void testing() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options  = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		//options.addArguments("--disable-notifications");
		// DesiredCapabilities capabilities = new DesiredCapabilities();
		  //  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		  WebDriver driver = new ChromeDriver(options);
		
		 
		driver.get("https://www.google.com/"); 
			driver.manage().window().maximize(); 
		WebElement element = driver.findElement(By.xpath("//textarea[@name=\"q\"])")); 
				Actions action = new Actions(driver); //holds the SHIFT key and converts the text to uppercase 
		action.keyDown(element,Keys.SHIFT).sendKeys("testsigma").build().perform(); 
		Thread.sleep(5000); 
		driver.close(); 
		
	} */
/*	@Test
	public static void main(String[] args) throws InterruptedException  {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");
       
        WebElement compediumDevLink = driver.findElement(By.linkText("compendiumdev"));
       
        Actions actions = new Actions(driver);
       
        actions.moveToElement(compediumDevLink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        
	} */
	
	/*@Test
	public void ctrlKey() {
	 WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/key_presses");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    
   // WebElement compediumDevLink = driver.findElement(By.xpath("//input[@id=\"target\"]"));
    Actions actions = new Actions(driver);
    actions.sendKeys(compediumDevLink, Keys.ENTER).build().perform();
    actions.sendKeys(Keys.ENTER).build().perform();
    
} */
	
	/*@Test
	public void ctrlKey() {
	 WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
 driver.get("https://text-compare.com/");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
  //  WebElement compediumDevLink = driver.findElement(By.xpath("//textarea[@name=\"text1\"]"));
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
  WebElement textele =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name=\\\"text1\\\"]")));
    textele.click();
    textele.sendKeys("akilan");
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} */
	/*@Test
	public void ctrlKey12() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/login");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    WebElement inputtext = driver.findElement(By.xpath("//input[@name=\"username\"]"));
    WebElement inputtext2 = driver.findElement(By.xpath("//input[@type=\"password\"]"));
    inputtext.click();
    Thread.sleep(3000);
    inputtext.sendKeys("Akilan");
    Actions actions = new Actions(driver);
    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
    
    actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
    
  
    
    actions.keyDown(Keys.TAB).build().perform();
    
    
    
    actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
    
    if (inputtext.getAttribute("value").equals(inputtext2.getAttribute("value"))) {
    	System.out.println("Text Copied");
    }
    else {
    	System.out.println("Text Not Copied");
    }
    	
    } */
	
	@Test
	public void ctrlKey12() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/upload");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    File uploadFile = new File("C:\\Users\\akilan-18633\\eclipse-workspace\\saucelabdemo\\src\\test\\resources\\abc.txt");

    WebElement fileInput = driver.findElement(By.xpath("//input[@name=\"file\"]"));
    fileInput.sendKeys(uploadFile.getAbsolutePath());
    driver.findElement(By.id("file-submit")).click();

    WebElement fileName = driver.findElement(By.cssSelector("div#uploaded-files"));
    
    Assert.assertEquals("abc.txt", fileName.getText());
  }
    
	
	
	
	
	
	
	
}
