package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_FirstSeleniumClass {
    //    This is our first JAVA Automation class
          //1. Create main method in JAVA class

          //main -> main method
    public static void main(String[] args) {
          //2. System.setProperty("DRIVER TYPE", "DRIVER PATH")
          // DRIVER TYPE FOR CHROME: webdriver.chrome.driver
          // DRIVER PATH : /Users/techproed/Documents/selenium dependencies/drivers/chromedriver"
          //WINDOWS USER : use chromedriver.exe EXTENTION
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\aatil\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
          //3. Create WebDriver object
          WebDriver driver = new ChromeDriver();
          //NOTE: If selenium libraries are not imported, then import the selenium library ones.

          //Step 1, 2, 3, are mandatory for java automation frameword.
          //NOTE: when we learn maven, we will not follow these steps. It will be shorter

          //4. Now that we are done with set up, we can write automation script
          //Going to google
          driver.get("https://www.google.com");

    }
}
