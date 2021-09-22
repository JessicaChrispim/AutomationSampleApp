package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage extends DriverFactory {

	public WebDriverWait Wait;
	public JavascriptExecutor Js = (JavascriptExecutor) DriverFactory.GetDriver();

	public void Wait(By Element) {

		Wait = new WebDriverWait(DriverFactory.GetDriver(), 10);
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".load-interceptor")));
		Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Element));
		Wait.until(ExpectedConditions.elementToBeClickable(Element));
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".load-interceptor")));
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Element));
		} catch (Exception e) {

		}
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".load-interceptor")));
	}

}