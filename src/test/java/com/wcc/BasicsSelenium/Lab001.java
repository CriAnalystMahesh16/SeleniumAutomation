package com.wcc.BasicsSelenium;

//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lab001 {
    public static void main(String[] args) {
        //WebDriver driver=new ChromeDriver();

        ChromeDriver driver = new ChromeDriver();


        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        System.out.println("Chrome  Browser Launched");
        System.out.println("---------------------------------");
        driver.navigate().to("https://www.instagram.com/");
        driver.navigate().back();
        System.out.println("Webpage backward");
        System.out.println("---------------------------------");

        driver.navigate().forward();
        System.out.println("Webpage forward");
        System.out.println("---------------------------------");

        driver.navigate().refresh();
        System.out.println("Webpage refresh");


        //driver.close();
    }
}
