import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
public class delete_from_cart {
    private WebDriver driver;

    public delete_from_cart(WebDriver driver) {
    }

    public void delete_from_cart(WebDriver driver) {
       this.driver = driver;
   }
  public void delete_from_cart(){
       //accessing cart
      driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/div[2]/a/div")).click();
      //selecting the item to be deleted
      driver.findElement(By.xpath("//*[@id=\"dCartWrapper\"]/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div")).click();
      //clicking delete button
        driver.findElement(By.xpath("//*[@id=\"modalId\"]/div/div/div[2]/div[2]/div[2]")).click();
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }
}
