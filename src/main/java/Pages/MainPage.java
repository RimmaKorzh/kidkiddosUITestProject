package Pages;

import Consts.Consts;

public class MainPage extends BasePage {

    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    private static final String CONTACT_US_OPTION = "//a[text()='Contact us']";
    public static final String LOGIN_BUTTON ="//a[@class='site-header__account']";
    public final static String BOOKS_BY_LANGUAGE = "//a[@aria-controls='SiteNavLabel-books-by-language']";
    public final static String ENGLISH_ONLY_BOOKS = "//a[text()='English Only']";
    public final static String BOOK_ABOUT_TEETH = "//img[@data-src='//kidkiddos.com/cdn/shop/products/I-Love-to-Brush-My-Teeth-children_s-bedtime-story-English-Shelley-Admont-KidKiddos-cover_195x195@2x.jpg?v=1492433975']";





    public void navigateToMainPage(){
        webDriver.get(Consts.MAIN_URL);


    }
    public boolean isLogoVisible(){
        boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;

    }

    public ContactUsPage openContactUsTab(){

        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();

    }
    public LoginPage openloginPage(){

        clickElementByXpath(LOGIN_BUTTON);
        return new LoginPage();
    }

}





