package us.connectt.tools.factory;

import org.openqa.selenium.WebDriver;
import us.connectt.tools.pages.LandingPage;
import us.connectt.tools.pages.navigation.Navigation;

public class PagesFactory {

    private static WebDriver driver;

    public void setDriver(WebDriver driver) {
        PagesFactory.driver = driver;
    }

    public static Navigation onNavigation() {
        return new Navigation(driver);
    }

    public static LandingPage onLandingPage() {
        return new LandingPage(driver);
    }
}
