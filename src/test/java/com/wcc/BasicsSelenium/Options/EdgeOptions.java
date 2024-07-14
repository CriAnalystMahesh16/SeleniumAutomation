package com.wcc.BasicsSelenium.Options;


import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EdgeOptions {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();


        options.addArguments("--start-maximized");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new ChromeDriver(options);

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("67.207.75.252:58927");
        options.setCapability("proxy",proxy);


        //EdgeDriver driver = new EdgeDriver();
        driver.get("https://whatismyipaddress.com//");
        options.addArguments("--disable-notification");

        System.out.println(options);

    }
}
