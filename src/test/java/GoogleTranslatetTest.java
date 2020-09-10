import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTranslatetTest {



    private static WebDriver driver;


    @BeforeClass
    public static void OpenChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com/");
    }

    @Test
    public void test01_findelement() {
        System.out.println(driver.findElement(By.id("source")));
        System.out.println(driver.findElement(By.cssSelector("textarea[autocomplete = off")));
    }

    @AfterClass
    public static void endTest() {
        driver.quit();
    }

}
