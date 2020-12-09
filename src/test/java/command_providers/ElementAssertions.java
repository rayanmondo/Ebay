package command_providers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ElementAssertions {
    private static final Logger LOGGER = LogManager.getLogger(ElementAssertions.class);
    private WebDriver driver;
    private By locator;

    public ElementAssertions (WebDriver driver , By locator){
        this.driver = driver;
        this.locator = locator;
    }

    public ElementAssertions elementExist(){
        boolean element = driver.findElements(locator).size() > 0;
        LOGGER.info("validating that the expected locator " + locator + "does exist");
        Assert.assertTrue(element,"the expected elemet doed not exist");
        return this;
    }

}
