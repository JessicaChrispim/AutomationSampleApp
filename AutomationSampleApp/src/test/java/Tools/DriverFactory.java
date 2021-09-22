package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	private static WebDriver Driver;

	public static WebDriver GetDriver() {
		if (Driver == null) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			ChromeOptions Settings = new ChromeOptions();
			Settings.addArguments("start-maximized");
			Driver = new ChromeDriver(Settings);
		}
		return Driver;

	}

	public static void KillDriver() {
		if (Driver != null) {
			Driver.quit();
			Driver = null;
		}
	}
}
