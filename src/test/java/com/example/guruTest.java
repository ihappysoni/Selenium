package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class guruTest {



    public static String baseUrl = "https://demo.guru99.com/test/newtours/";

    public static String expectedTitle = "Welcome: Mercury Tours";

    public static String actualTitle = "";

    public static WebDriver driver;



    public static void main(String [] args) {

        System.setProperty("webdriver.chrome.driver","I:\\testing\\a1\\demo\\resources\\drivers\\chromedriver.exe");



        driver = new ChromeDriver();

        driver.get(baseUrl);



        actualTitle = driver.getTitle();



        if (actualTitle.equals(expectedTitle)){



            System.out.println("----------------------------------------------");

            System.out.println("Test Passed!");

            System.out.println("----------------------------------------------");

        } else {

            System.out.println("Test Failed");

        }
        WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
        element.sendKeys("username");
        // WebElement but=driver.findElement(By.xpath("//input[class='gN089b']"));
        // but.click();
        // WebElement userName=driver.findElement(By.name("userName"));
        // userName.click();
        // userName.sendKeys("username");
        WebElement passWord=driver.findElement(By.name("password"));
        passWord.click();
        passWord.sendKeys("password");
        driver.findElement(By.name("submit")).click();
        driver.close();

    }

}