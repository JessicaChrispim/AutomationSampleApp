package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Tools.BasePage;

public class PageObjectElementsEnterInsurantData extends BasePage {

    //region WebElements

    public WebElement InputFirstName() {
        Wait(ElementInputFirstName);
        return GetDriver().findElement(ElementInputFirstName);
    }

    public WebElement InputLastName() {
        Wait(ElementInputLastName);
        return GetDriver().findElement(ElementInputLastName);
    }

    public WebElement InputDateOfBirth() {
        Wait(ElementInputDateOfBirth);
        return GetDriver().findElement(ElementInputDateOfBirth);
    }

    public WebElement RadioButtonGenderMale() {
        Wait(ElementRadioButtonGenderMale);
        return GetDriver().findElement(ElementRadioButtonGenderMale);
    }

    public WebElement InputStreetAddress() {
        Wait(ElementInputStreetAddress);
        return GetDriver().findElement(ElementInputStreetAddress);
    }

    public Select ComboCoutry() {
        Wait(ElementComboCoutry);
        return new Select(GetDriver().findElement(ElementComboCoutry));
    }

    public WebElement InputZipCode() {
        Wait(ElementInputZipCode);
        return GetDriver().findElement(ElementInputZipCode);
    }

    public WebElement InputCity() {
        Wait(ElementInputCity);
        return GetDriver().findElement(ElementInputCity);
    }

    public Select ComboOccupation() {
        Wait(ElementComboOccupation);
        return new Select(GetDriver().findElement(ElementComboOccupation));
    }

    public WebElement InputWebSite() {
        Wait(ElementInputWebSite);
        return GetDriver().findElement(ElementInputWebSite);
    }

    public WebElement ButtonStepEnterInsurantData() {
        Wait(ElementButtonStepEnterInsurantData);
        return GetDriver().findElement(ElementButtonStepEnterInsurantData);
    }

    public WebElement ButtonNext() {
        Wait(ElementButtonNext);
        return GetDriver().findElement(ElementButtonNext);
    }

    //endregion

    //region Texts || Methods
    public void SelectAllHobbiesCheckBox() {
        for (int CheckBox = 1; CheckBox <= 5; CheckBox++) {
            GetDriver().findElement(By.xpath("//label[" + CheckBox + "]/span[@class='ideal-check']")).click();
        }
    }

    public void ClickOnButtonNext(){
        ButtonNext().click();
    }

    public void FillsTheFormOfTabEnterDateInsurant() {
        ButtonStepEnterInsurantData().click();
        InputFirstName().sendKeys("Qualidade");
        InputLastName().sendKeys("Automacao");
        InputDateOfBirth().sendKeys("29/01/1999");
        RadioButtonGenderMale().click();
        InputStreetAddress().sendKeys("Rua de Qualidade");
        ComboCoutry().selectByVisibleText("Andorra");
        InputZipCode().sendKeys("12321");
        InputCity().sendKeys("QualiAuto");
        ComboOccupation().selectByVisibleText("Employee");
        SelectAllHobbiesCheckBox();
        InputWebSite().sendKeys("http://sampleapp.tricentis.com/101/app.php");
    }
    //endregion

    //region Elements By
    By ElementButtonStepEnterInsurantData = By.id("enterinsurantdata");
    By ElementInputFirstName = By.id("firstname");
    By ElementInputLastName = By.id("lastname");
    By ElementInputDateOfBirth = By.id("birthdate");
    By ElementRadioButtonGenderMale = By.xpath("//label[.='Gender']/../p/label[1]");
    By ElementInputStreetAddress = By.id("streetaddress");
    By ElementComboCoutry = By.id("country");
    By ElementInputZipCode = By.id("zipcode");
    By ElementInputCity = By.id("city");
    By ElementComboOccupation = By.id("occupation");
    By ElementInputWebSite = By.id("website");
    By ElementButtonNext = By.id("nextenterproductdata");
//endregion

}
