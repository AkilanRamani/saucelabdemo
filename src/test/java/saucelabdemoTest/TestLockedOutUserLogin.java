package saucelabdemoTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucelabdemo1.ProductsPage;

public class TestLockedOutUserLogin extends BaseTest {
	  @Test
	  public void testLockedOutUserGetsErrorMessage () {
	    loginPage.setUsername("locked_out_user");
	    loginPage.setPassword("secret_sauce");
	    ProductsPage productsPage = loginPage.clickLoginButton();
	    Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface"));
	  }
}


