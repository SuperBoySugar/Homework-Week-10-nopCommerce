import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NopCommerce {

    public static void main(String[] args) {

        // Variable to store URL
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open the URL into Browser
        driver.get(baseUrl);

        // Maximize the Browser
        driver.manage().window().maximize();

        // Implicit Wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the Title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Get Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Get the Page Source
        System.out.println("Page Source: " + driver.getPageSource());

        // Enter the Email to Email field
        WebElement loginlink = driver.findElement(By.linkText("Log in"));

        // Enter the Email to Email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime123@gmail.com");

        // Enter the Password to Password field
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        



    }
}
