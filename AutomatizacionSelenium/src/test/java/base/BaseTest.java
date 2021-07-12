package base;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        homePage();
        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void homePage(){
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }
}
