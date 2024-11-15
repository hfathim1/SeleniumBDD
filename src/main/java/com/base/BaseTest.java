package com.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;

    public void setUp() {
//    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // For Firefox
        // WebDriverManager.firefoxdriver().setup();
        // driver = new FirefoxDriver();

        // For Edge
//         WebDriverManager.edgedriver().setup();
//         driver = new EdgeDriver();

        driver.manage().window().maximize();
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
