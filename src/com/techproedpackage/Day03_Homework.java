package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Homework {
    public static void main(String[] args) {
        //1-Go to http://automationpractice.com/index.php
        // 2-Click on Sign in link
        // 3-Enter you email (you can create a fake email and use that email)
        // 4-And click on Create an account link
        // 5-And Verify the CREATE AN ACCOUNT isDisplayed() on the page
        // 6-And Verify YOUR PERSONAL INFORMATION isDisplayed() on the page

//1-Go to http://automationpractice.com/index.php
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aatil\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

// 2-Click on Sign in link
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='login']"));
        signInButton.click();

        // 3-Enter you email (you can create a fake email and use that email)
        WebElement emailAddress = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        emailAddress.sendKeys("a.atilgan101@gmail.com");

        // 4-And click on Create an account link
        WebElement createButton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
        createButton.click();

        // 5-And Verify the CREATE AN ACCOUNT isDisplayed() on the page
        WebElement createAccountElement = driver.findElement(By.className("page-heading"));
        if(createAccountElement.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual is"+ createAccountElement.isDisplayed());
        }

        // 6-And Verify YOUR PERSONAL INFORMATION isDisplayed() on the page

        WebElement yourPersonalInformation = driver.findElement(By.className("page-subheading"));
        if(yourPersonalInformation.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual is "+yourPersonalInformation.isDisplayed());
        }




    }

}
