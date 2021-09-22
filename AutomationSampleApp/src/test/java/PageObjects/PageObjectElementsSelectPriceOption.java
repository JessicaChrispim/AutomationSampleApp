package PageObjects;

import Tools.BasePage;
import org.openqa.selenium.*;


public class PageObjectElementsSelectPriceOption extends BasePage {

    //region WebElements

    public WebElement RadioButtonSilver() {
        Wait(ElementRadioButtonSilver);
        return GetDriver().findElement(ElementRadioButtonSilver);
    }

    public WebElement ButtonNext() {
        Wait(ElementButtonNext);
        return GetDriver().findElement(ElementButtonNext);
    }

//endregion

    //region Method

    public void FillsTheFormOfTheTabSelectPriceOption() {
        RadioButtonSilver().click();
    }

    public void ClickOnButtonNext(){
        ButtonNext().click();
    }

//endregion

    //region Elements By
    By ElementRadioButtonSilver = By.xpath("//input[@id='selectsilver']/../span");
    By ElementButtonNext = By.id("nextsendquote");
//endregion
}
