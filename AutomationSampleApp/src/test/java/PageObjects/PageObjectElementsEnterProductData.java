package PageObjects;

import Tools.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PageObjectElementsEnterProductData extends BasePage {

    //region WebElements


    public WebElement InputStartDate() {
        Wait(ElementInputStartDate);
        return GetDriver().findElement(ElementInputStartDate);
    }

    public Select ComboInsuranceSum() {
        Wait(ElementComboInsuranceSum);
        return new Select(GetDriver().findElement(ElementComboInsuranceSum));
    }

    public Select ComboMeritRating() {
        Wait(ElementComboMeritRating);
        return new Select(GetDriver().findElement(ElementComboMeritRating));
    }

    public Select ComboDamageInsurance() {
        Wait(ElementComboDamageInsurance);
        return new Select(GetDriver().findElement(ElementComboDamageInsurance));
    }

    public WebElement CheckBoxOptionalProductsEuroProtection() {
        Wait(ElementCheckBoxOptionalProductsEuroProtection);
        return GetDriver().findElement(ElementCheckBoxOptionalProductsEuroProtection);
    }

    public Select ComboCourtesyCar() {
        Wait(ElementComboCourtesyCar);
        return new Select(GetDriver().findElement(ElementComboCourtesyCar));
    }

    public WebElement ButtonNext() {
        Wait(ElementButtonNext);
        return GetDriver().findElement(ElementButtonNext);
    }

    //endregion

    //region Texts || Methods

    public void FillsTheFormOfTheTabDateEnterProduct() {
        InputStartDate().sendKeys("01/01/2023");
        ComboInsuranceSum().selectByVisibleText("3.000.000,00");
        ComboMeritRating().selectByVisibleText("Malus 16");
        ComboDamageInsurance().selectByVisibleText("No Coverage");
        CheckBoxOptionalProductsEuroProtection().click();
        ComboCourtesyCar().selectByVisibleText("No");
    }

    public void ClickOnButtonNext(){
        ButtonNext().click();
    }

    //endregion

    //region Elements By
    By ElementInputStartDate = By.id("startdate");
    By ElementComboInsuranceSum = By.id("insurancesum");
    By ElementComboMeritRating = By.id("meritrating");
    By ElementComboDamageInsurance = By.id("damageinsurance");
    By ElementCheckBoxOptionalProductsEuroProtection = By.xpath("//label[.='Optional Products']/../p//label[1]");
    By ElementComboCourtesyCar = By.id("courtesycar");
    By ElementButtonNext = By.id("nextselectpriceoption");

    //endregion
}
