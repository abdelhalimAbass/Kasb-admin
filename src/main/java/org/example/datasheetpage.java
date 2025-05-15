package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class datasheetpage {
    public static void create_datasheet(WebDriver driver){
        global.wait_10(driver);
        driver.findElement(By.id("day_to_date_inp")).sendKeys("10");
        driver.findElement(By.id("week_to_date_inp")).sendKeys("10");
        driver.findElement(By.id("month_to_date_inp")).sendKeys("10");
        driver.findElement(By.id("year_to_date_inp")).sendKeys("10");
        driver.findElement(By.id("quarter_to_date_inp")).sendKeys("10");
        driver.findElement(By.id("annualized_return_inp")).sendKeys("10");
        //total_return_inp
        driver.findElement(By.id("total_return_inp")).sendKeys("10");
        driver.findElement(By.id("standard_deviation_inp")).sendKeys("10");
        driver.findElement(By.id("information_ratio_inp")).sendKeys("10");
        driver.findElement(By.id("sharp_ratio_inp")).sendKeys("10");
        driver.findElement(By.id("beta_inp")).sendKeys("10");
        driver.findElement(By.id("correlation_inp")).sendKeys("10");
        driver.findElement(By.id("r_squared_inp")).sendKeys("10");
        driver.findElement(By.xpath("//*[@id=\"next-btn\"]/span[1]")).click();

    }
}
