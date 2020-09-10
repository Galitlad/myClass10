import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGCalculatorSize {

    private static WebDriver driver;


    @BeforeClass
    public static void runOnceBeforeClass() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test

    public static void test01_Button2Height() {
        WebElement buttonTwo = driver.findElement(By.id("two"));
        System.out.println("Number two height is " + buttonTwo.getRect().getHeight());


    }

    @Test

    public static void test0_Button6Width() {
        WebElement buttonSix = driver.findElement(By.id("six"));
        System.out.println("Number six width is " + buttonSix.getRect().getWidth());

    }
}


