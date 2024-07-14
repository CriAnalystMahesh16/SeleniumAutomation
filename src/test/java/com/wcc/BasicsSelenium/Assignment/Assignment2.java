package com.wcc.BasicsSelenium.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment2 {
    //  Selenium Project#2 - Mini Project
//open the url - https://katalon-demo-cura.herokuapp.com/
//click on the make appoinment button
//verify that url changes - assert
//time.sleep(3)
//enter the username, password
//next page verify the current url
//make appoinment text on the web page.
//
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver=new ChromeDriver();

        System.out.println("Before Test");
    }
    @Test

    public void clickOnAppoinmentButton(){



        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();

        WebElement clickButton= driver.findElement(By.id("btn-make-appointment"));
        clickButton.click();

        //id="txt-username"
        //txt-password
        //id="btn-login"
        WebElement userName=driver.findElement(By.id("txt-username"));
        userName.sendKeys("John Doe");

        WebElement password =driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement loginButton =driver.findElement(By.id("btn-login"));
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        System.out.println(driver.getTitle());


    }

    @AfterTest
    public void browserQuit(){

        driver.close();
    }


}