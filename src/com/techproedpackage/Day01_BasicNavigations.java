package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
    public static void main(String[] args) {
        //Step 1: setUp
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aatil\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        //Step 2: Create driver
        WebDriver driver = new ChromeDriver();
        //Step 3: We write the automation script.

        //Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
        //get("URL"); => takes to the URL
        //On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //navigate().to("URL")=> takes to the URL

        //What is the difference between get() and navigate().to() methods?
        //1. get() is shorter and more common
        //2. get() is a little faster
        //3. navigate() has more choice like to(), forward(), refresh()
        //4. get("TYPE STRING") But navigate().to("TYPE URL")

        //Navigate back to google Refresh the page
        driver.navigate().back();
        //Navigate forward to amazon
        driver.navigate().forward();
        //Refresh the page
        driver.navigate().refresh();
        //Maximize the window
        driver.manage().window().maximize();
        //manage().window().maximize(); => make the FULL screen

        //Close/Quit the browser
       // driver.close();
        //close() => close the current working browser
        driver.quit();
        //quit will close ALL working browser. This will be stronger

    }
}
