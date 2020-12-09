package grid;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

public class Chrome1 {
    WebDriver driver;

    @Test
    public void RunInChrome() {
        WebDriverManager.chromedriver().setup();
        driver = TestEnvironment.selectTestEnvironment();
        TestEnvironment.selectTestEnvironment();
        driver.get("https://www.mortgagecalculator.org/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
