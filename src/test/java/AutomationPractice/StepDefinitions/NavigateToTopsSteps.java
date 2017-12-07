package AutomationPractice.StepDefinitions;

import AutomationPractice.Pages.HomePage;
import AutomationPractice.Pages.TopsPage;
import AutomationPractice.Pages.WomenPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NavigateToTopsSteps {
    public WomenPage womenPage;
    public TopsPage topsPage;

    public HomePage homePage;

    @When("^user click on women link$")
    public void user_click_on_women_link()  {
        homePage=new HomePage();
        homePage.setWomenLink();
    }
    @Then("^user should see the womens page$")
    public void isUserOnWomensPage(){
        womenPage=new WomenPage();
        Assert.assertEquals(womenPage.getTitle(),"Women - My Store");
    }
    @When("^click on tops link$")
    public void clickOnTopsLink()  {
        womenPage.setTopsLink();

    }
    @Then("^user should be on the tops page successfully$")
    public void isUserOnTopsPage() {
        topsPage=new TopsPage();
        Assert.assertEquals(topsPage.getTitle(),"Tops - My Store");
    }
}
