package abcd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ElementActions {
    private static final Logger LOGGER= LogManager.getLogger(ElementActions.class);
    WebDriver driver;
    By locator;
    public ElementActions ( WebDriver driver, By locator ){
        this.driver= driver;
        this.locator=locator;
    }
public WebElement findElement(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       WebElement element=null;
       try {
           element= driver.findElement(locator);
       }catch (Exception e){
           LOGGER.info("element location is"+locator + "Exception is "+e);
       }
       return element;
}
 public ElementActions click(){
        findElement().click();
        return this;
 }


}
