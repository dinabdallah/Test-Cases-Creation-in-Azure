package features;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AzureLogin  {

    WebDriver driver;
    public AzureLogin(WebDriver driver) {

        this.driver=driver;
    }

    public void login (){

        Actions action =new Actions(driver);
        action.sendKeys("dsharaf").perform();
        action.sendKeys(Keys.TAB).perform();
        action .sendKeys("SDFDG").perform();
        action.sendKeys(Keys.ENTER).perform();
    }


}