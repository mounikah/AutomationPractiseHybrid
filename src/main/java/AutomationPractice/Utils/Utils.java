package AutomationPractice.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BrowserFactory {
//ExplicitWait
    WebDriverWait wait=new WebDriverWait(driver,AutomationConstants.TIMEOUT);
    public void waitForElementClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForElementVisible(WebElement element){
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

}

