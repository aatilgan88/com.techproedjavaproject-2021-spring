package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyURLTest {
    public static void main(String[] args) {
        //2. Navigate to google home page
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aatil\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //3. Verify if google homepage url is "www.google.com"
        String expectedURL ="www.google.com";
        String actualURL = driver.getCurrentUrl();//Returns the URL of the current page AS STRING

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("Actual URL : " + actualURL);
            System.out.println("Expected URL: " + expectedURL);
        }

        driver.quit();

    }
}
