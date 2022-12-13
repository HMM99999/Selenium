package org.example.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {

    private static ChromeDriver driver = null;

    public static ChromeDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "E:\\IdeaProjects\\SeleniumDemo\\docs\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebElement getAppFrame () {
        return driver.findElement(By.id("_AppFrame"));
    }

    public static WebElement getPage () {
        return driver.findElement(By.id("_page"));
    }

    public static WebElement findElement(String id) {
        return driver.findElement(By.id(id));
    }

    public static void login(String loginName, String password) {
        WebElement loginElement = driver.findElement(By.id("loginName"));
        loginElement.sendKeys(loginName);
        WebElement pwElement = driver.findElement(By.id("password"));
        pwElement.sendKeys(password);
        WebElement login = driver.findElement(By.className("login-button"));
        login.click();
    }


}
