package saucelabdemoTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMethods1 {
	 @BeforeSuite                                            // annotated method placed in the beginning.  
	  public void before_test()  
	  {  
	      System.out.println("It will be executed first");  
	  }  
	  @BeforeTest 
	  public void software_developers()  
	  {  
	      System.out.println("Software Developers");  
	  }  
	    
	  @BeforeClass
	  public void software_testers1()  
	  {  
	      System.out.println("Software Testers");  
	  }  
	    
	  @Test  
	  public void qa_analyst()  
	  {  
	      System.out.println("QA Analyst");  
	  }
	  @AfterSuite                                            // annotated method placed in the beginning.  
	  public void after_test()  
	  {  
	      System.out.println("It will be executed first");  
	  }  
	  @AfterTest 
	  public void software_developers1()  
	  {  
	      System.out.println("Software Developers");  
	  }  
	    
	  @AfterClass
	  public void software_testers()  
	  {  
	      System.out.println("Software Testers");  
	  }  
	  
	  
}  


