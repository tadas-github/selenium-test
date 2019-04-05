package us.connectt.tools.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomAssert {

    public static void assertPageTitleIs(WebDriver driver, String title) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs(title));
    }

    public static boolean elementIsPresent(WebDriver driver, By type) {
        return driver.findElement(type).isDisplayed();
    }
}
