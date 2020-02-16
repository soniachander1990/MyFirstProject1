package testcases;

import config.FrameWorkConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.MainNavBarPage;
import pages.NavigationBarPage;
import pages.StudentAcademicsPage;
import pages.TopNavBar;
import java.sql.DriverManager;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TopNavigationTest {
    WebDriver driver;
    WebDriverWait wait;
    TopNavBar topNavBar;
    MainNavBarPage mainNavBarPage;
    NavigationBarPage navigationBarPage;
    StudentAcademicsPage studentAcademicsPage;

    @BeforeSuite
    public void setup() {
        driver = DriverManager.getDriver();
        driver.get(FrameWorkConfig.getProperty("app.url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

    }

    @AfterSuite
    public void TearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
