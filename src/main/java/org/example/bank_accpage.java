package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bank_accpage {
    public static void add_acc(WebDriver driver){
        global.wait_10(driver);
      driver.findElement(By.xpath("//input[@id='beneficiary_name_inp']")).sendKeys("pepsi");
      driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[4]/div/div[2]/div/span/span[1]/span")).click();
      global.wait_10(driver);
      driver.findElement(By.xpath("//li[contains(text(),'ARAB NATIONAL BANK')]")).click();
      driver.findElement(By.xpath("//input[@id='iban_inp']")).sendKeys("SAR02314569874252646555");
      driver.findElement(By.id("certificate-uploader")).sendKeys("C:\\Users\\Masarat\\Desktop\\reject invest.png");
      global.wait_10(driver);
      driver.findElement(By.xpath("//*[@id=\"next-btn\"]")).click();

    }
}
