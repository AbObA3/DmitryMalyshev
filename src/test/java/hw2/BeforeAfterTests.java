package hw2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BeforeAfterTests {

    protected static SoftAssert softAssert;
    protected static WebDriver driver;
    protected static String path;

    @BeforeMethod
    public void setUp() {
        path = getClass().getClassLoader().getResource("chromedriver.exe").getPath();
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        softAssert = new SoftAssert();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
