import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTest {



    private static WebDriver driver;

    @BeforeClass
    public static void OpenChormBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void tese01_asserTitel() {

        String expectedTitel = "Amazon.com_ Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

        String actualTitel = driver.getTitle();

        Assert.assertEquals(actualTitel, expectedTitel);

    }

    @Test
    public void test01_SearchShoes(){
        System.out.println(driver.findElement(By.name("field-keywords")));
        WebElement leatherShoes = driver.findElement(By.name("field-keywords"));
        leatherShoes.sendKeys("Leather Shoes");

    }

}
