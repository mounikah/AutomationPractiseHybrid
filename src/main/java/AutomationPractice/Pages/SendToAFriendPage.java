package AutomationPractice.Pages;

import AutomationPractice.Utils.AutomationConstants;
import AutomationPractice.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendToAFriendPage extends BasePage {
    public SendToAFriendPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="#send_friend_form")
    WebElement sendToFriendFormHeader;
    @FindBy(css = "input[id='friend_name']")
    WebElement friendName;
    @FindBy(css = "input[name='friend_email']")
    WebElement friendEmail;
    @FindBy(css="#sendEmail")
    WebElement sendEmailButton;
    @FindBy(xpath = "//body[@id='product']/div[2]/div/div/div/p[1]")
    WebElement confirmationMsg;
    @FindBy(css = "#send_friend_form_error")
    WebElement errorMsg;
    public void waitForSendToFriendForm(){
        Utils.waitForElementVisible(sendToFriendFormHeader, AutomationConstants.TIMEOUT);
    }
    public boolean isSendToFriendHeaderDispalyed(){
        return sendToFriendFormHeader.isDisplayed();

    }
    public void setFriendNameEmailAndClickButton(String name, String email){
        friendName.sendKeys(name);
        friendEmail.sendKeys(email);
        sendEmailButton.click();

    }
    public void waitForConfirmationMsg(){
        Utils.waitForElementVisible(confirmationMsg,AutomationConstants.TIMEOUT);
    }
    public String getActualConfirmationMsg(){
        return confirmationMsg.getText();

    }
    public boolean isErrorMsgDisplayed(){
        return errorMsg.isDisplayed();
    }
}
