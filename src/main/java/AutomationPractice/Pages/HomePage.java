package AutomationPractice.Pages;

import AutomationPractice.Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    @FindBy(css=".login")
    WebElement signInLink;
    @FindBy(xpath = "//a[text()='Women']")
    WebElement womenLink;
    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")
    WebElement itemToHover;
    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[2]/span")
    WebElement moreButton;
    @FindBy(css="#newsletter-input")
    WebElement newsEmail;

    @FindBy(name="submitNewsletter")
    WebElement newsSubmit;

    @FindBy(xpath="//div[@id='columns']/p")
    WebElement newsSubscribeMessage;



    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void selectSignIn(){
        signInLink.click();
    }
    public void setMouseHoverAndClick(){
        Utils.mouseHoverAndClick(itemToHover,moreButton);
    }

    public void setWomenLink(){
        womenLink.click();
    }
      public void setNewsEmail(String nEmail ){
        newsEmail.sendKeys(nEmail);
    }

    public void setNewsSubmit(){
        newsSubmit.click();
    }

    public String setNewsSubscribeMessage(){
        return newsSubscribeMessage.getText();
    }


    }


