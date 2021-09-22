package Tools;

import java.io.File;
import java.io.IOException;

import PageObjects.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    //region String && Webdriver
    public String url;
    public WebDriver webdriver;
    //endregion

    //region  PageObjects

    public PageObjectElementsEnterVehicleData ElementsEnterVehicleData = new PageObjectElementsEnterVehicleData();
    public PageObjectElementsEnterInsurantData ElementsEnterInsurantData = new PageObjectElementsEnterInsurantData();
    public PageObjectElementsEnterProductData ElementsEnterProductData = new PageObjectElementsEnterProductData();
    public PageObjectElementsSelectPriceOption ElementsSelectPriceOption = new PageObjectElementsSelectPriceOption();
    public PageObjectElementsSendQuote ElementsSendQuote = new PageObjectElementsSendQuote();

    //endregion

    //region Methods Chrome && Screenshot
    public void StartChrome() {
        url = "http://sampleapp.tricentis.com/101/app.php";
        webdriver = Tools.DriverFactory.GetDriver();
        webdriver.navigate().to(url);
    }

    public void FinishChrome() {
        webdriver.quit();
        Tools.DriverFactory.KillDriver();
    }

    public void Screeshot(String Scenario) {

        File Folder = new File("target/Screenshot");

        if (!Folder.exists()) {
            Folder.mkdirs();
        }

        File file = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, new File("target/Screenshot/" + Scenario + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//endregion
}
