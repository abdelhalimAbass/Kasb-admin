package org.example;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class documentspage {
    public static void ignore_documents(WebDriver driver) throws InterruptedException {
        global.wait_10(driver);
        driver.findElement(By.xpath("//*[@id=\"documents-card\"]/div/div[2]/div[3]/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"documents-card\"]/div")));
       // Thread.sleep(2000);
        driver.findElement(By.id("next-btn")).click();
    }
}
