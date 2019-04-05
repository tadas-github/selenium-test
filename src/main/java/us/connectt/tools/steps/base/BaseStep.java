package us.connectt.tools.steps.base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import us.connectt.tools.factory.PagesFactory;

import java.util.concurrent.TimeUnit;

public class BaseStep {

    public WebDriver driver;

    @Before
    public void setUp() {

        //System property
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");

        //Setup default browser driver
        driver = new FirefoxDriver();

        //Set full screen size
        driver.manage().window().maximize();

        //Default timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Set pages factory driver
        PagesFactory pagesFactory = new PagesFactory();
        pagesFactory.setDriver(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
