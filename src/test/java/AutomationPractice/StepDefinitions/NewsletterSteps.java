package AutomationPractice.StepDefinitions;

import AutomationPractice.Pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NewsletterSteps {
    public HomePage homePage;
    @When("^User enters email in Newsletter as \"([^\"]*)\"$")
    public void enterEmailInNewsLetter(String nEmail) {
        homePage=new HomePage();
        homePage.setNewsEmail(nEmail);
    }
    @And("^User clicks on submit newsletter icon$")
    public void userClicksSubmitNewsLetter()  {
        homePage.setNewsSubmit();
    }
    @Then("^User should see message as \"([^\"]*)\"$")
    public void userSeeSubscribedNewsMessage(String newsSubscribedMessage) {
        Assert.assertEquals(homePage.setNewsSubscribeMessage(),newsSubscribedMessage);
    }
}
