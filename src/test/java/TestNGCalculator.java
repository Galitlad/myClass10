import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNGCalculator {


    private static WebDriver driver;


    @BeforeClass
    public static void runOnceBeforeClass() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test

    public static void test01_print7ButtonDimensions() {
        driver.findElement(By.id("seven")).click();

    }

    @Test

    public static void test02_check6ButtonIsDisplayed() {
        driver.findElement(By.id("six")).isDisplayed();

    }

    @Test

    public static void test03_calculate() {

        String number = "150";

        driver.findElement(By.id("five")).click();
        driver.findElement(By.id("zero")).click();
        driver.findElement(By.id("multiply")).click();
        driver.findElement(By.id("three")).click();
        driver.findElement(By.id("equal")).click();
        WebElement result = driver.findElement(By.id("screen"));

        Assert.assertEquals(number, result.getText());
        System.out.println(result.getText() + " equal to " + number);

    }


}


