import Pages.BooksMainPage;
import Pages.CartPage;
import Pages.MainPage;
import Pages.SpecificBookPage;
import Utils.UseCaseBase;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class CartPageTest extends UseCaseBase {

    private static BooksMainPage booksMainPage;
    private static MainPage mainPage;
    private static SpecificBookPage specificBookPage;
    private static CartPage cartPage;

    @BeforeAll
    public static void classSetup(){
        mainPage = new MainPage();
        booksMainPage = new BooksMainPage();
        specificBookPage = new SpecificBookPage();

    }
    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        booksMainPage.openBooksByLanguage().click();
        booksMainPage.inEnglishOnly().click();
        specificBookPage.bookAboutTeeth().click();
        cartPage=specificBookPage.goToCart();

    }
@Test
    public void openCartPage() {
        boolean isLoaded = cartPage.isYourCartPageVisible();
    assertTrue(isLoaded);

}
@Test
    public void subtotalChange(){
   cartPage.editCartButton();
    WebElement editCart = cartPage.editCartButton();
    editCart.sendKeys("6");
    cartPage.updateButton();

    WebElement subtotal = cartPage.totalPrice();
    String value =subtotal.getText();
    editCart.sendKeys("5");
    cartPage.updateButton();
    assertNotEquals(value,subtotal.getText());
}


    }








