package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);

   protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    public void setWebDriver(WebDriver webDriver) {

        BasePage.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }

    protected void clickElementByXpath(String xpath) {
        logger.info("Clicking element with xpath: " + xpath);

        findElementByXpath(xpath).click();


    }

    protected void sendTextToElementByXpath(String xpath, String text) {
        findElementByXpath(xpath).sendKeys(text);


    }

    protected boolean elementExists(String xpath) {
        try {
           logger.info("Check element with xpath exist: " + xpath);
            // findElementByXpath(xpath);
            webDriver.findElement(By.xpath(xpath));
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    protected WebElement findElementByXpath(String xpath) {

        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = webDriver.findElement(By.xpath(xpath));
        return element;
    }
    protected String getCurrentPageURL(){

        return  webDriver.getCurrentUrl();
    }

protected WebElement changeValue(String xpath) {
    Actions actions = new Actions(webDriver);
    WebElement element = webDriver.findElement(By.xpath(xpath));
    actions.moveToElement(element).click();
    actions.sendKeys(Keys.BACK_SPACE).build().perform();

//    actions.sendKeys(element, value).perform();
    // WebElement instead of void and return
return element;

}}
