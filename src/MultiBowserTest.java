import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBowserTest {

    static String browser = "Edge";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else  if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String baseUrl = "https://demo.nopcommerce.com/";
        //open the URL
        driver.get(baseUrl);
        //Title of the Page
        String title = driver.getTitle();
        System.out.println(title);
        // Print Current Url
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Get the Page Source
        System.out.println("Page Source: " + driver.getPageSource());
        // Login link Element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        // Click on login link element
        loginLink.click();
        // Enter Email to Email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Primexyz@gmail.com");
        // Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("prime123");

    }

}
