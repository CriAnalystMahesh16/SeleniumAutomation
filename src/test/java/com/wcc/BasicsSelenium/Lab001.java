package com.wcc.BasicsSelenium;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab001 {
    public static void main(String[] args) {
        //WebDriver driver=new ChromeDriver();

        ChromeDriver driver=new ChromeDriver();

        EdgeDriver driver1=new EdgeDriver();

        //FirefoxDriver driver2-new FirefoxDriver();

        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        System.out.println("Chrome  Browser Launched");

        driver1.get("https://www.amazon.in/");
        driver1.manage().window().maximize();
        System.out.println("Edge  Browser Launched");




        //driver.close();
    }
}
