package Pages;

import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public final static String YOUR_CART = "//div[@data-section-id='cart-template']";
    public final static String EDIT_YOUR_CART = "//input[@name='updates[]']";

    public final static String UPDATE_BUTTON = "//input[@name='update']";
    public final static String TOTAL_PRICE = "//span[@class='cart__subtotal skiptranslate notranslate']";




    public boolean isYourCartPageVisible(){
        return elementExists(YOUR_CART);
    }
     public WebElement editCartButton(){
      return changeValue(EDIT_YOUR_CART);

     }
    public void updateButton(){
         clickElementByXpath(UPDATE_BUTTON);

    }
public  WebElement totalPrice(){
        return findElementByXpath(TOTAL_PRICE);
}
}


