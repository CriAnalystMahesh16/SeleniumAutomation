package com.wcc.BasicsSelenium.Edge;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {
    public static void main(String[] args) {


        EdgeDriver driver1 = new EdgeDriver();
        driver1.get("https://www.amazon.in/");
        driver1.manage().window().maximize();
        System.out.println("Edge  Browser Launched");

    }
}
