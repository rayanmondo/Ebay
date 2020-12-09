package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumAutomation.EbayPriceValidation;

public class NavigationBar {
    private final Logger LOGGER= LogManager.getLogger(NavigationBar.class);
    private final By moseHover = By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/a[text()='Motors']");
    private final By ClickOnCarsTruck=By.xpath("//*[@id='mainContent']/div//a[text()='Cars & Trucks']");
    private final By returnHomePage=By.id("gh-logo");

    WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }
    public NavigationBar mouseHover() {
        ActOn.element(driver, moseHover).mouseHover();
        return this;
    }

    public MakeSelect clickLink() {
        ActOn.element(driver, ClickOnCarsTruck).click();
        return new MakeSelect(driver);
    }
    public Home clickLogo(){
        ActOn.element(driver,returnHomePage).click();
        return new Home(driver);
    }

}
