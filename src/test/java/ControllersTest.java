import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ControllersTest {


    private static WebDriver driver;


    @BeforeClass

    public static void OpenChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Controllers/");
    }


    @Test
    public void test01_SelectRadioButtonTest(){
        driver.findElement(By.cssSelector("input[value=Cheese")).click();

    }


    @Test
    public void test02_SelectDropDownTest(){

       Select dropDownList = new Select(driver.findElement(By.name("dropdownmenu")));
       dropDownList.selectByVisibleText("Butter");
       List<WebElement>elementList = driver.findElements(By.name("dropdownmenu"));
       for(int i = 0; i<elementList.size(); i++){
           dropDownList.selectByIndex(2);
       }
    }

    @Test
    public void test03_SelectDropDownTest(){

        WebElement printList = driver.findElement(By.name("dropdownmenu"));
        Select elementList = new Select(printList);
        List<WebElement>list = elementList.getOptions();
        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i).getText());
        }

    }


}
