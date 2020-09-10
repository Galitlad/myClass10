import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ChromeWallaTest {

    private static WebDriver driver;


    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.walla.co.il");
    }

    @Test
    public void test01_getTitle() {
        System.out.println(driver.getTitle());
    }

    @Test
    public void test02_navigaterToWalla() {
        driver.navigate().refresh();


    }

    @Test
    public void tese03_asserTitel() {

        String expectedTitel = "וואלה! NEWS - האתר המוביל בישראל - עדכונים מסביב לשעון";
        String actualTitel = driver.getTitle();
        Assert.assertEquals(actualTitel, expectedTitel);
        System.out.println(expectedTitel + " is equal to " + expectedTitel);


    }

    @Test
    public void test04_assertUrl() {

        String expectedUrl = "https://www.walla.co.il/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);


    }

}






