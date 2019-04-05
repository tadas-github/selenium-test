package us.connectt.tools.pages.navigation;

import org.openqa.selenium.WebDriver;
import us.connectt.tools.pages.base.BasePage;

public class Navigation extends BasePage {

    public Navigation(WebDriver driver) {
        super(driver);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }
}
