

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
public class APPLY_COUPON {
    private WebDriver driver;

    public APPLY_COUPON(WebDriver driver) {
    }

    public void APPLY_COUPON(WebDriver driver) {
        this.driver = driver;
    }

    public void APPLY_COUPON() {
        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/div[2]/a/div")).click();
        driver.findElement(By.xpath("//*[@id=\"FREESHIP\"]")).click();
        //click apply coupon
        driver.findElement(By.xpath("//*[@id=\"dCartWrapper\"]/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/button")).click();
        //incorrect code
        driver.findElement(By.xpath("//*[@id=\"dCartWrapper\"]/div[2]/div[2]/div[2]/div[3]/div/div[2]/span")).click();


    }
}

