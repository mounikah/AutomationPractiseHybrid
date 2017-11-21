package AutomationPractice.Pages;

import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {

    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }
}
