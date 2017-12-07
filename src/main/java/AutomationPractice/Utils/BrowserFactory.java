package AutomationPractice.Utils;

import AutomationPractice.Pages.BasePage;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserFactory extends BasePage {


    public static void startBrowser() {
        String path = System.getProperty("user.dir") + "/src/main/resources/";
        if (AutomationConstants.REMOTE_BROWSER==true){
            System.out.println("Selenium Grid is Running");
           DesiredCapabilities caps=new DesiredCapabilities();
          caps.setPlatform(Platform.WIN8);
          caps.setBrowserName("chrome");
           caps.setVersion("");
         //   DesiredCapabilities caps = DesiredCapabilities.edge();
         //   caps.setCapability("platform", "Windows 10");
          //  caps.setCapability("version", "14.14393");
            try {
                driver =new RemoteWebDriver(new URL(AutomationConstants.grid_URL),caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      else {
        if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", path + "geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", path + "Newchromedriver1.exe");
            driver = new ChromeDriver();
        } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", path + "IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

    }
    driver.get(AutomationConstants.baseURL);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void stopBrowser() {
     if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            BrowserFactory.startBrowser();
        }
        return driver;
    }
}
