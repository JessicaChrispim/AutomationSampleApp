package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Tools.BasePage;

public class PageObjectElementsSendQuote extends BasePage {

	//region WebElements

	public WebElement InputEmail() {
		Wait(ElementInputEmail);
		return GetDriver().findElement(ElementInputEmail);
	}

	public WebElement InputPhone() {
		Wait(ElementInputPhone);
		return GetDriver().findElement(ElementInputPhone);
	}

	public WebElement InputUsername() {
		Wait(ElementInputUsername);
		return GetDriver().findElement(ElementInputUsername);
	}

	public WebElement InputPassword() {
		Wait(ElementInputPassword);
		return GetDriver().findElement(ElementInputPassword);
	}

	public WebElement InputConfirmPassword() {
		Wait(ElementConfirmPssword);
		return GetDriver().findElement(ElementConfirmPssword);
	}

	public WebElement InputComments() {
		Wait(ElementComments);
		return GetDriver().findElement(ElementComments);
	}

	public WebElement ButtonSend() {
		Wait(ElementButtonSend);
		return GetDriver().findElement(ElementButtonSend);
	}

//endregion

	//region Texts || Method

	public String GetTextSuccessfullModal() {
		Wait(By.xpath("//button[@class='confirm']"));
		return GetDriver().findElement(ElementGetTextSuccessfullModal).getText();
	}

	public void ClickOnButtonSend(){
		ButtonSend().click();
	}

	public void FillsTheFormOfTheTabSendQuote() {
		InputEmail().sendKeys("qualidade@teste.com");
		InputPhone().sendKeys("11966009868");
		InputUsername().sendKeys("qualiteste");
		InputPassword().sendKeys("Qualidade@12");
		InputConfirmPassword().sendKeys("Qualidade@12");
		InputComments().sendKeys("Automacao de teste do formulario.");
	}

	//endregion

	//region Elements By

	By ElementInputEmail = By.id("email");
	By ElementInputPhone = By.id("phone");
	By ElementInputUsername = By.id("username");
	By ElementInputPassword = By.id("password");
	By ElementConfirmPssword = By.id("confirmpassword");
	By ElementComments = By.id("Comments");
	By ElementButtonSend = By.id("sendemail");
	By ElementGetTextSuccessfullModal = By.xpath("//div[@data-animation='pop']/h2");

	//endregion
}
