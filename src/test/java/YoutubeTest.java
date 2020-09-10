import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YoutubeTest {

    private static WebDriver driver;


    @BeforeClass
    public static void OpenChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void test01_findButton(){
        System.out.println(driver.findElement(By.id("search-icon-legacy")));
    }



}
