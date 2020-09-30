import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Login {
    private WebDriver driver;

     private By txtUserName=By.name("username");
     private By txtPassword=By.cssSelector("#pwdInput");
    //private By txtLogin=By.className("login-form-inputs login-btn");
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void Login() {

        driver.findElement(txtUserName).sendKeys("sangeethasurendran239@gmail.com");
        driver.findElement(By.className("login-btn")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(txtPassword).sendKeys("pqrst22#");
       // driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.className("login-form-inputs login-btn")).click();

        String actualUrl="https://www.ajio.com/";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



    }
}
