package AutomationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(css=".login")
    WebElement signInLink;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void selectSignIn(){
        signInLink.click();
    }
}
