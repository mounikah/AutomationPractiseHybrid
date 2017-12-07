package AutomationPractice.StepDefinitions;

import AutomationPractice.Pages.HomePage;
import AutomationPractice.Pages.LoginPage;
import AutomationPractice.Pages.MyAccountPage;
import AutomationPractice.Pages.RegistrationPage;
import AutomationPractice.Utils.BrowserFactory;
import AutomationPractice.Utils.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Before
    public void setUp(){
        BrowserFactory.startBrowser();
    }

    @After
    public void cleanUp(){
        BrowserFactory.stopBrowser();
    }

    public LoginPage loginPage;
    public HomePage homePage;
    public RegistrationPage registrationPage;
    public MyAccountPage myAccountPage;

    @Given("^User is on the home page$")
    public void verifyUserIsOnHomePage() {
        homePage = new HomePage();
        Assert.assertTrue(homePage.getTitle().equals("My Store"));
    }

    @When("^User selects SignIn link$")
    public void selctSignInLink() {
        homePage.selectSignIn();
    }

    @Then("^User should be on the login page$")
    public void verifyUserIsOnLoginpage() {
     //   Utils.implicitWait();
        loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isUserOnLoginPage());
    }

    @When("^User enter email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterLoginCredentials(String email, String password) {
        loginPage.enterCredentials(email, password);
    }

    @And("^User selects SignIn$")
    public void selectSignIn() {
        loginPage.clickSignIn();
    }

    @Then("^User should be login successfully$")
    public void isUserLoggedIn() {
        myAccountPage = new MyAccountPage();
        Assert.assertTrue(myAccountPage.isUserOnMyAccountPage());
    }

    @And("^User should see his name as \"([^\"]*)\"$")
    public void user_should_see_his_name_as_something(String userName) {
        String accountName = myAccountPage.getAccountName();
        Assert.assertEquals(userName, accountName );
    }
    @Then("^User should see feedback message as \"([^\"]*)\"$")
    public void verifyFeedbackMessage(String message){
        Assert.assertEquals(loginPage.getFeedbackMessage(),message);
    }


}
