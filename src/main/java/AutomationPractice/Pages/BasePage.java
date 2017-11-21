package AutomationPractice.Pages;

import AutomationPractice.Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BrowserFactory{
public static WebDriver driver=BrowserFactory.getDriver();
//Create Constructor
    public BasePage(){
        PageFactory.initElements(driver,this);
    }
//Getting currentUrl
    public String getUrl(){
        return driver.getCurrentUrl();
    }
//Getting title
    public String getTitle(){
        return driver.getTitle();
    }
}
