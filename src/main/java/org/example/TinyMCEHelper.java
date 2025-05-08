package org.example;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TinyMCEHelper {

    public static void injectIntoTinyMCE(WebDriver driver, String editorId, String htmlContent) {
        // Make sure we're in the main window (not inside any iframe)
        driver.switchTo().defaultContent();
        System.out.println("===> Entered doSomething()");


        // Use TinyMCE's own API to safely set content
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = String.format(
                "if (typeof tinymce !== 'undefined' && tinymce.get('%s')) {" +
                        "  tinymce.get('%s').setContent(`%s`);" +
                        "} else {" +
                        "  console.error('TinyMCE instance not found for ID: %s');" +
                        "}",
                editorId, editorId, htmlContent.replace("`", "\\`"), editorId
        );

        js.executeScript(script);
    }
}
