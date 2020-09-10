import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGGoogleTest {

    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com/");
    }


    @Test

    public static void test01_writeinhebrowSendKeys(){
        driver.findElement(By.id("source")).sendKeys("שלום");

    }
}
