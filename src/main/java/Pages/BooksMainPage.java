package Pages;


import org.openqa.selenium.WebElement;

public class BooksMainPage extends BasePage {
    public final static String BOOKS_BY_LANGUAGE = "//a[@aria-controls='SiteNavLabel-books-by-language']";
    public final static String ENGLISH_ONLY_BOOKS = "//a[text()='English Only']";
    public final static String ENGLISH_BOOKS_HEADER = "//h1[text()='English Only']";
//    public final static String BOOK_ABOUT_TEETH = "//img[@data-src='//kidkiddos.com/cdn/shop/products/I-Love-to-Brush-My-Teeth-children_s-bedtime-story-English-Shelley-Admont-KidKiddos-cover_195x195@2x.jpg?v=1492433975']";
//    public final static String BOOK_FORMAT = "//select[@id='SingleOptionSelector-0']";
//    public final static String HARD_FORMAT = "//option[@value='Hardcover']";


public boolean isBooksByLanguageVisible(){
    return elementExists(BOOKS_BY_LANGUAGE);

}

public WebElement openBooksByLanguage(){
        return findElementByXpath(BOOKS_BY_LANGUAGE);

    }
    public WebElement inEnglishOnly(){
       return findElementByXpath(ENGLISH_ONLY_BOOKS);


    }
    public WebElement englishHeader(){
    return findElementByXpath(ENGLISH_BOOKS_HEADER);

    }

    }



