package com.wcc.BasicsSelenium.Chrome;

//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Lab001 {
    public static void main(String[] args) {
        //WebDriver driver=new ChromeDriver();

        EdgeDriver driver = new EdgeDriver();

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
    }
}
