package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deletedraft {
    public static void delete(WebDriver driver)
    {
        global.wait_10(driver);
        driver.findElement(By.xpath("//*[@id=\"#kt_aside_menu\"]/div[6]/a/span[2]")).click();
        global.wait_10(driver);
        WebElement status =driver.findElement(By.xpath("//*[@id=\"fund-data\"]/div[6]/div/div[1]/div[2]/div[1]/span[1]/span"));
//        boolean draft= true;
//        if(draft)
//        {
            driver.findElement(By.xpath("//*[@id=\"fund-data\"]/div[1]/div/div[2]/div[3]/a[3]/i")).click();
           // global.wait_10(driver);
            driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
        //}
    }
}
