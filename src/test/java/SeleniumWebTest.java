import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumWebTest {

    private static WebDriver driver;

    @BeforeClass
    public static void OpenChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
    }

    @Test
    public void test01_findSearchText() {
        System.out.println(driver.findElement(By.name("search")));

    }

    @Test
    public void test02_sendKeysTextBox(){
        driver.findElement(By.name("search")).sendKeys(("selenium"));
    }

}
