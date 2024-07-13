package com.wcc.BasicsSelenium.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment1 {

// [Assignment] - Automating the Login Page of VWO.com
//Fetch the locators - https://app.vwo.com/
//Create a Maven project and add TestNG.
//Add the Allure Report (Allure TestNG)
//Automate the two Test cases of VWO.com
//Valid Username and Valid Password
//Verify name on dashboard page.
//Run them and share results.
//Push the code to github.com
//Git repo - ReadMe.md a Screen shot of allure.//

    @Test
    public void validEmailAddress() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://app.vwo.com/");

        driver.manage().window().maximize();

        //Enter Username

        WebElement emailAddress = driver.findElement(By.id("login-username"));
        emailAddress.sendKeys("abc@gmail.com");

        //Enter the password

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("admin@123");

        //Click on Sign in Button
        WebElement button = driver.findElement(By.id("js-login-btn"));
        button.click();

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        System.out.println(driver.getTitle());


    }


}
