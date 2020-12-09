package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumAutomation.EbayPriceValidation;

public class MakeSelect extends NavigationBar{
    private final Logger LOGGER= LogManager.getLogger(MakeSelect.class);
    private final By selectMake=By.name("Make");
    private final By selectmodel=By.name("Model");
    private final By zipCode=By.name("_stpos");
    private final By condition =By.name("LH_ItemCondition");
    private final By search = By.id("s0-26_1-9-0-1[0]-0-1-2-14[0[0]]");
    private final By returnHomePage=By.id("gh-logo");
    public MakeSelect(WebDriver driver) {
        super(driver);

    }
    public MakeSelect make(String value){
        ActOn.element(driver,selectMake).selectValue(value);
        return this;
    }
    public MakeSelect model(String value){
        ActOn.element(driver,selectmodel).selectValue(value);
        return this;
    }
    public MakeSelect zip(String value){
        ActOn.element(driver,zipCode).setValue(value);
        return this;
    }
    public MakeSelect selectondition(String value){
        ActOn.element(driver,condition).selectValue(value);
        return this;
    }
    public MakeSelect findButton(){
        ActOn.element(driver,search).click();
        return this;
    }
    public MakeSelect pageVal(){
        ActOn.browser(driver).validateTitle("Acura CL in Cars & Trucks | eBay");
        return this;

    }
    public Home clickLogo(){
        ActOn.element(driver,returnHomePage).click();
        return new Home(driver);
    }
//    public MakeSelect priceVal(String totalMonthlyPayment){
//        // LOGGER.info("expected total monthly payment"+totalMonthlyPayment);
//        By monthlyPaymentLocator=By.xpath("//*[@id='analysisDiv']/table[3]//td[2][text()='"+totalMonthlyPayment+"']");
//        AssertThat.elementAssertions(driver,monthlyPaymentLocator).elementExist();
//        return this;
////    public Refi_Calculate priceVal(String expextedValue){
////        String refiCal=ActOn.element(driver,monthlyPayment).getTextValue();
////        Assert.assertEquals(refiCal,expextedValue);
////        return this;
//    }
}
