package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver webDriver;
    private String url = "https://demoblaze.com/";
    private String browser = "chrome";


    @BeforeMethod
    public void setUp(ITestResult iTestResult) throws Exception {

        switch (browser) {
            case "chrome":
                webDriver = new ChromeDriver();
                break;
            case "firefox":
                webDriver = new FirefoxDriver();
                break;
            default:
                throw new Exception(browser + " no soportado");
        }

        webDriver.get(url);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws Exception {
        webDriver.quit();
    }


}
