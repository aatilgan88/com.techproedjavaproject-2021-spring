package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Review1 {
    /*
    1.Create chrome driver. Maximize the window
    2.Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
    3.Verify if the page URL contains youtube if not, print the right url.
    4.Then Navigate to https://www.amazon.com/ Use navigate to
    5.Navigate back to youtube
    6.Refresh the page
    7.Navigate forward to amazon
    9.Then verify if page title includes “Amazon”, If not, print the correct title.
    10.Verify if the page URL is https://www.amazon.com/, if not print the correct url
    11.Quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        //1.Create chrome driver. Maximize the window
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aatil\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE: "+ actualTitle);

        }
        //3.Verify if the page URL contains youtube if not, print the right url.
        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains("youtube")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual URL:" + actualURL);
        }
        // 4.Then Navigate to https://www.amazon.com/ Use navigate to
        driver.navigate().to("https://www.amazon.com/");
        //5.Navigate back to youtube
        driver.navigate().back();
        Thread.sleep(5000);
        //6.Refresh the page
        driver.navigate().refresh();
        //7.Navigate forward to amazon
        driver.navigate().forward();
        //9.Then verify if page title includes “Amazon”, If not, print the correct title.
        String actualTitleAmazon = driver.getTitle();
        if(actualTitleAmazon.contains("Amazon")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE: "+ actualTitleAmazon);
        }
        //10.Verify if the page URL is https://www.amazon.com/, if not print the correct url
        String ExpectedURLAmazon =  "https://www.amazon.com/";
        String actualURLAmazon = driver.getCurrentUrl();
        if(ExpectedURLAmazon.equals(actualURLAmazon)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL URL: "+ actualURLAmazon);
        }
        //11.Quit the browser
        driver.quit();





    }
}
