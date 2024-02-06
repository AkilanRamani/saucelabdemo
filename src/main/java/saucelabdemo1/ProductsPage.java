package saucelabdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private By productLabel = By.xpath("//span[@class=\"title\"]");
    private By backpack = By.id("item_4_title_link");
    private By addToCartButton = By.className("btn_inventory");

    public ProductsPage (WebDriver driver) {super(driver);}

    public Boolean isProductLabelDisplayed () {
      return isDisplayed(productLabel);
    }

    public void addBackPack () {
      find(backpack).click();
      click(addToCartButton);
    }

    public String getButtonName () {
      return find(addToCartButton).getText();
    } 

}
