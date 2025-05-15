package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class responsabilites_page {
    public static void roles_admins(WebDriver driver)
    {
        global.wait_10(driver);
        driver.findElement(By.xpath("//*[@id=\"admin_responsible_repeater\"]/div[1]/div/div/div/div[1]/span[2]/span[1]/span")).click();
        driver.findElement(By.xpath("//li[contains(text(),'sd')]")).click();
        driver.findElement(By.xpath("//*[@id=\"admin_responsible_repeater\"]/div[1]/div/div/div/div[2]/span[2]/span[1]/span")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Checker')]")).click();
        driver.findElement(By.xpath("//*[@id=\"next-btn\"]")).click();
    }
}
