import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

public class Execution {

    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;

    @Test
    public void LoginTest() throws IOException {

        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());

        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("LoginTest");
        WebDriver driver = Driver.openBrowser("ie", "https://www.ajio.com/");
       driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[1]/ul/li[1]/span")).click();




     Login loginPage=new Login(driver);
       loginPage.Login();
        search searchpage=new search(driver);
       searchpage.search();
       
       //invalid code
        APPLY_COUPON apply_coupon=new APPLY_COUPON(driver);
        apply_coupon.APPLY_COUPON();
        
        //valid coupen code
        APPLY_COUPON_Valid valid=new APPLY_COUPON_Valid(driver);
        valid.APPLY_COUPON_Valid();

        //add multiple items
        multiple_item multiple=new multiple_item(driver);
        multiple.multiple_item();

        //deleting an item from cart
        delete_from_cart delete=new delete_from_cart(driver);
        delete.delete_from_cart();

        extentTest.log(Status.PASS,"Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());


        Driver.closeBrowser();
        reports.flush();

    }
}
