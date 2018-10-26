/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author rguzman
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String exePath = "C:\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        WebDriver driver = new ChromeDriver();
        driver.get("http://ipsqa06.qa.palantirsolutions.com/");
        driver.findElement(By.id("username")).sendKeys("Administrator");
        driver.findElement(By.cssSelector("button.form-control.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li.ng-binding:nth-child(2)")));
        
        driver.findElement(By.cssSelector("li.ng-binding:nth-child(2)")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Password")));
        driver.findElement(By.name("Password")).sendKeys("Administrator");
        driver.findElement(By.name("button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li.dropdown:nth-child(2) > a:nth-child(1)")));
        driver.findElement(By.cssSelector("li.dropdown:nth-child(2) > a:nth-child(1)")).click();
        driver.findElement(By.linkText("Settings")).click();

    }

}
