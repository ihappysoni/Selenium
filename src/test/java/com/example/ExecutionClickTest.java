package com.example;
import org.openqa.selenium.By;        
import org.openqa.selenium.JavascriptExecutor;        
import org.openqa.selenium.WebDriver;        
import org.openqa.selenium.WebElement;        
import org.openqa.selenium.chrome.ChromeDriver;      
import org.testng.annotations.Test;                    
public class ExecutionClickTest {
    @Test      
          public static void main(String[] args) throws InterruptedException{  
            System.setProperty("webdriver.chrome.driver","I:\\testing\\a1\\demo\\resources\\drivers\\chromedriver.exe");                                   
            WebDriver driver = new ChromeDriver();
            //Creating the JavascriptExecutor interface object by Type casting                
            JavascriptExecutor js = (JavascriptExecutor)driver; 
            //Launching the Site.                
            driver.get("https://practicetestautomation.com/practice-test-login/");                                    
            WebElement button =driver.findElement(By.id("submit"));                                    
            //Login to Guru99                 
            driver.findElement(By.name("username")).sendKeys("student");                            
            driver.findElement(By.name("password")).sendKeys("Password123");                                          
            //Perform Click on LOGIN button using JavascriptExecutor                
            js.executeScript("arguments[0].click();", button);
            //To generate Alert window using JavascriptExecutor. Display the alert message                     
            js.executeScript("alert('Button Clicked')"); 
            Thread.sleep(2000);  
            driver.switchTo().alert().accept();                
        }  
}