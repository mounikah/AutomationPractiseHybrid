package AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends BasePage {
    public WomenPage(){
        PageFactory.initElements(driver,this);}
    @FindBy(xpath = "//*[@id='subcategories']/ul/li[1]/h5/a")
    WebElement topsLink;
    public void setTopsLink(){
        topsLink.click();
    }
}
