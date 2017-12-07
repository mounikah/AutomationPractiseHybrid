package AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FadedTshirtsMorePage extends BasePage {
    public FadedTshirtsMorePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[text()=\"Faded Short Sleeve T-shirts\"]")
    WebElement fadedTshirtHeader;

    @FindBy(css = "#send_friend_button")
    WebElement sendToFriendButton;
    public boolean isFadedTshirtHeaderDisplayed(){
        return fadedTshirtHeader.isDisplayed();
    }
    public void setSendToFriendButton(){
        sendToFriendButton.click();
    }
}
