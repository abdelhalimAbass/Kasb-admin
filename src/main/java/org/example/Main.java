package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       signin(driver);
       creatingfund(driver);
       //driver.quit();
    }
    public static void signin (WebDriver driver){
        driver.get(global.url+"/login");
        driver.findElement(By.id("email_inp")).sendKeys("admin@example.com");
        driver.findElement(By.id("password_inp")).sendKeys("123123123");
        WebElement element=driver.findElement(By.id("submit-btn"));
        element.click();
    }
    public static void creatingfund(WebDriver driver)
    {
        // select funds from nav bar
        WebDriverWait a = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement b= a.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"#kt_aside_menu\"]/div[6]/a/span[2]")));
        b.click();
        // select create fund button
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"kt_wrapper\"]/div[2]/div/div/div[2]/div/div/div[2]/a")).click();
        driver.findElement(By.id("translations_ar_performance_conditions_inp")).sendKeys("هذا هو معدل التغيير");
        //
        //upload fud photo
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[1]/div[1]/label"));
        //driver.findElement(By.id("inp-img-logo")).sendKeys("\"C:\\Users\\Masarat\\Desktop\\11.jpg\"");
        //WebElement fileInput = driver.findElement(By.id("fileUpload"));
        //fileInput.sendKeys("");

//        WebElement input = driver.findElement(By.xpath("//*[@id='submitted-form']//input[@type='file']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].style.display = 'block';", input);
//        input.sendKeys("\"C:\\Users\\Masarat\\Desktop\\11.jpg\"");
// 1. الوصول للعنصر
       // WebElement input = driver.findElement(By.xpath("//input[@type='file']"));

// 2. لو مخفي، أظهره
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].style.display = 'block';", input);

// 3. ارفع الصورة
        //input.sendKeys("\"C:\\Users\\Masarat\\Desktop\\11.jpg\"");
        //input.sendKeys("\"C:\\Users\\Masarat\\Desktop\\11.jpg\"");
        // load_photo.sendKeys("C:\\Users\\Masarat\\Desktop\\11");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        // الوصول لعنصر input
        WebElement input = driver.findElement(By.xpath("//input[@type='file']"));

        // التأكد من أنه ظاهر (لو مخفي)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display = 'block';", input);

        // رفع الصورة
        input.sendKeys("C:\\Users\\Masarat\\Desktop\\11.jpg");

        // تحقق (اختياري)
        String uploadedFileName = (String) js.executeScript(
                "return arguments[0].files[0]?.name;", input);
        System.out.println("Uploaded file: " + uploadedFileName);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"translations_ar_name_inp\"]")).sendKeys("صندوق مغلق اتوميشن");
        //Select fundmanger =new Select(driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[1]/span[2]/span[1]/span")));
       //fundmanger.selectByIndex(0);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        TinyMCEHelper.injectIntoTinyMCE(driver, "translations_ar_description_inp",
                "<h1>Hello from helper!</h1><p>This is rich content.</p>");


        //send information in english section
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/ul/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("translations_en_name_inp")).sendKeys("closed fund auto");
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        TinyMCEHelper.injectIntoTinyMCE(driver, "translations_en_description_inp",
                "<h1>Hello!</h1><p>This is rich content.</p>");
        // for send in performance fieled
        driver.findElement(By.id("translations_en_performance_conditions_inp")).sendKeys("this is performance");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        try { Thread.sleep(2000); } catch (InterruptedException e) {}
//
//        // الوصول لعنصر input
//        WebElement input1 = driver.findElement(By.xpath("//*[@id=\"terms_file_inp\"]"));
//
//        // التأكد من أنه ظاهر (لو مخفي)
//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].style.display = 'block';", input1);
//
//        // رفع الصورة
//        input1.sendKeys("\"C:\\Users\\Masarat\\Desktop\\document33.pdf\"");
//
//        // تحقق (اختياري)
//        String uploadedFileName1 = (String) js1.executeScript(
//                "return arguments[0].files[0]?.name;", input1);
//        System.out.println("Uploaded file: " + uploadedFileName1);

       // driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[1]/span[2]/span[1]/span")).click();
        //driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        //driver.findElement(By.id("select2-authorized-person-sp-result-6ut7-1")).click();
//        Select selector=new Select(driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[1]/span[2]/span[1]/span")));
//        selector.selectByIndex(1);
//        selector.selectByValue("Value Capital");
//        WebElement combobox=driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[1]/span[2]/span[1]/span"));
//        Select select=new Select(combobox);
//        select.selectByVisibleText("Value Capital");

//        WebElement dropdown = driver.findElement(By.xpath("//*[@id='submitted-form']/div[1]/div[2]/div/div/div[4]/div[1]/span[2]/span[1]/span"));
//        dropdown.click();

        //Thread.sleep(100); // Replace with WebDriverWait in real test

        //driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
    // try { Thread.sleep(2000); } catch (InterruptedException e) {}
   //  driver.findElement(By.xpath("//*[@id=\"select2-authorized-person-sp-result-9o02-1\"]")).click();
//        WebElement option=driver.findElement (By.xpath("//*[@id=\"select2-authorized-person-sp-result-5yki-1\"]"));
//        option.click();
//        WebElement drop= driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[2]/span[2]/span[1]/span"));
//        drop.click();
//        try { Thread.sleep(2000); } catch (InterruptedException e) {}
//        WebElement optio=driver.findElement (By.xpath("///*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[2]/span[2]"));
//        optio.click();


//        WebElement option = driver.findElement(By.xpath(""));
//        option.click();
        global.wait_10(driver);
        WebElement fileupload= driver.findElement(By.id("terms_file_inp"));
        fileupload.sendKeys("C:\\Users\\Masarat\\Desktop\\document33.pdf");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdwn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id='submitted-form']/div[1]/div[2]/div/div/div[4]/div[1]/span[2]/span[1]/span")
        ));
        dropdwn.click();
        System.out.println("i arrived before item");
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[contains(@class,'select2-results__option') and contains(text(),'Value Capital')]")
        ));
        System.out.println("i arrived before click");
        option.click();
        System.out.println("i arrived after click");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // choose currency
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdn = wait1.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[2]/span[2]/span[1]/span")
        ));
        dropdn.click();
        System.out.println("i arrived before item1");
        WebElement opon = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[contains(text(),'SAR')]")
        ));
        System.out.println("i arrived before click1");
        opon.click();
        System.out.println("i arrived after click1");
        //choose risk level
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropd = wait2.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[3]/span[2]/span[1]/span")
        ));
        dropd.click();
        System.out.println("i arrived before item2");
        WebElement opo= wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[contains(text(),'High')]")
        ));
        System.out.println("i arrived before click1");
        opo.click();
        System.out.println("i arrived after click1");
        //choose fund type
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[5]/div[1]/span[2]/span[1]/span")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[contains(text() , 'Public open ended')]")).click();
        //select money transfare type
        global.wait_10(driver);
        driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[5]/div[2]/span[2]/span[1]/span")).click();
        System.out.println("i arrived here man");
        global.wait_10(driver);
        driver.findElement(By.xpath("//li[contains(text() , 'manual')]")).click();
        global.wait_10(driver);
        driver.findElement(By.xpath("//*[@id='bench_mark_inp']")).sendKeys("ghu");
        //entring launch date
        global.wait_10(driver);
        driver.findElement(By.xpath("//*[@id='launch_date_inp']")).sendKeys("02/25/2025");


    }
}