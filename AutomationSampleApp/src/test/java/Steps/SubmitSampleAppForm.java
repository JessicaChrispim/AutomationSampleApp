package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.junit.*;
import Tools.BaseTest;
import io.cucumber.java.pt.Entao;

public class SubmitSampleAppForm extends BaseTest {


    //region Before
    @Before
    public void StartChromeDriverAcessWebSite() {
        StartChrome();
    }
    //endregion

    //region Given
    @Dado("que estou no site Sample App")
    public void ImOnTheSampleAppSite() {
        Assert.assertEquals(webdriver.getCurrentUrl(), "http://sampleapp.tricentis.com/101/app.php");
    }

    //endregion

    //region When

    @Quando("Preencho o formulario da aba enter Vehicle Data")
    public void FillTheFormOfTheTabDateEnterVehicle() {
        ElementsEnterVehicleData.FillsTheFormOfTheTabDateEnterVehicle();
    }

    @Quando("clico em Next do formulario enter Vehicle Data")
    public void ImClickOnNextOfTheFormEnterVehicleData() {
        ElementsEnterVehicleData.ClickOnButtonNext();
    }

    @Quando("preencho o formulario da aba enter Insurant Data")
    public void FillTheFormOfTheTabDateEnterInsurant() {
        ElementsEnterInsurantData.FillsTheFormOfTabEnterDateInsurant();
    }

    @Quando("clico em Next do formulario enter Insurant Data")
    public void ImClickOnNextOfTheFormEnterInsurantData() {
        ElementsEnterInsurantData.ClickOnButtonNext();
    }

    @Quando("preencho o formulario da aba enter Product Data")
    public void FillTheFormOfTheTabDateEnterProduct() {
        ElementsEnterProductData.FillsTheFormOfTheTabDateEnterProduct();
    }

    @Quando("clico em Next do formulario enter Product Data")
    public void ImClickOnNextOfTheFormEnterProductData() {
        ElementsEnterProductData.ClickOnButtonNext();
    }

    @Quando("preencho o formulario da aba Select Price Option")
    public void FillTheFormOfTheTabSelectPriceOption() {
        ElementsSelectPriceOption.FillsTheFormOfTheTabSelectPriceOption();
    }

    @Quando("clico em Next da aba Select Price Option")
    public void ImClickOnNextOfTheFormSelectPriceOption() {
        ElementsSelectPriceOption.ClickOnButtonNext();
    }

    @Quando("preencho  o formulario da aba Send Quote")
    public void FillTheFormOfTheTabSendQuote() {
        ElementsSendQuote.FillsTheFormOfTheTabSendQuote();
    }

    @Quando("clico em Send da aba Select Send Quote")
    public void ImClickOnNextOfTheFormSendQuote() {
        ElementsSendQuote.ClickOnButtonSend();
    }

    @Quando("Preencho as abas de formularios")
    public void FillTheFormsTabs() {
        ElementsEnterVehicleData.FillsTheFormOfTheTabDateEnterVehicle();
        ElementsEnterVehicleData.ClickOnButtonNext();
        ElementsEnterInsurantData.FillsTheFormOfTabEnterDateInsurant();
        ElementsEnterInsurantData.ClickOnButtonNext();
        ElementsEnterProductData.FillsTheFormOfTheTabDateEnterProduct();
        ElementsEnterProductData.ClickOnButtonNext();
        ElementsSelectPriceOption.FillsTheFormOfTheTabSelectPriceOption();
        ElementsSelectPriceOption.ClickOnButtonNext();
        ElementsSendQuote.FillsTheFormOfTheTabSendQuote();
        ElementsSendQuote.ClickOnButtonSend();
    }

    //endregion

    //region Then
    @Entao("e exibido a mensagem {string}")
    public void TheMessageIsDisplayed(String Message) {
        Assert.assertEquals(ElementsSendQuote.GetTextSuccessfullModal(), Message);
    }
    //endregion

    //region After
    @After(order = 1)
    public void StoreTestEvidence() {
        Screeshot("Validate completing and submitting the from Automobile");
    }

    @After(order = 0)
    public void FinishChromeDriver() {
        FinishChrome();
    }

    //endregion


}
