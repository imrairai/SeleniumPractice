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
public class Actions {
 
    String exePath = "C:\\Drivers\\chromedriver.exe";
    
    boolean TenantLogin(String Username, String Password)
    { 
        
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        boolean Status = true;
    
    try{
       
        driver.get("http://ipsqa06.qa.palantirsolutions.com/");
        driver.findElement(By.id("username")).sendKeys(Username);
        driver.findElement(By.cssSelector("button.form-control.btn-primary")).click();
        
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li.ng-binding:nth-child(2)")));
        
        //driver.findElement(By.cssSelector("li.ng-binding:nth-child(2)")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Password")));
        driver.findElement(By.name("Password")).sendKeys(Password);
        driver.findElement(By.name("button")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("PlanningSpace Web")));
        driver.findElement(By.linkText("PlanningSpace Web")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("has-children config")));
        driver.findElement(By.className("has-children config")).click();
        
        Status = true;
    }
    catch (Exception e)
            {
                System.out.println("Exception occured");
                Status = false;
            }
        
    return Status;
    }
    
   
   
}
