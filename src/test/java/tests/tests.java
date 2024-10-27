package tests;

import features.AzureLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class tests {
    AzureLogin login ;
    WebDriver driver;

    @BeforeMethod
    public void inintialization() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://azure.2p.com.sa/Projects/IPMA/_backlogs/backlog/IPMA%20Team/Epics.");
        //Thread.sleep(5000);
    }
    @Test
public void login (){
        login =new AzureLogin(driver);

}


}
