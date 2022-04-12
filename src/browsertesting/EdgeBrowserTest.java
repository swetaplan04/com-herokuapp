package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","drivers/edgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current URL = " + driver.getCurrentUrl());
        String loginUrl ="http://the-internet.herokuapp.com/login";

        driver.navigate().to(loginUrl);
        System.out.println("Current URL = " +driver.getCurrentUrl());


        System.out.println(driver.getPageSource());
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("Admin");

        WebElement passwordlField = driver.findElement(By.name("password"));
        passwordlField.sendKeys("admin123");
        driver.close();
}
}
