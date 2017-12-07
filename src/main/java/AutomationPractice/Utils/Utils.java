package AutomationPractice.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utils extends BrowserFactory {

//ExplicitWait
    public static WebDriverWait wait=new WebDriverWait(driver,AutomationConstants.TIMEOUT);
    public static void waitForElementClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitForElementVisible(WebElement element,int time){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    //MoveToElement
    public static void moveTo(WebElement element){
        Actions actions=new Actions(driver);
                actions.moveToElement(element).click().build().perform();
    }
    //MouseHoverAndClick
    public static void mouseHoverAndClick(WebElement elementToHover,WebElement elementToClick){
        Actions action=new Actions(driver);
        action.moveToElement(elementToHover).click(elementToClick).build().perform();
    }

    //sleep
    public void sleep(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

}

