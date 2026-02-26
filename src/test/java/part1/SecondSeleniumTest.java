package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondSeleniumTest {
    // Example of failed test
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(15000); // wait to finish loading (verrrrrrryyyyyy sloooooooooooooooooooooooww)
        // Thread.sleep = java stop, not selenium stop. Demonstration purpose only.

        // Input data and submit the login form
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();

        // Assertion
        Thread.sleep(15000);
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboards";
        Assert.assertEquals(actualResult, expectedResult);
    }
}
