import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class JSExecutor implements JavascriptExecutor {

    private static WebDriver driver;


    @BeforeClass
    public static void OpenChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void test01_pressOnElement() {
        JavascriptExecutor JS = (JavascriptExecutor)driver;
        JS.executeScript("document.getElementById('guide-icon').click();");


    }

    @Override
    public Object executeScript(String script, Object... args) {
        return null;
    }

    @Override
    public Object executeAsyncScript(String script, Object... args) {
        return null;
    }

    

}
