package us.connectt.tools.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.connectt.tools.pages.base.BasePage;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        driver.findElement(By.id("nav-bar-log-in-button")).click();
    }
}
