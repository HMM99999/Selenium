package org.example;

import org.example.base.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo {

    public static void main(String[] args) throws Exception {
        ChromeDriver driver = Tools.getDriver();
        driver.get("http://localhost:8080/yinbang/app/html/PlanningSpace.html");
        Thread.sleep(2000);
        Tools.login("admin", "admin");
        Thread.sleep(2000);

        WebElement page = Tools.getPage();

        List<WebElement> gridElements = driver.findElements(By.className("x-grid-panel"));
        for (WebElement grid : gridElements) {
            String test = null;
        }
    }

}
