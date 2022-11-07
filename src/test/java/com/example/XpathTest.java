package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;	
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {

    public static String baseUrl = "http://ihappysoni.netlify.app/";
    public static WebDriver driver;

    public static void main(String [] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","I:\\testing\\a1\\demo\\resources\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String basicXpath =  driver.findElement(By.xpath("//h1[@class='name']")).getText();

        String containsXpath =  driver.findElement(By.xpath("//*[contains(text(),'project')]")).getText();
        
        String orXpath =  driver.findElement(By.xpath("//*[@href='mailto' or @class='mailLink']")).getText();
        
        String andXpath =  driver.findElement(By.xpath("//*[@href='mailto' or @class='mailLink']")).getText();
        
        String startsWithXpath =  driver.findElement(By.xpath("//h1[starts-with(@class,'project')]")).getText();
        
        String textXpath =  driver.findElement(By.xpath("//h1[text()='Resume']")).getText();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        
        js.executeScript("alert('You have reached at the end');");


        System.out.println("----------------------------------------------");
        System.out.println(basicXpath);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println(containsXpath);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println(orXpath);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println(andXpath);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println(startsWithXpath);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println(textXpath);
        System.out.println("----------------------------------------------");
       
    }
}

