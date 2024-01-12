package Pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;

public class SpecificBookPage extends BasePage {
    public final static String BOOK_ABOUT_TEETH = "//img[@data-src='//kidkiddos.com/cdn/shop/products/I-Love-to-Brush-My-Teeth-children_s-bedtime-story-English-Shelley-Admont-KidKiddos-cover_195x195@2x.jpg?v=1492433975']";
    public final static String BOOK_FORMAT = "//select[@id='SingleOptionSelector-0']";
    public final static String HARD_FORMAT = "//option[@value='Hardcover']";
    public  final static String NUMBER_OF_BOOKS ="//input[@id='Quantity']";
    public  final static String ADD_TO_CART_BUTTON ="//span[@id='AddToCartText-product-template']";
    public  final static String CLICK_ON_CART_BUTTON ="//button[@id='AddToCart-product-template']";
    public  final static String FINAL_PRICE ="//span[@class='cbb-price-digits']";






    public WebElement bookAboutTeeth()  {
        return findElementByXpath(BOOK_ABOUT_TEETH);

    }
    public WebElement bookFormatHardcover(){
        return findElementByXpath(BOOK_FORMAT);
    }
    public  WebElement hardFormat(){
        return findElementByXpath(HARD_FORMAT);
    }
public WebElement numberOfBooks(){
      return changeValue(NUMBER_OF_BOOKS);
}
public  WebElement addToCartButton(){
        return findElementByXpath(ADD_TO_CART_BUTTON);
}
public CartPage goToCart() {
  findElementByXpath(CLICK_ON_CART_BUTTON).click();
  return new CartPage();
}}