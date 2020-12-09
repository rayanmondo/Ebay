package seleniumAutomation;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object.MakeSelect;

public class EbayPriceValidation {
//    private final By moseHover = By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/a[text()='Motors']");
////   private final By partsAndAcce=By.xpath("//*[@id='mainContent']/div[1]//a[text()='All Parts & Accessories']");
//private final By ClickOnCarsTruck=By.xpath("//*[@id='mainContent']/div//a[text()='Cars & Trucks']");
//private final By selectMake=By.name("Make");
//    private final By selectmodel=By.name("Model");
//    private final By zipCode=By.name("_stpos");
//    private final By condition =By.name("LH_ItemCondition");
//    private final By search = By.id("s0-26_1-9-0-1[0]-0-1-2-14[0[0]]");
//    private final By returnHomePage=By.id("gh-logo");
////    private final By valPrice=By.id("prcIsum_bidPrice");
    private final Logger LOGGER=LogManager.getLogger(EbayPriceValidation.class);
    WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        ActOn.browser(driver).openBrowser("https://www.ebay.com/");
        LOGGER.info("open bowser");
    }
@Test
    public void setVal(){
        new MakeSelect(driver)
                .mouseHover()
                 .clickLink()
                .make("Acura")
                .model("CL")
                .zip("18966")
                .selectondition("Used")
                .findButton()
                .pageVal();






//        ActOn.browser(driver).closeBrowser();

    }



}
