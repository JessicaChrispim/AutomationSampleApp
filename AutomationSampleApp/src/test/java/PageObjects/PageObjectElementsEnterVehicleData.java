package PageObjects;
import Tools.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PageObjectElementsEnterVehicleData extends BasePage {

	
	//region WebElements
	
	public Select ComboMake() {
		Wait(ElementComboMake);
		return new Select(GetDriver().findElement(ElementComboMake));
	}

	public Select ComboModel() {
		Wait(ElementComboModel);
		return new Select(GetDriver().findElement(ElementComboModel));
	}

	public WebElement InputCylinderCapacity() {
		Wait(ElementInputCylinderCapacity);
		return GetDriver().findElement(ElementInputCylinderCapacity);
	}

	public WebElement InputDateOfManufacture() {
		Wait(ElementInputDateOfManufacture);
		return GetDriver().findElement(ElementInputDateOfManufacture);
	}

	public WebElement InputRightHandDriverOpcaoSim() {
		Wait(ElementInputRightHandDriverOpcaoSim);
		return GetDriver().findElement(ElementInputRightHandDriverOpcaoSim);
	}

	public Select ComboNumberOfSeatsMotorcycle() {
		Wait(ElementComboNumberOfSeatsMotorcycle);
		return new Select(GetDriver().findElement(ElementComboNumberOfSeatsMotorcycle));
	}

	public WebElement InputPayload() {
		Wait(ElementInputPayload);
		return GetDriver().findElement(ElementInputPayload);
	}

	public WebElement InputTotalWeight() {
		Wait(ElementInputTotalWeight);
		return GetDriver().findElement(ElementInputTotalWeight);
	}

	public WebElement InputListPrice() {
		Wait(ElementInputListPrice);
		return GetDriver().findElement(ElementInputListPrice);
	}

	public WebElement InputEnginePerformance() {
		Wait(ElementInputEnginePerformance);
		return GetDriver().findElement(ElementInputEnginePerformance);
	}

	public WebElement InputLicensePlateNumber() {
		Wait(ElementInputLicensePlateNumber);
		return GetDriver().findElement(ElementInputLicensePlateNumber);
	}

	public WebElement InputAnnualMileage() {
		Wait(ElementInputAnnualMileage);
		return GetDriver().findElement(ElementInputAnnualMileage);
	}

	public WebElement ButtonNext() {
		Wait(ElementButtonNext);
		return GetDriver().findElement(ElementButtonNext);
	}

	public WebElement ButtonStepEnterVehicleData() {
		Wait(ElementButtonStepEnterVehicleData);
		return GetDriver().findElement(ElementButtonStepEnterVehicleData);
	}

	public Select ComboNumberOfSeats() {
		Wait(ElementInputNumberOfSeats);
		return new Select(GetDriver().findElement(ElementInputNumberOfSeats));
	}

	public Select ComboFuelType() {
		Wait(ElementInputFuelType);
		return new Select(GetDriver().findElement(ElementInputFuelType));
	}

	//endregion

	//region Method

	public void ClickOnButtonNext(){
		ButtonNext().click();
	}
	
	public void FillsTheFormOfTheTabDateEnterVehicle() {
		ButtonStepEnterVehicleData().click();
		ComboMake().selectByVisibleText("BMW");
		ComboModel().selectByVisibleText("Scooter");
		InputCylinderCapacity().sendKeys("1893");
		InputEnginePerformance().sendKeys("1895");
		InputDateOfManufacture().sendKeys("03/05/1999");
		ComboNumberOfSeats().selectByVisibleText("5");
		InputRightHandDriverOpcaoSim().click();
	    ComboNumberOfSeatsMotorcycle().selectByVisibleText("2");
		ComboFuelType().selectByVisibleText("Diesel");
		InputPayload().sendKeys("1000");
		InputTotalWeight().sendKeys("1000");
		InputListPrice().sendKeys("18900");
		InputLicensePlateNumber().sendKeys("C2A34B");
		InputAnnualMileage().sendKeys("250");
	}

	//endregion

	//region Elements By
	
	By ElementButtonStepEnterVehicleData = By.id("entervehicledata");
	By ElementComboMake = By.id("make");
	By ElementComboModel = By.id("model");
	By ElementInputCylinderCapacity = By.id("cylindercapacity");
	By ElementInputRightHandDriverOpcaoSim = By.xpath("//label[.='Right Hand Drive']/../p//label[1]");
	By ElementInputEnginePerformance = By.id("engineperformance");
	By ElementInputDateOfManufacture = By.id("dateofmanufacture");
	By ElementInputNumberOfSeats = By.id("numberofseats");
	By ElementComboNumberOfSeatsMotorcycle = By.id("numberofseatsmotorcycle");
	By ElementInputFuelType = By.id("fuel");
	By ElementInputPayload = By.id("payload");
	By ElementInputTotalWeight = By.id("totalweight");
	By ElementInputListPrice = By.id("listprice");
	By ElementInputLicensePlateNumber = By.id("licenseplatenumber");
	By ElementInputAnnualMileage = By.id("annualmileage");
	By ElementButtonNext = By.id("nextenterinsurantdata");

	//endregion
}
