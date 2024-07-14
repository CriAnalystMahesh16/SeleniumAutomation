package com.wcc.BasicsSelenium.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment3 {

    //Selenium Mini Project #3
    //Open the URL - https://www.idrive360.com/enterprise/login
    //Enter the username, password
    //Verify that Trial is fnished and current URL also
    //Add a logic to add Allure Screen for the Trail end./


    WebDriver driver;

    @BeforeTest
    public void browserInit() {

        driver = new ChromeDriver();

    }

    @Test
    public void enterUserName() {
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();

        WebElement entreEmailaddress = driver.findElement(By.id("username"));
        entreEmailaddress.sendKeys("augtest_040823@idrive.com\n");


        WebElement enterPassword = driver.findElement(By.id("password"));
        enterPassword.sendKeys("123456");

        WebElement signInButton = driver.findElement(By.id("frm-btn"));
        signInButton.click();

    }

    @AfterTest()
    public void browserClose() {

        //driver.close();
    }
}
