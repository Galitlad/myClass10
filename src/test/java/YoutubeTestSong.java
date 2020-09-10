import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YoutubeTestSong {

    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
            driver= new ChromeDriver();
            driver.get("https://www.youtube.com/");
        }

    @Test

    public void test01_songnameSendKeys(){

        WebElement searchButton = driver.findElement(By.name("search_query"));
        searchButton.click();
        searchButton.sendKeys("Bruno Mars - The Lazy Song");
        WebElement clickButton = driver.findElement(By.id("search-icon-legacy"));
        clickButton.click();

    }
}