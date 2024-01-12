package Pages;

public class LoginPage extends BasePage{

    public static final String LOGIN_PAGE ="//h1[@class='text-center']";
    public static final String SIGN_IN_BUTTON ="//input[@value='Sign In']";



    public boolean isLoginPageTitleVisible(){

        return elementExists(LOGIN_PAGE);
    }


    public SignUpPage signInButton(){
        clickElementByXpath(SIGN_IN_BUTTON);
        return new SignUpPage();
}


}


