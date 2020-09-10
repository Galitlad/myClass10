import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookTest {

    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test

    public static void test01_loginIntoFacebook(){
        WebElement loginEmail = driver.findElement(By.id("email"));
        loginEmail.click();
        loginEmail.sendKeys("galitlad1975@gmail.com");
        WebElement loginPassword = driver.findElement(By.id("pass"));
        loginPassword.click();
        loginPassword.sendKeys("*********");
        WebElement clickLoginButton = driver.findElement(By.name("login"));
        clickLoginButton.submit();
    }


}
