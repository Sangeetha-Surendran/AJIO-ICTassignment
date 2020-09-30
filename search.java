import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
public class search {
    private WebDriver driver;
    public search (WebDriver driver) {
        this.driver = driver;
    }
    public void search(){
        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input")).sendKeys("Shoe Care Grease");
        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/button/span")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//*[@id=\"products\"]/div[3]/div[1]/div/div[1]/a/div/div[1]/img")).click();

      String winhandlebefore=driver.getWindowHandle();
      for(String winhandle:driver.getWindowHandles()){
          driver.switchTo().window(winhandle);
      }

     driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[7]/div[1]/div[1]/div")).click();

        //checking cart
       //driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/div[2]/a/div")).click();
       // driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/div[2]/a/div")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

}
