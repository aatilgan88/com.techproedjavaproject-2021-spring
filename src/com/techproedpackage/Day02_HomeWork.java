package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Day02_HomeWork {
//     1.Using ChromeDriver,
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aatil\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
//     2. Go to facebook
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
//     3. verify if page title is “facebook”,
//     4. If not, print the correct title.
    String actualTitle = driver.getTitle();
    String expectedTitle = "facebook";
    if(expectedTitle.equals(actualTitle)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
        System.out.println("Expected Title: "+ expectedTitle +"\nActualTitle: "+ actualTitle);
    }

//     5. Verify if the page URL contains facebook
//     6. if not, print the right url.
    String actualUrl = driver.getCurrentUrl();
    if(actualUrl.contains("facebook")){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
        System.out.println("Current URL: "+ actualUrl);
    }

//     7.Then Navigate to https://www.walmart.com/
    driver.get("https://www.walmart.com/");
//     8.Verify if the walmart page title includes “Walmart.com”
    String actualWalmartTitle = driver.getTitle();
    String expectedWalmartTitle = "Walmart.com";
    if(actualWalmartTitle.contains(expectedWalmartTitle)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
    }
//     9.Navigate back to facebook
    driver.navigate().back();
//     10.Refresh the page
    driver.navigate().refresh();
//     11.Close the browser
    driver.close();
}
}

