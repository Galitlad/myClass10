import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class test {


    private static WebDriver driver;

    public static void main(String[] args) {



            System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");

            driver = new ChromeDriver();
            driver.get("https://translate.google.com/");
            driver.findElement(By.id("source")).submit();
            System.out.println(driver.findElements(By.id("source")).size());


    }
}
