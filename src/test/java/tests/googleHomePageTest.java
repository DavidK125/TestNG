package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class googleHomePageTest {

    WebDriverManager.
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setUp(){

    }

    @Test
    public void testHomePage() throws InterruptedException {

        driver.get("https://google.com");
        Thread.sleep(2000);

        //assert the title is Google

        assertEquals(driver.getTitle(),"Google");

    }
    @AfterMethod
    public void tearDown(){

    }

}
