package com.example;
import java.io.File;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.JavascriptExecutor;  
import org.testng.annotations.Test;
import com.google.common.io.Files;
public class ScreenshotTest {
    @Test

    public static void main(String[] args) throws Exception{
    	System.setProperty("webdriver.chrome.driver","I:\\testing\\a1\\demo\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();					
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //goto url

        driver.get("https://www.google.com/search?q=happy+soni&rlz=1C1CHBF_enIN977IN977&oq=happy+soni&aqs=chrome..69i57j46i175i199i512j0i512l2j69i65l2j69i61j69i65.2725j0j7&sourceid=chrome&ie=UTF-8");

        //Call take screenshot function

       ScreenshotTest.takeSnapShot(driver, "I:\\testing\\a1\\demo\\src\\test\\java\\com\\example\\screenshot\\test.png") ;     
       js.executeScript("alert('Screenshot Taken Successfully')");
       driver.switchTo().alert().accept();
    }


    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                Files.copy(SrcFile, DestFile);

    }
}
