package AutomationPractice.StepDefinitions;

import AutomationPractice.Pages.FadedTshirtsMorePage;
import AutomationPractice.Pages.HomePage;
import AutomationPractice.Pages.SendToAFriendPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SendToAFriendSteps {
    public HomePage homePage;
    public FadedTshirtsMorePage fadedTshirtsMorePage;
    public SendToAFriendPage sendToFriendPage;

    @When("^User mouse hover to Faded Short Sleeve T-shirts item and click on more button$")
    public void mouseHoverToFadedTShirtItemAndClickMoreButton() {
        homePage=new HomePage();
        homePage.setMouseHoverAndClick();
    }
    @Then("^User should see the more page of that selected item$")
    public void isUserOnTheMorePageOfTheSelectedItem()  {
        fadedTshirtsMorePage=new FadedTshirtsMorePage();
        Assert.assertTrue(fadedTshirtsMorePage.isFadedTshirtHeaderDisplayed());
    }
    @When("^click on send to a friend$")
    public void clickOnSendToFriend()  {
        fadedTshirtsMorePage.setSendToFriendButton();
    }
    @Then("^user should see send to a friend page$")
    public void isUserOnSendToFriendPage() {
        sendToFriendPage=new SendToAFriendPage();
        sendToFriendPage.waitForSendToFriendForm();
        Assert.assertTrue(sendToFriendPage.isSendToFriendHeaderDispalyed());

    }
    @When("^enter name as \"([^\"]*)\" and email as \"([^\"]*)\" and click on send button$")
    public void enterNameEmailAndClickSendButton(String name, String email)
    {
        sendToFriendPage.setFriendNameEmailAndClickButton(name,email);
    }
    @Then("^user should see email sent confirmation message$")
    public void isConfirmationMessageDisplayed()  {
        sendToFriendPage.waitForConfirmationMsg();
        Assert.assertEquals(sendToFriendPage.getActualConfirmationMsg(),"Your e-mail has been sent successfully");
    }
    @Then("^user should see error message$")
    public void verifyErrorMsgDisplayed()  {
        Assert.assertTrue(sendToFriendPage.isErrorMsgDisplayed());

    }
}
