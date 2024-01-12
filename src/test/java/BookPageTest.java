import Pages.BooksMainPage;
import Pages.MainPage;
import Pages.SpecificBookPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.*;

public class BookPageTest extends UseCaseBase {

   private static BooksMainPage booksMainPage;
   private static MainPage mainPage;
   private static SpecificBookPage specificBookPage;
    public static final Logger logger = LogManager.getLogger(BooksMainPage.class);

    @BeforeAll
    public static void classSetup() {
        booksMainPage = new BooksMainPage();
        mainPage = new MainPage();
        specificBookPage = new SpecificBookPage();


}
    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }
@Test
    public void dropDownMenuBooksByLanguage(){
        boolean success = booksMainPage.isBooksByLanguageVisible();
        assertTrue(success);
}
@Test
    public void englishOnlyBooksChoice() {
    booksMainPage.openBooksByLanguage().click();
    WebElement englishOption = booksMainPage.inEnglishOnly();
    assertNotNull(englishOption);
    englishOption.click();
    WebElement englishHeader = booksMainPage.englishHeader();
    assertNotNull(englishHeader);
}
    @Test
            public void specificBook(){
        booksMainPage.openBooksByLanguage().click();
        booksMainPage.inEnglishOnly().click();

        WebElement book = specificBookPage.bookAboutTeeth();
        assertNotNull(book);
        book.click();

        WebElement selectFormat = specificBookPage.bookFormatHardcover();
        assertNotNull(selectFormat);
        selectFormat.click();

        WebElement hardFormat = specificBookPage.hardFormat();
        assertNotNull(hardFormat);
        hardFormat.click();

        WebElement numberOfBooks = specificBookPage.numberOfBooks();
        numberOfBooks.sendKeys("5");

        WebElement addToCartButton = specificBookPage.addToCartButton();
        assertNotNull(addToCartButton);
        addToCartButton.click();






    }


}




