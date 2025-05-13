package org.example;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class global {
    public static String url="https://dashboard-kasb-beta.dafa.sa/admin";
    //WebDriver driver =new ChromeDriver();
    public static void wait_10(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
