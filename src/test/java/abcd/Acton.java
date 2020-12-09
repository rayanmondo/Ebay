package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Acton {

    public  static ElementActions element(WebDriver driver, By locator){
        return  new ElementActions(driver,locator);
    }
}
