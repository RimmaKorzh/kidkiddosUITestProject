import Pages.*;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);



    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();


    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() {
        logger.info("Main page load test");
        boolean success = mainPage.isLogoVisible();
        assertTrue(success);
    }

    @Test
    public void openContactUsPage() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void openLoginPage() {
        LoginPage loginPage = mainPage.openloginPage();
        boolean isLoaded = loginPage.isLoginPageTitleVisible();
        assertTrue(isLoaded);
    }

@Test
    public void openSignUpPage(){
      SignUpPage signUpPage = mainPage.openloginPage().signInButton();
     boolean isLoaded = signUpPage.isSignUpPageVisible();
     assertTrue(isLoaded);


}


   }






















