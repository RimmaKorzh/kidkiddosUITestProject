package Pages;

public class SignUpPage extends BasePage{

    public static final String SIGN_UP_PAGE ="//main[@class='main-content']";

    public boolean isSignUpPageVisible(){
        return elementExists(SIGN_UP_PAGE);
    }

}
